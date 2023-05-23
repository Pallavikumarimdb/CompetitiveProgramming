package Recursion;

public class BinarySearch {
        public int search(int[] nums, int target) {
            int s=0;
            int e=nums.length-1;
            return binarySearch(nums, target, s, e);
        }

        public int binarySearch(int[] arr, int target, int s, int e){

            if(s>e){
                return -1;
            }
            int mid = s + (e-s)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(target < arr[mid]){
                return binarySearch(arr, target, s, mid - 1);
            }

            return binarySearch(arr, target, mid+1, e);

        }

}
