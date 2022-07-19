import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        int original = number;
        int reverse = 0;

        while(number!=0){
         reverse =  reverse*10 + number%10;
         number = number/10;
        }
        if(original == reverse){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not a palindrome number");
        }

    }
}
 