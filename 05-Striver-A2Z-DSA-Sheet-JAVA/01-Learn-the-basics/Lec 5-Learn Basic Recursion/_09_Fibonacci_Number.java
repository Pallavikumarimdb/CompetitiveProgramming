//Question https://leetcode.com/problems/fibonacci-number/description
public class _09_Fibonacci_Number {
    public int fib(int n) {

        if(n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);

    }
}
