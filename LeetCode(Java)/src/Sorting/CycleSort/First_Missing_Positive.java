package Sorting.CycleSort;

//https://leetcode.com/problems/first-missing-positive/
//// 41. First Missing Positive

public class First_Missing_Positive {

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] nums) {

        int i=0;
        while(i<nums.length){

            int correctPos = nums[i]-1;

            if(nums[i]>0 && nums[i]<=nums.length  && nums[i]!=nums[correctPos]){
                swap(nums, i, correctPos);
            }else{
                i++;
            }

        }
        for(int j=0; j<nums.length; j++){
            if( nums[j]!=j+1){
                return j+1;
            }

        }

        return nums[nums.length-1]+1;
    }

    public static void swap(int[] arr, int f, int l){
        int temp=arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}
