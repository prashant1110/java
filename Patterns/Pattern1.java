class InnerPattern1 {

    public static void test(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

public class Pattern1 {

    public static void main(String[] args) {
        InnerPattern1 p = new InnerPattern1();
        p.test(4);
    }
}
