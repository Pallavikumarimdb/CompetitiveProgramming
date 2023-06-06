package BinarySearch2D;

public class CountNegativeNumbersinaSortedMatrix {
    public static void main(String[] args) {

        int[][] arr = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println((countNegatives(arr)));

    }

    public static int countNegatives(int[][] arr) {

        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=arr[i].length-1; j>=0; j--){
                if(arr[i][j]<0){
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}
