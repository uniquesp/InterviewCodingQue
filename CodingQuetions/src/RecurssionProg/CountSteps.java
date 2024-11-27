package RecurssionProg;

import java.util.Scanner;

public class CountSteps {

	public static int CountStepsToReach(int n) {
		if (n == 0) {
			return 1;
		}

		if (n < 0) {
			return 0;
		}

		return CountStepsToReach(n - 1) + CountStepsToReach(n - 2) + CountStepsToReach(n - 3);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(CountStepsToReach(n));
	}

}
