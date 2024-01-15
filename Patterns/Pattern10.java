class InnerPattern10 {
    public static void test(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}

public class Pattern10 {
    public static void main(String[] args) {
        InnerPattern10 p=new InnerPattern10();
        p.test(4);
    }
}
