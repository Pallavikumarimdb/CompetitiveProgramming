package Sorting;
import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums={1,1,1,3,3,4,3,2,4,2};
        System.out.println(containDuplicate(nums));

    }

    public static boolean containDuplicate(int[] nums){
        Arrays.sort(nums);
        // boolean b;
        // for(int i=0; i<nums.length; i++){
        //     b=false;
        //     for(int j=0; j<nums.length-i-1; j++){
        //         if(nums[j]>nums[j+1]){
        //             int temp=nums[j];
        //             // System.out.println(temp+" "+i);
        //             nums[j]=nums[j+1];
        //             nums[j+1]=temp;
        //             b=true;
        //         }
        //     }
        //     if(!b){
        //         break;
        //     }
        // }
        // // System.out.println(Arrays.toString(nums));
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }

        return false;

    }
}


