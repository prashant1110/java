//main class
class Calculator {
    static int add(int a, int b) {
         int result=a + b;
         return result;
        
    }

    static String test(){
        return "Hello World";
    }
}

public class Classes {

    public static void main(String[] args) {
        Calculator obj=new Calculator();

        int result=obj.add(10, 30);
        System.out.println(result);

        String str=obj.test();
        System.out.println(str);
    }
}
