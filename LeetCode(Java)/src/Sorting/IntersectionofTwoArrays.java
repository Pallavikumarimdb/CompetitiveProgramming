package Sorting;
import java.util.*;

public class IntersectionofTwoArrays {

    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};

        System.out.println(intersection(nums1, nums2));
    }


    public static int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums2);

        Set<Integer> hash=new HashSet<Integer>();
        for(Integer i:nums1){

            if(uniqueNo(nums2, i)!=-1){
                hash.add(i);
            }
        }

        int[] arr=new int[hash.size()];
        int j=0;
        for(Integer i:hash){
            arr[j]=i;
            j++;
        }

        return arr;
    }



    public static int uniqueNo(int[] arr, int target){

        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return target;
            }

            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }
}


