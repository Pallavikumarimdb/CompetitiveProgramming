package Recursion;

public class Print1ToNWithoutLoop {
    public static void main(String[] args) {
        int a = 10;
        printNos(a);
    }
        public static void printNos(int N)
        {
            if(N==0){
                return;
            }
            printNos(N-1);
            System.out.print(N+" ");
        }

    }


