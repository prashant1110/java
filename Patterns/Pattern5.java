class InnerPattern5 {
    public static void test(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern5 {
    public static void main(String[] args) {
        InnerPattern5 p = new InnerPattern5();
        p.test(5);
    }
}
