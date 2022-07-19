import java.util.Scanner;

public class rupeesToUsd{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter rupees ");
        int rupees = sc.nextInt();

        int usd = (rupees * 80);
        System.out.println(rupees + " in rupees is equal to " + usd + " in USD");
    }
}