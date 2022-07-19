import java.util.Scanner;

public class linerSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array elements");
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key ");
        int key = sc.nextInt();
        
        int ans = linear(arr, key);
        System.out.println("Key found at index " + ans);

    }

    static int linear(int[] arr, int key){
            for(int i = 0; i < arr.length; i++){
            int ele = arr[i];
            if(ele == key){
                return i;
            }
        }
        return -1;    
    }
}