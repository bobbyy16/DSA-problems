import java.util.Scanner;

public class CountingOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int rem;
        int count = 0;
        while(num > 0){
            rem = num%10;
            if(rem == 3){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
