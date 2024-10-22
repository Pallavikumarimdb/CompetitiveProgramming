//Question: https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
public class _06_Sum_of_all_divisors_from_1_to_n {
    static long sumOfDivisors(int N){
        // code here
        long totalSum = 0;
        for (int i = 1; i <= N; i++)
        {
            totalSum += (N / i) * i;
            System.out.println((N / i) +"  "+ i+"  "+totalSum);
        }

        return totalSum;
    }
}



// We start with a loop that goes through the numbers from 1 to N, i.e. i takes values from 1 to N.

// In each of these iterations, we want to find the maximum integer k that is less than or equal to N/i. This integer k gives us the number of times that i fits into N without exceeding N. That is, if i exactly divides N, then k will be 1, because only once does i fit into N.

// For example, if N = 10 and i = 3, then N // i is 3, since 3 fits three times in 10. Thus, k will be 3, i.e. i can be added three times to the sum.

// To summarize, the line k = N // i helps to calculate the number of times a number i can be added to the total sum of the divisors. This allows the sum to be calculated without the use of nested loops, and this is the algebraic approach that helps optimize the code.
