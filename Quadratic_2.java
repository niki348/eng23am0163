//write a java program that prints all real solutions to the quadratic equations ax2 + bx + c =0, Read in a, b, c and use the quadratic formula c
import java.util.*;
public class Quadratic_2
{
    public static void main (String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b, c;
            double root1, root2;
            System.out.println("Enter the coefficients of x^2, x and 1: ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            double d = b*b - (4*a*c);
            System.out.println("Disciminant = "+d);
            if (d>0)
            {
                System.out.println("Roots are real and distinct. ");
                root1 = (-b + Math.sqrt(d))/(2*a);
                root2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("Root 1 = "+root1);
                System.out.println("Root 2 = "+root2);
            }
            else if (d==0)
            {
                System.out.println("Roots are real and equal. ");
                root1 = -b/(2*a);
                System.out.println("Root 1 = "+root1);
                System.out.println("Root 2 = "+root1);
            }
            else 
            {
                System.out.println("Roots are imaginary and complex. ");
                root1 = -b/(2*a);
                root2 = Math.sqrt(Math.abs(d))/(2*a);
                System.out.println("Root 1 = "+root1 + " + i"+root2);
                System.out.println("Root 2 = "+root1 + " - i"+root2);
            }
        }
    }
}// note Math. is a class defined in SubPackage util which has many methods like min, max, avg, sqrt, abs3
