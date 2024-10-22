//Question: https://leetcode.com/problems/palindrome-number/description/

//Given an integer x, return true if x is a  palindrome and false otherwise.

public class _03_Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int k=x;
        int y=0;
        while(x>0){
            int temp=x%10;
            x/=10;
            y=y*10+temp;
        }
        if(k==y){
            return true;
        }else{
            return false;
        }
    }
}
