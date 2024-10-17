package Recursion;

//1342. Number of Steps to Reduce a Number to Zero
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/


public class Number_of_Steps_to_Reduce_a_Number_to_Zero {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(2030100200));
    }


    public static int numberOfSteps(int num) {


        return helper(num, 0);

//      int count=0;

//      if(num==0){
//          return count;
//      }

//      if(num%2!=0){
//          count++;
//      }
//      if(num%2==0){
//        count++;
//        return count+numberOfSteps(num/2);
//      }
//       return count+numberOfSteps(num-1);

//     }
    }

    public static int helper(int num, int c){


        if(num==0){
            return c;
        }


        if(num%2==0){
            return helper(num/2, c+1);
        }

        return helper(num-1, c+1);

    }
}
