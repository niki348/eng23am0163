public class BitShiftoper 
{
    public static void main(String[] args)
    {
        int a=- 10; // 10 in binary is 1000

        //Left shift operator <<
        System.out.println("Left Shift(a<<2):" +(a<<2)); //8<<2=32 (1000 becomes 100000)

        //Right Shift operator
        System.out.println("Right shift(a>>2):"+(a>>2)); //8>>2=2(1000 becomes 10)

        //Unsigned Right Shift operator
        int b=-2;                                                                   
        System.out.println("Unsigned Right shift(b>>>2):"+(b>>>2)); //-16>>>2 will shift bits to right 
    }
    
}
