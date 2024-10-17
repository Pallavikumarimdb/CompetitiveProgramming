package ProblemSolving.Warmup;

import java.util.*;

public class SolveMeFirst {
    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        int sum=a+b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
