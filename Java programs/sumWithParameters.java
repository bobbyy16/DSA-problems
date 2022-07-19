import java.util.Scanner;

public class sumWithParameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name");
        String name = sc.next();
        String personalized = greet(name);
        System.out.println(personalized);
    }

    static String greet(String name){
        String myGreet = "Hello " + name;
        return myGreet;
    }
}
