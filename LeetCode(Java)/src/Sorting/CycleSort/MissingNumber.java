package Sorting.CycleSort;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr ={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));

    }


    public static int missingNumber(int[] nums) {

        int i=0;
        while(i<nums.length){
            int correctPos=nums[i];
            if(nums[i] < nums.length && nums[i]!=nums[correctPos]){
                swap(nums, i, correctPos);
            }else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }


    public static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
