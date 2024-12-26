package unit3;

public class palidrome 
{        
static int reversedNumber(int n)
 {
    int reversed_n=0;
    while(n>0)
    {
       reversed_n=reversed_n*10+n%10;
       n=n/10;
    }
    return reversed_n;
 }
 //main function
 public static void main(String[]args)
 {
    int n=12321;
    int reversedN=reversedNumber(n);
 }

}
