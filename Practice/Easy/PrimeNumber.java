package Easy;


public class PrimeNumber {
    public static void main(String[] args) {
        int i=0;
        int[] arr={2, 3, 5, 8, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 78, 83, 89, 97};
        gno(arr,i);
    }

    public static void gno(int[] arr, int i){
        if(i== arr.length){
            return;
        }
        System.out.println(primeNumber(arr[i]));
//        primeNumber(arr[i]);
        gno(arr, i+1);
    }
    public static boolean primeNumber(int num){
        if(num==1 || num==2){
            return true;
        }
        for (int i = 2; i < num/2+1; i++) {
            for (int j = 2; j < num/2+1; j++) {
//                System.out.println(i*j);
                if(i*j == num){
                    return false;
                }
            }
        }
        return true;
    }
}

