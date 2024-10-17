package Sorting;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,0,0,0};
        int[] arr1={4,5,6};
        int m=3;
        int n=3;
        merge(arr,m, arr1,n);
        System.out.println(Arrays.toString(arr));
    }
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            //as per the question we have been given out the  actual number
            //of elements in each array, so we will take that into account
            int i=m-1;
            int j=n-1;

            //we will start the operation from the last as we have to form out
            //arrays in decreasing order
            int k=m+n-1;

            //when we try to arrrange by comparisions
            while(i>=0 && j>=0){
                if(nums1[i]>nums2[j]){
                    nums1[k]=nums1[i];
                    i--;
                }
                else{
                    nums1[k]=nums2[j];
                    j--;
                }
                k--;
            }
            //there's a condition where we actually haven't used all the existing
            //elements from the arrays
            while(i>=0){
                nums1[k]=nums1[i];
                i--;
                k--;
            }
            while(j>=0){
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
    }

