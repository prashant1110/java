class InnerPattern10 {
    public static void patterns(int n) {
        for (int i = 1; i <= 2 * n; i++) {

            int stars = i;

            if (i > n)
                stars = 2 * n - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

public class Pattern10 {
    public static void main(String[] args) {
        InnerPattern10 p = new InnerPattern10();
        p.patterns(4);

    }
}
