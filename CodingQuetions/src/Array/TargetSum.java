package Array;

import java.util.HashMap;

public class TargetSum {

	public static int[] targetSumVal(int[] arr, int target) {
		int n = arr.length;
		int[] ans = new int[2];

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int x = arr[i];
			int y = target - x;

			if (map.containsKey(y)) {
				ans[0] = i;
				ans[1] = map.get(y);
				return ans;
			}
			map.put(x, i);
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 2 };
		int target = 9;

		int[] result = targetSumVal(arr, target);

		System.out.println("Indices: " + result[0] + ", " + result[1]);
	}
}
