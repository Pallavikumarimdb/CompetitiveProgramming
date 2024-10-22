//Question: https://www.geeksforgeeks.org/problems/count-digits5716/1

//Given a number n. Count the number of digits in n which evenly divide n. Return an integer,
// total number of digits of n which divides n evenly.


//Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.

public class _01_Count_Digits {
    static int evenlyDivides(int N){
        // code here
        int x=N;
        int count=0;

        while(N>0){
            int temp=N%10;
            if(temp!=0 && x%temp==0){
                count++;
            }
            N/=10;
        }
        return count;
    }
}
