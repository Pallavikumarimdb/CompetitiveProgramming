package Recursion;

public class FirstUppercaseLetterinaString {
    public static void main(String[] args) {
        String s="geekSforgeeKs";
        firstUppercase(s, 0);
    }

    public static void firstUppercase(String s, int index){

        if(index==s.length()){
            System.out.println("UpperCase letter not found");
            return;
        }
        if(Character.isUpperCase(s.charAt(index))){
            System.out.println(s.charAt(index));
            return;
        }
        firstUppercase(s, index+1);
    }
}
