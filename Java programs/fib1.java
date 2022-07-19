import java.util.*;

public class fib1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int a = sc.nextInt();

        int num1 = 0;
        int num2 = 1;
        int num3;

        for(num3 = 0; num3 <= a; num3++){
            num3 = num1 + num2; //1    1+0=1
            num2 = num1;        //0    1
            num1 = num3;        //1    1
            System.out.println(num3);
        }
    }
}
