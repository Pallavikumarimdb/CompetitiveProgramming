// Question:- https://leetcode.com/problems/sign-of-the-product-of-an-array/description/?envType=study-plan-v2&envId=programming-skills


// Note:- Here Integer limit will be exceeded even with long hence try to count -ve and 0 instead of multiplying

class Solution {
    public int arraySign(int[] nums) {
        int countZero = 0;
        int countNegative = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            } else if (nums[i] < 0) {
                countNegative++;
            }
        }
        if (countZero > 0)
            return 0;
        else if (countNegative % 2 != 0)
            return -1;
        return 1;
    }
}


// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// Method 2

// class Solution {
//     public int arraySign(int[] nums) {
//         int countZero=0;
//         int countNegative=0;
//         for(int i=0; i<nums.length; i++){
//             if(nums[i]==0){
//                 countZero++;
//             }else if(nums[i]<0){
//                 countNegative++;
//             }
//         }
//         return signFunc(countZero, countNegative);
//     }

//     public int signFunc(int countZero, int countNegative){
//         if(countZero>0) return 0;
//         else if(countNegative%2 != 0) return -1;
//         return 1;
//     } 
// }