// Question:-https://leetcode.com/problems/plus-one/?envType=study-plan-v2&envId=programming-skills
import java.util.*;

class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> arr=new ArrayList<>();
        int rem=0;
        int a=0;
        for(int i=digits.length-1; i>=0; i--){
            a=digits[i]+rem;
            if(i==digits.length-1){
                a=digits[digits.length-1]+1;
            }if(a>9){
                arr.add(a%10);
                rem=a/10;
            }else{
                arr.add(a);
                rem=0;
            }
        }
        if(a>9){
            arr.add(a/10);
        }
        int[] ans=new int[arr.size()];
        int j=0;
        for(int i=arr.size()-1; i>=0; i--){
            ans[j]=arr.get(i);
            j++;
        }
        return ans;
    }
}