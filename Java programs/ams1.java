import java.util.*;

public class ams1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int temp = num;
        int rem , sum = 0;

        while(num > 0){
            rem = num % 10;
            num = num/10;
            sum = sum + rem*rem*rem;
        }

        if(temp == sum){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not an Armstrong");
        }
    }
}
