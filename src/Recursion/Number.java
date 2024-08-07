package Recursion;

public class Number {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
        // This is the last function call so this is Tail Recursion
    }
}
