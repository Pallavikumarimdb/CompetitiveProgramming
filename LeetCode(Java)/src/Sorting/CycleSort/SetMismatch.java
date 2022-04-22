package Sorting.CycleSort;
//
//https://leetcode.com/problems/set-mismatch/
//645. Set Mismatch


import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = {8,7,3,5,3,6,1,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] nums) {

        int[] arr=new int[2];
        int i=0;
        while(i<nums.length){

            int correctPos = nums[i]-1;

            if(nums[i]!=nums[correctPos]){
                swap(nums, i, correctPos);
            }else{
                i++;
            }

        }
        for(int j=0; j<nums.length; j++){

            if(nums[j]!=j+1){
                arr[0]=nums[j];
                arr[1]=j+1;
                return arr;
            }
        }

        return new int[]{-1, -1};
    }

    public static void swap(int[] arr, int f, int l){
        int temp=arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}
