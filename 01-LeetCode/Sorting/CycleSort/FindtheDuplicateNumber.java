package Sorting.CycleSort;

//     https://leetcode.com/problems/find-the-duplicate-number/
//     287. Find the Duplicate Number

public class FindtheDuplicateNumber {

    public static void main(String[] args) {
        int[] arr ={1,3,4,2,2};
        System.out.println(findDuplicate(arr));

    }

    public static int findDuplicate(int[] nums) {

        int i=0;
        while(i<nums.length){
            int correctPos=nums[i]-1;

            if(nums[i]!=i+1){
                if(nums[i]!=nums[correctPos]){
                    swap(nums, i, correctPos);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;

    }

    public static void swap(int[] arr, int i, int correctPos){
        int temp=arr[i];
        arr[i]=arr[correctPos];
        arr[correctPos]=temp;
    }
}

