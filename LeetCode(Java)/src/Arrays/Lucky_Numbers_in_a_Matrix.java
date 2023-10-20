package Arrays;
import java.util.*;
//1380. Lucky Numbers in a Matrix
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
public class Lucky_Numbers_in_a_Matrix {
    public static void main(String[] args) {
        int[][] arr={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(arr));

    }
    public static List<Integer> luckyNumbers (int[][] mat) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0; i<mat.length; i++){
            int min=mat[i][0];
            int ind=0;
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]<min){
                    min=mat[i][j];
                    ind=j;
                }
            }
            int max=min;
            int count=0;
            for(int k=0; k<mat.length; k++){
                if(mat[k][ind]>max){
                    break;
                }else{
                    count++;
                }
            }
            if(count==mat.length){
                arr.add(max);
            }
        }

        return arr;
    }
}
