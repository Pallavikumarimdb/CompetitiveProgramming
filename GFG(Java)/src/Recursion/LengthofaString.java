package Recursion;

public class LengthofaString {
    public static void main(String[] args) {
        String s="JrfB8Q0Au9oBCjNE1Mbj";
        int i=0;
        System.out.println(lengthofString(s, i));

    }
    public static int lengthofString(String s, int i){
        if(i==s.length()){
            return i;
        }
        return lengthofString(s, i+1);
    }
}
