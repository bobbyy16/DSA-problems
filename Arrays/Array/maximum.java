package Arrays.Array;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5, 6, 10, 76, 67};

        System.out.println(max(arr));
    }

    static int max(int[] arr){

        int maxVal = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
