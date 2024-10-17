package Recursion;

//https://www.hackerrank.com/challenges/30-recursion/problem

import java.io.*;

class Result {

        /*
         * Complete the 'factorial' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER n as parameter.
         */

    public static int factorial(int n) {
            // Write your code here
        if(n==1){
            return 1;
        }

        return n * factorial(n-1);
    }

}

public class Factorial_Recursion3 {
    public static void main(String[] args) {

        System.out.println(Result.factorial(5));


    }
}


