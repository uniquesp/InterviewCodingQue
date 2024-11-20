package PatternPrograms;

public class PascalTriangle {
	public static void main(String[] args) {
		int n = 5; // Number of rows

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			int value = 1; // First value in each row is always 1
			for (int k = 0; k <= i; k++) {
				System.out.print("* "); // Replace Pascal number with a star
				value = value * (i - k) / (k + 1); // Calculate next Pascal number
			}
			System.out.println(); // Move to the next line
		}
	}
}
