// Question:-https://leetcode.com/problems/repeated-substring-pattern/?envType=study-plan-v2&envId=programming-skills


// RETRY SOLVED USING HINT

class Repeated_Substring_Pattern {
    public boolean repeatedSubstringPattern(String str) {
        int l = str.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                //  System.out.println(l+"  "+i);
                int m = l / i;
                String subS = str.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    sb.append(subS);
                }
                if (sb.toString().equals(str))
                    return true;
            }
        }
        return false;
    }
}