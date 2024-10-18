// Question:-https://leetcode.com/problems/valid-anagram/?envType=study-plan-v2&envId=programming-skills

import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }else{
       char[] arr1=s.toCharArray();
       char[] arr2=t.toCharArray();       
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2)?true:false;
        }

    }
}