class InnerPattern6 {
    public static void test(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(n - j + 1 + " ");
            }
            System.out.println();
        }
    }
}

public class Pattern6 {
    public static void main(String[] args) {
        InnerPattern6 p = new InnerPattern6();
        p.test(5);
    }
}
