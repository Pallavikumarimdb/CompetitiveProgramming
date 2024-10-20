// Question Link: https://www.geeksforgeeks.org/problems/pass-by-reference-and-value/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pass-by-reference-and-value


class _08_FunctionsPassByReferenceAndValue {

    // Time Complexity = O(1), Space Complexity = O(1)
    static int[] passedBy(int a, int b) {
        // code here
        return new int[]{a + 1, b + 2};
    }
}


//Input:
//a = 1
//b = 2
//Output:
// 2 4
//Explanation: 1 was passed by value whereas 2 passed by reference.