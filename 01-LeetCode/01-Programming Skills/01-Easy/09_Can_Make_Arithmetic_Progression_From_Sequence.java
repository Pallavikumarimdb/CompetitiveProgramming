// Question:-https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/?envType=study-plan-v2&envId=programming-skills

import java.util.*;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int def=arr[0]-arr[1];
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]-arr[i+1]==def){
                def=arr[i]-arr[i+1];
            }else{
                return false;
            }
        }
        return true;
    }
}