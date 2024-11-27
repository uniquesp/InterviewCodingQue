package RecurssionProg;

import java.util.Arrays;

public class LengthMaxSubsequence {
    private static int[][] t;

    public static int lis(int[] nums, int prevIdx, int currIdx) {
        if (currIdx == nums.length)
            return 0;

        // Map prevIdx to a valid index for memoization (-1 -> 0)
        int mappedPrevIdx = prevIdx + 1;

        if (t[mappedPrevIdx][currIdx] != -1)
            return t[mappedPrevIdx][currIdx];

        // Take the current element if it is greater than the previous
        int taken = 0;
        if (prevIdx == -1 || nums[currIdx] > nums[prevIdx])
            taken = 1 + lis(nums, currIdx, currIdx + 1);

        // Skip the current element
        int notTaken = lis(nums, prevIdx, currIdx + 1);

        // Store the result in the memoization table
        t[mappedPrevIdx][currIdx] = Math.max(taken, notTaken);

        return t[mappedPrevIdx][currIdx];
    }

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;

        // Allocate memoization table: Extra row for prevIdx = -1
        t = new int[n + 1][n];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        return lis(nums, -1, 0);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 6, 7, 3, 2 };
        System.out.println("Length of LIS: " + lengthOfLIS(arr)); // Output: 3
    }
}
	