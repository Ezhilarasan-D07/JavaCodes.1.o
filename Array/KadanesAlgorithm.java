
/*

    You are given an integer array arr[]. 
    You need to find the maximum sum of a subarray 
    (containing at least one element) in the array arr[].
    Note : A subarray is a continuous part of an array.

    Examples:

    Input: arr[] = [2, 3, -8, 7, -1, 2, 3]   Output: 11
    Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

    Input: arr[] = [-2, -4]                  Output: -2
    Explanation: The subarray [-2] has the largest sum -2.

    Input: arr[] = [5, 4, 1, 7, 8]           Output: 25
    Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.

*/

public class KadanesAlgorithm {

    static int findMaxSum (int ... arr) {
        // setting cursum and maximum sum as neg-inf so that the neg values can be accounted.
        int curSum = 0, maxSum = Integer.MIN_VALUE;        
        for (int num: arr) {
            // inc cur to yeild maximum and compare with existing sum.
            curSum += num;
            // compared cursum & maxsum we'll get the maximum.
            maxSum = Math.max(curSum, maxSum);
            // set again to zero if current sum leads to negative.
            if (curSum < 0) curSum = 0;
            // return maximum sum.
        }   return maxSum;
    }
    public static void main (String ... varChar) {
        System.out.println(findMaxSum(2, 3, -8, 7, -1, 2, 3));
        System.out.println(findMaxSum(-2, -4));
        System.out.println(findMaxSum(5, 4, 1, 7, 8));
    }

}
