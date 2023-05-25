package Recursion;

public class ProductofDigitofaNumbers {
    public static void main(String[] args) {
        System.out.println(productOfDigit(234));
    }

    public static int productOfDigit(int n){
        if(n<=1){
            return 1;
        }
        int rem=n%10;
        return rem*productOfDigit(n/10);
    }
}
