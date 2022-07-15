public class PrimitiveTypes {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        //overflow happened due to too large a number into the space allocated by the computer for an integer

        System.out.println("Busted MIN value = " + (myMinIntValue - 1));
        //underflow happened due to number being smaller than the minimum value

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        // L is needed after the number to assign it as a long data type, otherwise it will be an int
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);
//        byte myNewByteValue = (myMinByteValue / 2);
        // receives an error, needs to be casted into a byte

        //Casted or converted into another type
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);


        // Primitive Types Challenge
        byte num1 = 100;
        short num2 = 30_000;
        int num3 = 1_539_632_825;
        long num4 = 50_000L + (10L * (num1 + num2 + num3));

        System.out.println(num4);


        //Float and Double Primitive Types

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 /3;
        float myFloatValue = 5F / 3F;
        double myDoubleValue = 5D / 3D;

        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);


        // Float and Double Challenge

        // 1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms.
        // 2. Calculate the result i.e. the number of kilograms based on the contents of the variable above and store the result in a 2nd appropriate variable.
        // 3. Print out the result.
        // Hint: 1 pound is equal to 0.45359237 of a kilogram.

        double poundsToConvert = 256D;
        double poundsConvertedToKilos = poundsToConvert * 0.45359237D;
        System.out.println("Converted pounds to kilograms = " + poundsConvertedToKilos);

        //Another way to use underscore instead of commas
        double pi = 3.1_415_927D;
        System.out.println(pi);


        // Char and Boolean Primitive Data Types

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;




    }


}
