package Recursion;

public class Palindrome {
    //    Method no 1
    static int sum=0;
    static void Rev1(int n){
        if (n==0){
            return;
        }
        int rem=n%10;
        sum= sum * 10 + rem;
        Rev1(n/10);
    }
    //    Method no 2
//    if we don't want to use the outside variable
    static int Rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n , int digits){
        if(n%10==n){
            return n;
        }
        int rem =n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    static boolean palin(int n){
        return n==Rev2(n);
    }
    public static void main(String[] args) {
//        Rev1(9754);
//        System.out.println(Rev2(9754));
        System.out.println(palin(123321));
//        System.out.println(sum);
    }

}
