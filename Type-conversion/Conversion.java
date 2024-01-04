public class Conversion {
    /*
     * Byte->short->integer->Long->float->double
     * 
     * conversion can be done only in right direction
     * means byte can be converted to short,int
     * 
     * conversion only done smaller to greater type.
     */

    public static void main(String[] args) {

        // Automatic conversion (small to large)
        byte num1 = 14;

        int num = num1;
        float num2 = num1;

        System.out.println(num);
        System.out.println(num2);

        // Explicit conversion  (large to small)

        double number = 155.55;

        float number1 = (float) number;
        int number2 = (int) number;

        System.out.println(number1);
        System.out.println(number2);

    }
}
