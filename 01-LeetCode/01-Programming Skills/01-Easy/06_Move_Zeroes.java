// Question:-https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=programming-skills

class Move_Zeroes{
    public void moveZeroes(int[] nums) {

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length-1; j++){
                if(nums[j]==0){
                    int temp=nums[j+1];
                    nums[j+1]=0;
                    nums[j]=temp;
                }
            }
            // System.out.println(i);
        }
    }
}