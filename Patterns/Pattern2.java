class InnerPattern2 {
    public static void test(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern2 {
    public static void main(String[] args) {
        InnerPattern2 p = new InnerPattern2();
        p.test(5);
    }
}
