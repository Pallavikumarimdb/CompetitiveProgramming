package Recursion;

public class SumofDigitofaNumber {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(45632));
    }

    public static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem+sumOfDigit(n/10);
    }
}
