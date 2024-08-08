package Arrays;

import java.util.ArrayList;

public class find {
    public static void main(String[] args) {
        int [] arr={5,6,7,9,4,9,10,9,12};
        int target=9;
        System.out.println(get(arr,target,0));
        System.out.println(findIndex(arr,target,0));
        System.out.println(findIndexLast(arr, target,arr.length-1));
        findAllIndex(arr,target,0);
        System.out.println(list);
        System.out.println(findAllIndexReturn(arr,target,0,new ArrayList<>()));
    }
    static boolean get(int [] arr , int target , int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || get(arr,target,index+1);
    }
    static int findIndex(int [] arr, int target , int index){
        if (index==arr.length) {
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr,target,index+1);
        }
    }
    static int findIndexLast(int [] arr, int target , int index){
        if (index==-1) {
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        else{
            return findIndexLast(arr,target,index-1);
        }
    }

    static ArrayList<Integer> list= new ArrayList<>();
    static void findAllIndex(int [] arr, int target , int index){
        if (index==arr.length) {
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
// if its mention that return type should be list and no outer list

    static ArrayList<Integer> findAllIndexReturn(int [] arr, int target , int index , ArrayList<Integer> list){
        if (index==arr.length) {
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        return findAllIndexReturn(arr,target,index+1,list);
    }
}
