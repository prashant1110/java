class InnerPattern15 {
    public static void test(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(n - j + 1 + " ");
            }
            System.out.println();
        }
    }

}

public class Pattern15 {
    public static void main(String[] args) {
        InnerPattern15 p = new InnerPattern15();
        p.test(5);
    }
}
