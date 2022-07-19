public class richestCommonWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {2, 5},
            {5,6,7,8,2}
        };
        int ans = maximumWealth(arr);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                 sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
