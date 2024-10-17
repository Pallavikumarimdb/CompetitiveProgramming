package Sorting;

import java.util.*;
public class MajorityElement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(majorityElement(arr));
    }


    public static int majorityElement(int[] nums) {


        // USE BUBBLE SORT FOR ARRAY SORTING

//        boolean b;
//        for(int i=0; i<nums.length; i++){
//            b=false;
//            for(int j=1; j<nums.length-i; j++){
//
//                if(nums[j]<nums[j-1]) {
//                    int temp = nums[j];
//                    nums[j]=nums[j-1];
//                    nums[j-1]=temp;
//                    b=true;
//                }
//            }
//            if(!b){
//                break;
//            }
//        }

            Arrays.sort(nums);
            int check=1;
            for(int i=0; i<nums.length; i+=check){
                int count=0;
                for(int j=1; j<nums.length; j++){

                    if(nums[i]==nums[j]){
                        count++;
                    }
                    else{

                    }
                }
                if(count>=nums.length/2){
                    return nums[i];
                }
                else if(count>0){
                    check=count;
                }
            }

            return -1;
        }
    }




    //  SIMPLE SOLUTION

//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }