package Recursion;

public class ArrayIsSorted {

    public static void main(String[] args) {
        int n=13;
        int[] arr = {324, 432, 149, 9, 136, -25, 60, 173, 90, 484, 377, 407, 166};
        System.out.println(arraySortedOrNot(arr, n));
    }
    public static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        if(n==1){
            return true;
        }
        if(arr[n-1]>=arr[n-2]){
            return arraySortedOrNot(arr, n-1);
        }else{
            return false;
        }
    }
}
