// Question Link: https://www.geeksforgeeks.org/problems/while-loop-printtable-java/1


class _07_WhileLoops {
    static void printTable (int n) {
        int i = 10;

        // Iterate from 10 down to 1
        while (i >= 1) {
            // Print the result of n multiplied by the current value of i, followed by a space
            System.out.print((n * i) + " ");

            i--;
        }
        System.out.println();
    }

}