package Recursion;
import java.util.*;
import java.lang.*;

public class GeekOnacciNumber {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[4*n];
        for(int i=0; i<4*n; i++){
            arr[i]=sc.nextInt();

        }
        for (int i=0;  i<arr.length;){
            System.out.println(febo(arr[i+3], arr[i], arr[i+1], arr[i+2]));
            i+=4;
        }


    }


    public static int febo(int n, int a, int b, int c){
        if(n==1){
            return a;
        }
        if(n==2){
            return b;
        }
        if(n==3){
            return c;
        }
        return febo(n-1, a, b, c)+febo(n-2, a, b, c)+febo(n-3, a, b, c);

    }
}
