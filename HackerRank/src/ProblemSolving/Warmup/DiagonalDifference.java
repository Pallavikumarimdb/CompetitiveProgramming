package ProblemSolving.Warmup;

import java.io.*;
import java.util.*;


class Diagonal {


    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum1=0;
        int sum2=0;
        int last=arr.size()-1;
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.size(); j++){
                if(i==j){
                    sum1+=arr.get(i).get(i);
                }
                if(j==last){
                    sum2+=arr.get(i).get(last);
                    last--;
                }

            }
        }
        int result=Math.abs(sum1-sum2);
        return result;

    }

}


public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<List<Integer> > arr= new ArrayList<List<Integer> >();

        for(int i=0; i<a; i++){
            List<Integer> list1=new ArrayList<>();
            for(int j=0; j<a; j++){
                int b =sc.nextInt();
                list1.add(b);
            }
            arr.add(list1);
        }
        System.out.println(Diagonal.diagonalDifference(arr));
    }
}
