package ProblemSolving.Warmup;

import java.io.*;
import java.util.*;


class Result {

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum=0;
        for(int i=0; i<ar.size(); i++){
            sum+=ar.get(i);
        }
        return sum;

    }

}

public class SimpleArraySum{
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> arr=new ArrayList<>();
        for(int i=0; i<a; i++){
            arr.add(sc.nextInt());
        }
        System.out.println(Result.simpleArraySum(arr));

    }
}




