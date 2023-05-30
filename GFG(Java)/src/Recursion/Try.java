package Recursion;
import java.util.Scanner;
import java.util.Arrays;

public class Try {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            int [] arr = new int [i];
            for(int a =0; a<i;a++){
                arr[a] = sc.nextInt();
            }
            sumtraingle(arr);

        }
        public static void sumtraingle(int [] arr){
            System.out.println(Arrays.toString(arr));
        }


    }
