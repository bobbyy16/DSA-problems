// greatest element in a array smaller than or equal to target
public class floorOf_a_Number {
    public static void main(String[] args) {
        int[] arr = {-200,-1, 45,56,77,86,561,789};
        int target = -300;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return the index: greatest number <= target
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end =mid - 1;
            }else if(target > arr[mid]){
                start =mid + 1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
