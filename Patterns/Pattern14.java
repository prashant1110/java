class InnerPattern14 {
    public static void test(int n) {
        for (int i = 0; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class Pattern14 {
    public static void main(String[] args) {
        InnerPattern14 p=new InnerPattern14();
        p.test(5);
    }
}
