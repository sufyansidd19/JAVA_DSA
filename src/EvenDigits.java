public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(numbers(arr));
    }
    static int numbers(int [] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (even(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int even=digits(num);
        return even%2==0;
    }
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
