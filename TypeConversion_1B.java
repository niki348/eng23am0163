public class TypeConversion_1B
{
    public static void main (String args[])
    {
        // Widening or Implicit conversion
        // Byte to Int
        byte byteValue = 10;
        int intValue = (int) byteValue;
        System.out.println("Byte to Int: "+intValue);

        // Narrowing or Explicit conversion
        // Double to Float
        double doubleValue = 9.8677777777;
        float floatValue = (float) doubleValue;
        System.out.println("Double to Float: "+floatValue);

        // Int to Byte
        int largeIntValue = 140;
        byte byteValue1 = (byte)largeIntValue;
        System.out.println("Int to Byte: "+byteValue1);
    }
}