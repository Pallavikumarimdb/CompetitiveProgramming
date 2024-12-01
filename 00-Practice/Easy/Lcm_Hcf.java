import java.util.Arrays;

public class Lcm_Hcf {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(lcmAndGcd(1,1)));
    }

    static int[] lcmAndGcd(int a, int b) {
        int[] arr=new int[2];
        int n= Math.min(a, b);
        for(int i=n; i>0; i--){
            if(a%i==0 && b%i==0){
                arr[1]=i;
                break;
            }
        }
        int l=(a*b)/arr[1];
        arr[0]=l;
        return arr;
    }
}
