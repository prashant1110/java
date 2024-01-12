//main class
class Calculator {
    static int add(int a, int b) {
        int result = a + b;
        return result;

    }

    static String test() {
        return "Hello World";
    }
}

class Bulb {

    static String name;
    static int price;

    static void set(String n, int p) {
        name = n;
        price = p;
    }

    static void get() {
        System.out.println("company name " + name);
        System.out.println("Price is " + price);
    }
}

public class Classes {

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        int result = obj.add(10, 30);
        System.out.println(result);

        String str = obj.test();
        System.out.println(str);

        Bulb b=new Bulb();
        b.set("philio", 100);
        b.get();
    }
}
