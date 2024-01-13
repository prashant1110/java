class InnerPattern3 {
    public static void test(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

public class Pattern3 {
    public static void main(String[] args) {
        InnerPattern3 p = new InnerPattern3();
        p.test(5);
    }
}
