import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;
        for(c = 2; c<=n; c++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(b);
        }
    }
}
