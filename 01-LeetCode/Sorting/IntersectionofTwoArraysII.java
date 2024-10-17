package Sorting;
import java.util.*;

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(intersect(nums1, nums2));
    }

    public static int bs(int [] num , int target, int start, int end){
        while(start<=end){
            int mid= start+ (end-start)/2;
            if(num[mid] == target) {
                if(mid>0 && mid-1>=start ){
                    if(num[mid-1]==num[mid]) end =mid-1;
                }
                else return mid;
            }
            else if(num[mid]>target) end = mid-1;
            else start= mid+1;
        }
        return -1;
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        // Let's try one bruteforce approach
        int l1= nums1.length;
        int l2= nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        if(l1>=l2){
            int pos=0;

            for(int i=0 ;i <l2; i++){

                if(bs(nums1,nums2[i],pos,l1-1)!=-1){
                    list.add(nums2[i]);
                    System.out.println(pos+" "+bs(nums1,nums2[i],pos,l1-1));
                    pos = bs(nums1,nums2[i],pos,l1-1);
                    System.out.println(pos);

                }

            }
            int [] ans = new int[list.size()];
            for(int i=0; i<ans.length;i++){
                ans[i]= list.get(i);
            }
            return ans;


        }
        else{
            int pos=0;

            for(int i=0 ;i <l1; i++){

                if(bs(nums2,nums1[i],pos,l2-1)!=-1){
                    list.add(nums1[i]);
                    pos = bs(nums2,nums1[i],pos,l2-1);

                }

            }
            int [] ans = new int[list.size()];
            for(int i=0; i<ans.length;i++){
                ans[i]= list.get(i);
            }
            return ans;

        }

    }
}
