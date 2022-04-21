package Sorting.CycleSort;
import java.util.*;

//442. Find All Duplicates in an Array
//https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class Find_All_Duplicates_in_an_Array {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

        public static List<Integer> findDuplicates(int[] nums) {

            int i=0;
            List<Integer> list = new ArrayList<>();
            while(i<nums.length){

                int correctPos=nums[i]-1;

                if(nums[i] != nums[correctPos]){
                    swap(nums, i, correctPos);
                }
                else{
                    i++;
                }
            }
            for(int j=0; j<nums.length; j++){
                if(nums[j]!=j+1){
                    list.add(nums[j]);
                }
            }
            return list;
        }

        public static void swap(int[] arr, int first, int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }

}
