import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    private static final int MAX_TRIES = 10;
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static int numberToGuess;
    private static int userGuess;
    private static int attemptsLeft;

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 100. Try to guess it!");

        // Initialize game state
        resetGame();
        playGame();
    }

    // Method to reset game variables for a new round
    private static void resetGame() {
        Random rand = new Random();
        numberToGuess = rand.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE; // Random number between 1 and 100
        attemptsLeft = MAX_TRIES;
    }

    // Method to play the game
    private static void playGame() {
        Scanner scanner = new Scanner(System.in);
        
        while (attemptsLeft > 0) {
            System.out.println("\nYou have " + attemptsLeft + " attempts left.");
            System.out.print("Enter your guess: ");
            
            // Get the user's guess
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();  // Clear the invalid input
            }
            userGuess = scanner.nextInt();

            // Check if the guess is correct
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the correct number.");
                System.out.println("It was " + numberToGuess + "!");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            attemptsLeft--;
        }

        // If the game ends without the user guessing correctly
        if (attemptsLeft == 0) {
            System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess + ".");
        }

        // Ask the player if they want to play again
        playAgain();
    }

    // Method to ask if the user wants to play again
    private static void playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDo you want to play again? (yes/no): ");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("yes") || response.equals("y")) {
            resetGame(); // Reset the game state
            playGame();  // Start a new round
        } else {
            System.out.println("Thanks for playing! Goodbye!");
        }
    }
}
