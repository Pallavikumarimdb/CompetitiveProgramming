// Question:- https://leetcode.com/problems/find-the-difference/?envType=study-plan-v2&envId=programming-skills

class Solution {
    public char findTheDifference(String s, String t) {
        
        int num = 0;

        for(int cs : s.toCharArray()) num -= cs;

        for(int ct : t.toCharArray()) num += ct;

        return (char) (num);
        
         }
}

// The approach leverages the fact that the sum of the ASCII 
//values of the characters in s and t will differ by exactly the ASCII value of the extra character. Here’s how:

//     Suppose s = "abcd" and t = "abcde".
//     The code subtracts the ASCII values of each character in s from num and adds the ASCII values of each character in t to num.
//     Because the characters a, b, c, and d are present in both strings, their net contribution to num is zero (since their values are added and subtracted).
//     The only remaining value in num after processing both strings will be the ASCII value of the extra character e (in this case).