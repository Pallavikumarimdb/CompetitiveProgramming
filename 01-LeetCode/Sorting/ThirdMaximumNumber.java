package Sorting;

public class ThirdMaximumNumber {
    public static void main(String[] args) {

        int[] arr={3,2,1};
        System.out.println(thirdMax(arr));

    }

    public static int thirdMax(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }else{
            int count=0;
            for(int i=0; i<nums.length; i++){
                for(int j=0; j<nums.length-i-1; j++){
                    if(nums[j]>nums[j+1]){
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
                // System.out.println(Arrays.toString(nums));
                // if(count==3){
                //         return nums[nums.length-i-2];
                //     }
            }

            for(int i=nums.length-1; i>=0; i--){
                if(i!=0 && nums[i]>nums[i-1] && nums[i]!=nums[i-1]){
                    count++;
                    //  System.out.println(Arrays.toString(nums)+"   "+count+" "+nums[i]+"kk"+i);
                }
                else if(i==0 && nums[i]<=nums[i+1]){
                    count++;
                    //  System.out.println(Arrays.toString(nums)+" jj  "+count);
                }
                if(count==3){
                    return nums[i];
                }
            }
            return nums[nums.length-1];
        }
    }
}
