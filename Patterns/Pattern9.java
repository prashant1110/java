class InnerPattern7 {
    public static void triangle(int n) {
        for (int i = 0; i < n; i++) {
            // for space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // for space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void invertedTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // for space
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                System.out.print("*");
            }

            // for space
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class Pattern9 {
    public static void main(String[] args) {
        InnerPattern7 p = new InnerPattern7();
        p.triangle(5);
        p.invertedTriangle(5);
    }
}
