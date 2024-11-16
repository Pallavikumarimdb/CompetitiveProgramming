public class Power_of_Two {

    public static void main(String[] args) {

    }
        public boolean isPowerOfTwo(int n) {
            if (n <= 0) {
                return false;
            }
            boolean ans = (n & (n - 1)) == 0;
            return ans;
        }
}
