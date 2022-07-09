public class Main {

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


    }


}
