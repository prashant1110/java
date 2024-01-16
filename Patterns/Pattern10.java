class InnerPattern10 {
    public static void patterns(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedPatterns(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j <= n; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

public class Pattern10 {
    public static void main(String[] args) {
        InnerPattern10 p=new InnerPattern10();
        p.patterns(4);
        p.invertedPatterns(4);
    }
}
