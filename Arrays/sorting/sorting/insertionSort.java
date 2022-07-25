package Arrays.sorting.sorting;
import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,5,69,0,32,1,-2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i ; j++) {
                if(arr[j] < arr[j - 1]){  //arr[j] is 1 index and arr[j - 1] is 0th index at 1st interation
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
