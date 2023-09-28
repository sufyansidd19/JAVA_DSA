

public class Main {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10,11};
//        int target1 = 6;
//        int ans=LinearSearch(arr , target1);
//        System.out.println(ans);
        int target2 = 7;
        int ans1=LinearSearchRange(arr, target2 ,0, 9);
        System.out.println(ans1);
    }
//    static int LinearSearch(int [] arr , int target1){
//        if (arr.length==0){
//            return -1;
//        }
//        for(int i=0;i<arr.length;i++){
//            if(target1==arr[i]){
//                return i;
//            }
//        }
//        return -1;
//    }

    static int LinearSearchRange(int [] arr , int target2 ,int start, int end){
        if (arr.length==0){
            return -1;
        }
        for(int i = start; i<=end; i++){
            if(arr[i]==target2){
                return i;
            }
        }
        return -1;
}
}