package Arrays.Array;

public class maximunInRange {
    public static void main(String[] args) {
        int[] arr = {223,45,67,92,1};

        System.out.println(max(arr, 1, 4));
    }

    static int max(int[] arr, int i1, int i2){
        int maxVal = arr[i1];

        for(int i = i1; i <= i2; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
