public class matrix{
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {11,23,34,45},
            {28,29,37,49},
            {33,34,38,60}
        };

        int target = 20;
        int[] ans = search(arr, target);
        System.out.println(ans);
    }

    static int[] search(int[][] matrix, int target){

        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
        }

        return new int[]{-1,-1};
    }
}