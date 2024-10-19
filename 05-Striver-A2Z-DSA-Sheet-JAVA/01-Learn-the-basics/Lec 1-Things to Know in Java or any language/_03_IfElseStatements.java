// Question Link: https://www.geeksforgeeks.org/problems/java-if-else-decision-making0924/0?category%255B%255D=Java&difficulty%255B%255D=-2&page=1&query=category%255B%255DJavadifficulty%255B%255D-2page1category%255B%255DJava



class  _03_IfElseStatements  {
    /*
    public static String compareNM(int n, int m) {
        if (n > m) {
            return "greater";
        } else if (n < m) {
            return "lesser";
        } else {
            return "equal";
        }
    }
    */

//----------------- 2nd Approach: Using Ternary Operator --------------------
    public static String compareNM(int n, int m) {

        return (n > m) ? "greater" : (n < m) ? "lesser" : "equal";
    }
}