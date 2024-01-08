import java.util.Scanner;

class IO {
    public static void main(String[] args) {

        //Scanner input classs
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        char character = sc.next().charAt(0);

        int age = sc.nextInt();

        // System.out.println("Name: " + name);
        // System.out.println("Char: " + character);
        // System.out.println("age: " + age);

        //To check if the next input is of same type

        int sum=0,count=0;

        while (sc.hasNextInt()) {
            int num=sc.nextInt();
            sum+=num;
            count++;
        }
        if (count>0) {
            int means=sum/count;
            System.out.println("Mean "+ means);
        }
        else{
            System.out.println("nothing");
        }
    }
}