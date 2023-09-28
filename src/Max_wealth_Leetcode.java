

public class Max_wealth_Leetcode {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        System.out.println(MaxWealth(arr));
    }
    static int MaxWealth(int [][] arr){
        int ans=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (ans < sum) {
                ans = sum;
            }
        }
        return ans;
    }
}
