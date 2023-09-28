// Floor is the largest number which is smaller than the target number
public class floor {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7,8,9,10};
        int target=6;
        System.out.println(floorFunction(arr,target));
    }
    public static int floorFunction(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        // what if the target number is last of the element of arr array
        if(target>arr[arr.length-1]){
            return -1;
        }
        while (start<=end){
            int mid=start+(end-start)/2; //it is because (start+end)/2 not exceed the limit of int
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }return end;
    }
}
