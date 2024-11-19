package Stack;

import java.util.Stack;

public class Reverse_Array {

	public static void reverse(int arr[], int n) {

		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			st.push(arr[i]);
		}

		int i = 0;
		while (st.empty() == false) {
			int top = st.peek();
			st.pop();
			arr[i] = top;
			i++;
		}

		for (i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String args[]) {
		int n = 4;
		int[] a = new int[] { 100, 200, 300, 400 };
		reverse(a, n);
	}
}
