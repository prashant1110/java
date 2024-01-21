class InnerPattern13 {
    public static void test(int n) {
        int start = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }
}

public class Pattern13 {
    public static void main(String[] args) {
        InnerPattern13 p = new InnerPattern13();
        p.test(5);
    }
}
