package Arrays.Array;

public class searchInrange {
    public static void main(String[] args) {
        int[] arr = {1,23,45,87,-23,89};
        int ans = range(arr, -23, 3, 5);
        System.out.println(ans);
    }

    static int range(int[] arr, int target,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        
        for(int i = start; i < end; i++){
            int ele = arr[i];
            if(ele == target){
                return i;
            }
        }
        return -1;
    }

}
