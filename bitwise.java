// write a java code to understand bitwise operator
public class bitwise
{
    public static void main(String args[])
    {
        //Initial value 
        int a=5;
        int b=7;
//00000000000 0000000 0000000000 000100        
        // bitwise and
        //0101 & 0111=0101 =5"
        System.out.println("a&b=" +(a & b));

        //bitwise or
        System.out.println("a/b="+(a|b));
        
        //bitwise xor
        //0101 xor 0111 = 0010
        System.out.println("a^b="+(a^b));

        //bitwise not 
        //0101=1010
        //0111=1000
        System.out.println("~a="+ ~a);
        System.out.println("~b="+ ~b);
    }
}
