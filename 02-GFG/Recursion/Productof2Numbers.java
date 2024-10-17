package Recursion;

public class Productof2Numbers {
    public static void main(String[] args) {
        System.out.println(product(100, 100));
    }

//       If x is less than y, swap the two variables value
//       Recursively find y times the sum of x
//       If any of them become zero, return 0
    public static int product(int a, int b){
        if(a==0 || b==0){
            return 0;
        }
        if(b<a){
            return product(b, a);
        }
        return a + product(a, b-1);
    }
}
