package Recursion;

public class MinimumandMaximumElementsofArray {
    public static void main(String[] args) {

        int[] arr = {99, 458, -29, 298, 194, 338, -100, 172, 497, -97, 286, 474, 27, 310, 295, 450, 315, 296, 38, 388, 9, 340, 324, 432, 149, 9, 136, -25, 60, 173, 90, 484, 377, 407, 166, 499, -88, 175, -76, 179, 491, 431, 59, 69, 127, 413, -62, 293, -50, 427};
        findMax(arr, arr[0], 1);
        findMin(arr, arr[0], 1);
    }

    public static void findMin(int[] arr, int min, int s){

        if(s==arr.length){
            System.out.println("Min : " + min);
            return;
        }
        if(arr[s]<min){
            min = arr[s];
        }
        findMin(arr, min, s+1);
    }
    public static void findMax(int[] arr, int max, int s){

        if(s==arr.length){
            System.out.println("Max : " + max);
            return;
        }
        if(arr[s]>max){
            max = arr[s];
        }
        findMax(arr, max, s+1);
    }
}
