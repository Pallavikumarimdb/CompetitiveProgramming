package Recursion;

//https://www.geeksforgeeks.org/sum-triangle-from-array/

/*

Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then,
at each level number of elements is one less than the previous level and elements at the level is to be the Sum of consecutive
two elements in the previous level.

Input : A = {1, 2, 3, 4, 5}
Output : [48]
         [20, 28]
         [8, 12, 16]
         [3, 5, 7, 9]
         [1, 2, 3, 4, 5]

 */

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {

        int[] arr={436, 139, 357, 440, 60, 374, 214, 437, 264};
        sumTriangle(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sumTriangle(int[] arr){
        if(arr.length==1){
            return ;
        }
        int[] num=new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            num[i]=arr[i]+arr[i+1];
        }
        sumTriangle(num);
        System.out.println(Arrays.toString(num));
    }
}
