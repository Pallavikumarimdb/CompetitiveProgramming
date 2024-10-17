package ProblemSolving.Warmup;

import java.io.*;
import java.util.*;


class BigSum {

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum=0;
        for(int i=0; i<ar.size(); i++){
            sum+=ar.get(i);
        }
        return sum;
    }

}

public class AVeryBigSum {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        List<Long> list=new ArrayList<>();
        for(int i=0; i<a; i++){
            list.add(sc.nextLong());
        }
        System.out.println(BigSum.aVeryBigSum(list));

    }
}
