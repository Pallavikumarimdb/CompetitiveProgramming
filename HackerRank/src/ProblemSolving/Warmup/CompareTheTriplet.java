package ProblemSolving.Warmup;

import java.io.*;
import java.util.*;


class Triplet {


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> list=new ArrayList<>();
        int Alice=0;
        int Bob=0;
        for(int i=0; i<a.size(); i++){
            if(a.get(i)>b.get(i)){
                Alice++;
            }
            else if(a.get(i)<b.get(i)){
                Bob++;
            }
        }
        list.add(Alice);
        list.add(Bob);
        return list;
    }

}

public class CompareTheTriplet {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        int i=3;
        while(i>0){
            a.add(sc.nextInt());
            i--;
        }

        i=3;
        while(i>0){
            b.add(sc.nextInt());
            i--;
        }
        List<Integer> result=Triplet.compareTriplets(a,b);
        System.out.println(result.get(0)+" "+result.get(1));
    }
}
