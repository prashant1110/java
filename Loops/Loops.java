class Loops {
    public static void main(String[] args) {

        // if statment
        int num = 10;

        if (num == 10) {
            num++;
            // System.out.println("Number is correct " + num);
            // return;
        }
        // System.out.println("Number is not correct");

        // if-else
        int num1 = 10;
        if (num1 % 2 == 0) {
            // System.out.println(num1 + " is a even number");
        } else {
            // System.out.println(num1+ " is a prime number");
        }

        // For loop
        int num2 = 0;
        for (int i = 0; i <= 20; i++) {
            num2 = num2 + i;
        }
        // System.out.println(num2);

        // Nested For loop
        // refer the logic
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                // System.out.print(j + " ");
            }
            // System.out.println();

        }

        // For each loop
        String names[] = { "Prashant", "Rahul", "Rohit", "Shyam" };

        for (String x : names) {
            System.out.println(x);
        }

        // While loop

        int i = 1, sum = 0;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        // System.out.println(sum);

        // Do while loop

        do {
            sum = sum + i;
            i++;
        } while (i <= 10);
        System.out.println(sum);

    }
}