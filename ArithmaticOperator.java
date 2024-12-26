//write a java code to understand arithmatic operator by using switch statement 
import java.util.*;
public class ArithmaticOperator
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("1 for addition\n"+(a+b));
        sc.close();
        
    }
}