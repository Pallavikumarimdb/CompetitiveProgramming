// Question 1:- https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=programming-skills

class Solution {
    public int strStr(String haystack, String needle) {

        if(needle.length()>haystack.length()){
            return -1;
        }else{
        for(int i=0; i<haystack.length(); i++){
            int count=0;
            if(haystack.charAt(i)==needle.charAt(0)){
                for(int j=0; j<needle.length(); j++){
                    if(haystack.length()-i<needle.length()){
                        return -1;
                    }
                    if(needle.charAt(j)==haystack.charAt(i+j)){
                        count++;
                    }else{
                        break;
                    }
                }
                if(count==needle.length()){
                    return i;
                }
                count=0;
            }
        }
        }
        return -1;
    }
}