import javax.crypto.Mac;

public class findMax{
    public static void main(String[] args) {
        int[] arr = {1,23,45,87,-23,89};
        int ans = max(arr);
        System.out.println(ans);
    }

    static int max(int arr[]){
        if(arr.length == 0){
            return -1;
        }

        int maxVal = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];  
            }
        }
        return maxVal;
    }
}