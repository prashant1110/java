class InnerPattern11 {

    static void test(int n) {
        int start = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                start = 1;
            else
                start = 0;
            for (int j = 1; j <= i; j++) {

                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
}

public class Pattern11 {
    public static void main(String[] args) {
        InnerPattern11 p = new InnerPattern11();
        p.test(5);
    }
}
