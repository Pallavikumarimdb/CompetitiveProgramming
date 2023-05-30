package Recursion;

import java.util.*;
import java.lang.*;

public class SpecialFibonacci {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[3*n];
        for(int i=0; i<3*n; i++){
            arr[i]=sc.nextInt();

        }
        for (int i=0;  i<arr.length;){
            System.out.println(specialFebo(arr[i+2],arr[i],arr[i+1]));
            i+=3;
        }
    }
    public static int specialFebo(int n, int a, int b){
        if(n==1){
            return b;
        }
        if(n==0){
            return a;
        }
        return specialFebo(n-1, a, b)^specialFebo(n-2, a, b);
    }
}
