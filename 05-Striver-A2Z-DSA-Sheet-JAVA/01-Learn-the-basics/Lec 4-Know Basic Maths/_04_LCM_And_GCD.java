//Question: https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1

//Given two integers a and b, write a function lcmAndGcd() to compute their LCM and GCD.
//The function takes two integers a and b as input and returns a list containing their LCM and GCD.

public class _04_LCM_And_GCD {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        // Long[] arr=new Long[2];
        // Long n1=A;
        // Long n2=B;
        // while(A!=B){
        //     if(A>B){
        //         A=A-B;
        //     }else{
        //         B=B-A;
        //     }

        // }
        // arr[1]=A;


        // Long lcm=n1*n2/arr[1];
        // arr[0]=lcm;
        // return arr;

        // OPTIMIZED

        long a=A;
        long b=B;
        Long GCD=0L;
        Long x[]=new Long[2];
        while(A>0 && B>0){
            if(A>B){
                A=A%B;
            }else{
                B=B%A;
            }
        }
        if(A==0){
            GCD=B;
        }else{
            GCD=A;
        }
        Long lcm =a*b/GCD;
        x[0]=lcm;
        x[1]=GCD;
        return x;
    }
}
