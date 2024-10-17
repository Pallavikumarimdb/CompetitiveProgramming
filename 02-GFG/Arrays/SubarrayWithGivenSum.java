package Arrays;
import java.util.*;
import java.lang.*;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //no of test cases
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }

            ArrayList<Integer> res = subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        int k=0;
        while(k<n){
            int sum=0;
            for(int i=k; i<n; i++){

                if(arr[i]<s && sum<s){
                    sum+=arr[i];
                    list1.add(i);
                }
                else if(arr[i]==s){

                    list2.add(i+1);
                    list2.add(i+1);
                    return list2;
                }
                else if(sum+arr[i]>s){
                    break;
                }
                if(sum==s){
                    list2.add(list1.get(0)+1);
                    list2.add(list1.get(list1.size()-1)+1);
                    return list2;
                }
            }
            list1.clear();
            k++;
        }
        list2.add(-1);
        return list2;

    }
}
