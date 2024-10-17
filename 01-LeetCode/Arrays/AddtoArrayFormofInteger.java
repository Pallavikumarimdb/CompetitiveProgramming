package Arrays;

import java.util.*;

public class AddtoArrayFormofInteger {

    public static void main(String[] args) {
        int[] arr={1,2,3,0,0,0};
        int n=35;
//         addToArrayForm(arr, n);
        System.out.println(addToArrayForm(arr, n));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr= new ArrayList<>();
        while(k>0){
            int a=k%10;
            k=k/10;
            arr.add(a);
        }
        System.out.println(arr);
        List<Integer> arr1= new ArrayList<>();
        int a=0;
        int b=0;
        if(num.length>arr.size()){

            int i=num.length;
            int j=arr.size();
            if(j>=0){

            while(i>=0) {
                System.out.println("kkkk");
                a = num[i];
                b = arr.get(j);
                int sum = 0;
                sum=a + b;
                if (sum <= 9) {
                    arr1.add(sum);
                }
                if (sum > 9) {
                    while (sum >= 0) {
                        int a1 = k % 10;
                        k = k / 10;
                        arr1.add(a1);
                        num[i] += 1;
                    }
                }
                else{
                    arr1.add(sum);
                }
                i--;
                j--;
            }
            }
            else{
                for (int l = i; l <=0; l--) {
                    arr1.add(num[l]);
                }
            }

        }

//
//
//        for (int row = num.length; row <=0; row--) {
//
//            for (int col = 0; col <=arr.size(); col++) {
//                b=arr.get(col);
//            }
//
//            int sum=a+b;
//            if(sum<=9){
//                arr1.add(sum);
//            }
//            if(sum>9){
//                while(sum>0){
//                    int a=k%10;
//                    k=k/10;
//                    arr1.add(a);
//                    num[row]+=1;
//                }
//            }
//
//        }


        return arr1;

    }
}
