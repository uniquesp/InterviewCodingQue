package BasicQue;

public class SumInRange {

	/*
	// Simple approch
	public static int sumofRange(int[]arr, int[]range) {
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			if(i>=range[0] && i<=range[1]) {
				sum+=arr[i];
			}
		}
		return sum;
	}
	*/
	
	public static int prefixSum(int[]arr, int left, int right) {
		int n = arr.length;
		int[] prefixSum = new int[n+1];
		prefixSum[0] = arr[0];
		for(int i=1; i<n; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}
		return prefixSum[right] - prefixSum[left - 1];
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6};
	//	int[] range = {3,5};
		int left = 3;
		int right = 5;
		
		System.out.println("Sum : "+ prefixSum(arr,left,right));
	}
}
