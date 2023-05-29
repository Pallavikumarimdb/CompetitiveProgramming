package Recursion;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNo(3378));
    }

    static boolean primeNo(int n) {
        return helper(n, n/2+1);
    }

    public static boolean helper(int n, int prime){
        if(prime==1){
            return true;
        }
        if(n%prime==0 || n==1 || n==0){
            return false;
        }
        return helper(n, prime-1);
    }


}
