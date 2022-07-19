import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number1 ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2 ");
        int number2 = sc.nextInt();

        if(number1 < number2){
            System.out.println(number2 + " is greater than " + number1);
        }else {
            System.out.println(number1 + " is greater than " + number2);
        }
    }
}
