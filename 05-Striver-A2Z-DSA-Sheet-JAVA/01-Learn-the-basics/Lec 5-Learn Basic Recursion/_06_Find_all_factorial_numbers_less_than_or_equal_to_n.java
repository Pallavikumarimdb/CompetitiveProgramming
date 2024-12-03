import java.util.ArrayList;

public class _06_Find_all_factorial_numbers_less_than_or_equal_to_n {

    public static void main(String[] args) {

    }
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        generate(2,1,n,result);
        return result;
    }
    static void generate(long i, long j, long n, ArrayList<Long> result)
    {
        if(j>n)
        {
            return;
        }
        result.add(j);
        generate(i+1, j*i,n, result);
    }
}
