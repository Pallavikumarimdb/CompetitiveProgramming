package Sorting.CycleSort;
import java.util.*;

public class FindAllNumbersDisappearedinanArray {

    public static void main(String[] args) {
        int[] arr ={7,6,4,2,3,5,7,1};
        System.out.println(findDisappearedNumbers(arr));

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correctPos=nums[i]-1;
            if(nums[i]!=nums[correctPos]){
                swap(nums, i, correctPos);
            }else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j+1){
                list.add(j+1);
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
