import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.println("After Swapping with index");
        swap(arr, 1, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println("After reversing the whole Array");
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr){
       int start = 0;
       int end = arr.length - 1;

       while(start < end){
        swap(arr, start, end);
        start++;
        end--;
       }
    } 

    static void swap(int []arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
