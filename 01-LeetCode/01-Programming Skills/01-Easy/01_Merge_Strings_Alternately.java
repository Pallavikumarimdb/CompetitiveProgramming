//Question:-- https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=programming-skills

class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder sc=new StringBuilder();

        if(w1.length()<w2.length()){
            for(int i=0; i<w1.length(); i++){
                sc.append(w1.charAt(i));
                sc.append(w2.charAt(i));
            }
            for(int j=w1.length(); j<w2.length(); j++){
                sc.append(w2.charAt(j));
            }
        }
        else{
            for(int i=0; i<w2.length(); i++){
                sc.append(w1.charAt(i));
                sc.append(w2.charAt(i));
                //    System.out.println( sc.toString());
            }
            for(int j=w2.length(); j<w1.length(); j++){
                sc.append(w1.charAt(j));
            }
        }
        return sc.toString();
    }


}