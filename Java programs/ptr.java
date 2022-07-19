import java.util.Scanner;

public class ptr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Principle ");
        int principle = sc.nextInt();
        System.out.print("Enter time ");
        int time = sc.nextInt();
        System.out.print("Enter Rate ");
        int rate = sc.nextInt();

        int simpleInterest = (principle*time*rate)/100;

        System.out.println("Simple interest = " + simpleInterest);
    }
}
