package Recursion;

public interface FibonacciNumber {
        public static void main(String[] args) {
            System.out.println(fibonacci(10));
        }

        public static int fibonacci(int n){

        // Base condition
//        if(n<2){
//            return n;
//        }
            if(n==0 || n==1){
                return n;
            }
                return fibonacci(n-1)+fibonacci(n-2);

        }

    }


