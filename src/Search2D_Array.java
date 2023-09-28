import java.util.Arrays;

public class Search2D_Array {
    public static void main(String[] args) {
        int [][] arr={ {1,2,3},
                      {4,5,6},
                      {7,8,9}
                        };
        int target=1;
        int [] ans=Search2D(arr , target);
        System.out.println(Arrays.toString(ans));
        int ans1=max(arr);
        System.out.println(ans1);
    }
    public static int[] Search2D(int[][] arr, int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0; col< arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
