class InnerPatten8 {
    public static void test(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class Patten8 {
    public static void main(String[] args) {
        InnerPatten8 p=new InnerPatten8();
        p.test(5);
    }
}
