//package Arrays.Easy;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1};
//         addToArrayForm(arr, n);
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int j=0;
        int max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                j++;
            }
            else{
                if(j>max){
                    max=j;
                }
                j=0;
            }
        }
        if(max>j){
            return max;
        }else{
            return j;
        }
    }
}
