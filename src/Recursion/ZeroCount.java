package Recursion;

public class ZeroCount {
    public static void main(String[] args) {
        countZero(10400450);
        System.out.println(sum);
    }
    static int sum=0;
    static void countZero(long n){
        if (n==0){
            return;
        }
        long rem=n%10;
        if (rem==0){
           sum=sum+1;
        }
        countZero(n/10);
    }
}
