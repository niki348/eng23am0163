import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class SnakeGame {

    // Constants for the game area
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;

    // Game variables
    private static int score = 0;
    private static boolean gameOver = false;

    // Snake properties
    private static LinkedList<Point> snake = new LinkedList<>();
    private static Direction currentDirection = Direction.RIGHT;

    // Food properties
    private static Point food;

    // Main method to start the game
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeGame();

        while (!gameOver) {
            printGameBoard();
            processUserInput(scanner);
            updateGameState();
            try {
                Thread.sleep(100); // Speed of the snake
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Game Over! Your score is: " + score);
        scanner.close();
    }

    // Initialize the game state
    private static void initializeGame() {
        // Initial snake (starting with 3 segments)
        snake.clear();
        snake.add(new Point(5, 5));
        snake.add(new Point(4, 5));
        snake.add(new Point(3, 5));

        // Place food randomly
        placeFood();

        // Reset score and game over state
        score = 0;
        gameOver = false;
    }

    // Print the game board
    private static void printGameBoard() {
        // Clear the console (platform-dependent)
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Print the top border
        for (int i = 0; i < WIDTH + 2; i++) {
            System.out.print("#");
        }
        System.out.println();

        // Print the game area
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if (x == 0 || x == WIDTH - 1) {
                    System.out.print("#");
                } else if (y == food.y && x == food.x) {
                    System.out.print("F");
                } else if (isSnakePosition(x, y)) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Print the bottom border
        for (int i = 0; i < WIDTH + 2; i++) {
            System.out.print("#");
        }
        System.out.println();

        // Print the score
        System.out.println("Score: " + score);
    }

    // Check if a given point is part of the snake
    private static boolean isSnakePosition(int x, int y) {
        for (Point p : snake) {
            if (p.x == x && p.y == y) {
                return true;
            }
        }
        return false;
    }

    // Process user input (change direction)
    private static void processUserInput(Scanner scanner) {
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            switch (input.toUpperCase()) {
                case "W":
                    if (currentDirection != Direction.DOWN) currentDirection = Direction.UP;
                    break;
                case "S":
                    if (currentDirection != Direction.UP) currentDirection = Direction.DOWN;
                    break;
                case "A":
                    if (currentDirection != Direction.RIGHT) currentDirection = Direction.LEFT;
                    break;
                case "D":
                    if (currentDirection != Direction.LEFT) currentDirection = Direction.RIGHT;
                    break;
            }
        }
    }

    // Update the game state (move snake, check for collisions)
    private static void updateGameState() {
        Point head = snake.getFirst();
        Point newHead = new Point(head.x, head.y);

        // Move the snake's head in the current direction
        switch (currentDirection) {
            case UP:
                newHead.y--;
                break;
            case DOWN:
                newHead.y++;
                break;
            case LEFT:
                newHead.x--;
                break;
            case RIGHT:
                newHead.x++;
                break;
        }

        // Check for collisions with walls
        if (newHead.x < 0 || newHead.x >= WIDTH || newHead.y < 0 || newHead.y >= HEIGHT) {
            gameOver = true;
            return;
        }

        // Check for collisions with the snake's body
        if (isSnakePosition(newHead.x, newHead.y)) {
            gameOver = true;
            return;
        }

        // Add new head to the snake
        snake.addFirst(newHead);

        // Check if the snake eats food
        if (newHead.x == food.x && newHead.y == food.y) {
            score += 10;
            placeFood();  // Place new food
        } else {
            // Remove the tail of the snake (move the snake)
            snake.removeLast();
        }
    }

    // Place food randomly on the board
    private static void placeFood() {
        Random rand = new Random();
        int x, y;

        do {
            x = rand.nextInt(WIDTH - 2) + 1;  // Between 1 and WIDTH-2
            y = rand.nextInt(HEIGHT - 2) + 1; // Between 1 and HEIGHT-2
        } while (isSnakePosition(x, y)); // Ensure food is not placed on the snake

        food = new Point(x, y);
    }

    // Direction enumeration (UP, DOWN, LEFT, RIGHT)
    private enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    // Point class to represent coordinates on the game board
    private static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
