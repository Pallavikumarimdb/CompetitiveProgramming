//Question: https://leetcode.com/problems/reverse-integer/description/

//Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.


//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

public class _02_Reverse_Integer {
    public int reverse(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
    }

    //---------------------- METHOD 2 -------------------------- //

    public int reverseInteger(int x){
        boolean isNegative = x<0;
        x=Math.abs(x);

        // Reverse the digits by converting to string

        String reverseStr = new StringBuilder(String.valueOf(x)).reverse().toString();

        try{
            int n=Integer.parseInt(reverseStr);
            return isNegative ? -1*n : n;
        }catch (NumberFormatException e){
            // Overflow occurred
            return 0;
        }

        // O(n) time and space complexity

    }

//    ...................... BEST .............................................
        public int reverseMeth3(int x) {
            int num = Math.abs(x);  // Original number ka absolute value nikala

            int rev = 0;  // Reversed number

            while (num != 0) {
                int ld = num % 10;  // Last digit nikala

                // Overflow check
                // Whatever will add (id) and multiply (i.e-10) first will divide from rev and check if it is still more. If so after doing + and * it will exceed MAX value.
                if (rev > (Integer.MAX_VALUE - ld) / 10) {
                    return 0;  // Agar overflow hua, toh 0 return kardo
                }

                rev = rev * 10 + ld;  // Reverse mein digit ko add kiya
                num = num / 10;  // Last digit hata diya, next iteration ke liye
            }

            return (x < 0) ? (-rev) : rev;  // Original number ke sign ke hisaab se result diya
        }
}
