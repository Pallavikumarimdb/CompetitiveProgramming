package Recursion;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        int i=0;
        int e=s.length-1;
        char[] c = reverse(s, i, e);
        System.out.println(Arrays.toString(c));
    }

    public static char[] reverse(char[] s, int i, int e){
        if(i==s.length/2){
            return s;
        }
        char temp=s[i];
        s[i]=s[e];
        s[e]=temp;
        return reverse(s, i+1, e-1);
    }
}
