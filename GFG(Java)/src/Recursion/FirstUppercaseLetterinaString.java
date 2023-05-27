package Recursion;

public class FirstUppercaseLetterinaString {
    public static void main(String[] args) {
        String s = "geekSforgeeKs";
        firstUppercase(s, 0);
        System.out.println(findUpper(s));
    }


    // method 1
    public static void firstUppercase(String s, int index)  {

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


    // method 2
    public static String findUpper(String s) {
        if(s.length()==0){
            return "UpperCase letter not found";
        }
        if (Character.isUpperCase(s.charAt(0))) return s.substring(0, 1);
        else return findUpper(s.substring(1, s.length()));
    }
}


















