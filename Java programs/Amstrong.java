import java.util.Scanner;

public class Amstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter the number ");
        int num = sc.nextInt();

        int original = num;

        int r,sum=0;

        while(num > 0){
            r = num % 10;
            num = num/10;
            sum = sum + r*r*r;
        }
        if(original == sum){
            System.out.println("Armstorng number");
        }
        else {
            System.out.println("not an armstrng number");
        }
    }
}