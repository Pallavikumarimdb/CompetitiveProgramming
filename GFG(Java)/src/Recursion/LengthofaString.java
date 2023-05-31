package Recursion;

public class LengthofaString {
    public static void main(String[] args) {
        String s="JrfB8Q0Au9oBCjNE1Mbj";
        System.out.println(lengthofString(s, 0));
        System.out.println(lengthOfString1(s, 0));

    }
    public static int lengthofString(String s, int i){
        if(i==s.length()){
            return i;
        }
        return lengthofString(s, i+1);
    }

    public static int lengthOfString1(String s, int i){
        if(s==""){
            return i;
        }

        return lengthOfString1(s.substring(1), i+1);
    }
}
