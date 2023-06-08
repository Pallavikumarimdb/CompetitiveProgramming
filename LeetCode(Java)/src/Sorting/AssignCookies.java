package Sorting;
import java.util.*;
public class AssignCookies {
    public static void main(String[] args) {
        int[] g={1,2,3};
        int[] s={1,1};
        System.out.println(findContentChildren(g, s));

    }
    public static int findContentChildren(int[] g, int[] s) {
        //this seems like a simple merge sort question where we'll just checkon when
        //our given condition that is s[j]>= g[i] is satisfied
        Arrays.sort(g);
        Arrays.sort(s);
        //so we have sorted this here
        int i=0,j=0;
        while(i<g.length && j<s.length){
            //if the size of cookie is greater than the greed
            //then will go ahead and increase the satisfied kid count
            if(s[j]>=g[i]){
                i++;
                j++;
            }
            //else we'll increase the size of the cookie
            else j++;
        }
        return i;
    }
}
