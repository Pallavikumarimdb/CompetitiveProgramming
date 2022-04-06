package BinarySearch;

import java.util.Scanner;

public class RotationCountInRotatedSortedArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(findKRotation(arr, n));
    }

    public static int findKRotation(int arr[], int n) {
        // code here

        int indx = findPivot(arr)+1;
        // int ans = (arr.length)-((arr.length)-(indx+1));
        return indx;
    }

    public static int findPivot(int arr[]){

        int start =0;
        int end=arr.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else if(arr[mid]>=arr[start]){
                start=mid+1;
            }
        }

        return -1;

    }

}
