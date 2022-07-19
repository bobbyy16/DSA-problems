
// Smallest element in a array greater than or equal to target

public class ceilingOf_a_Number {
    public static void main(String[] args) {
        int[] arr = {-200,-1, 45,56,77,86,561,789};
        int target = 790;

        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    // return the index of smallest no >= target
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;


        // if the target is greater than greatest element in an array
        if(target > arr[arr.length - 1]){
            return -1;
        }


        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end =mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
