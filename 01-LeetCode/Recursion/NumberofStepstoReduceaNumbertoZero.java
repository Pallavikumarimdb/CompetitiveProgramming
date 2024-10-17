package Recursion;

public class NumberofStepstoReduceaNumbertoZero {

    public static void main(String[] args) {

        System.out.println(countSteps(140087, 0));
    }
    public static int countSteps(int n, int s){
        if(n==0){
            return s;
        }
        else if(n%2==0){
            n=n/2;
        }else{
            n=n-1;
        }
        return countSteps(n, s+1);
    }
}
