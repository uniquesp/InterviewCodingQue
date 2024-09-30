package Array;

public class FindIndex {

	public static int findIndexElement(int[] arr, int target) {
		int n = arr.length;
		int low = 0, high = n - 1;
		int index = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				index = mid;	
				return index;
			} else if (target > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid-1;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		int[] arr = {-1,0,3,5,9,12};
		int target = 9;
		
		System.out.println("Index of Element : " + findIndexElement(arr, target));
	}
}
