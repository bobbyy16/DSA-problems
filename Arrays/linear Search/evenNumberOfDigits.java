public class evenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));

    }
    static int findNumbers(int[] arr){
        int count = 0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int arr){
        int numDigits = digits(arr);
        return numDigits % 2 == 0;
    }

    static int digits(int arr){

        if(arr < 0){
            arr = arr * -1;
        }

        if(arr == 0){
            return 1;
        }

        int count = 0;
        while(arr > 0){
            count++;
            arr = arr/10;
        }
        return count;
    }
}
