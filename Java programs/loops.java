import java.util.Scanner;

public class loops{
    public static void main(String[] args) {
        // print numbers from 1 to 10
        for(int num = 1; num <= 10; num++){
            System.out.println(num);
        }

        // print numbers from 1 to n

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int i;
        for(i = 1; i <= n; i++){
            System.out.println(i);
        }
        System.out.println("============================================================================");
        // while loop
        // print 1 to 5 in while loop
        int ii = 1;
        while(ii <= n){
            System.out.println(ii);
            ii++;
        }

        System.out.println("============================================================================");
        // print 1 to n in do while loop
        int num3 = 1;
        do{
            System.out.println(num3);
            num3++;
        }while(num3 <= n);
    }
}