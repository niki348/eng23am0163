// if we write a program without scanning then its called compilation time program
// Package used to run java programs JDK java development kit
public class PrimitiveTypesExample_1A
{
    public static void main(String args[])
    {
        //Integer types 
        byte byteVar = 127; // 8 bit signed integer
        short shortVar = 32767; // 16 bit signed integer
        int intVar = 2147483647; // 32 bit signed integer
        long longVar = 9223372036854775807L; // 64 bit signed integer (note the 'L' suffix)

        //FLoating point types
        float floatVar = 3.13159265f; // 32 bit floating point
        double doubleVar = 3.141592653589793; // 64 bit floating point

        // Character types
        char charVar = 'A'; // 16 bit Unicode character

        // Boolean type
        boolean booleanVar = true; // represents true or false

        // Output
        System.out.println("byteVar : "+byteVar);
        System.out.println("shortVar : "+shortVar);
        System.out.println("intVar : "+intVar);
        System.out.println("longVar : "+longVar);
        System.out.println("floatVar : "+floatVar);
        System.out.println("doubleVar : "+doubleVar);
        System.out.println("charVar : "+charVar);
        System.out.println("booleanVar : "+booleanVar);
    }
}