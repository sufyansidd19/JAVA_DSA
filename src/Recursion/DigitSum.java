package Recursion;

public class DigitSum {
    public static void main(String[] args) {
        int ans = DSum(4567);
        System.out.println(ans);
    }
    static int DSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n%10 + DSum(n/10);
    }
    }

