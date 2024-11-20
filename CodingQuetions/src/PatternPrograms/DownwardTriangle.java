package PatternPrograms;

public class DownwardTriangle {
	public static void main(String[] args) {
		int n = 5; // Number of rows

		for (int i = n; i >= 1; i--) { 
			// Print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  "); // Two spaces for alignment
			}
			// Print stars
			for (int k = 1; k <= i; k++) {
				System.out.print("* "); // Star followed by a space
			}
			System.out.println(); // Move to the next line
		}
	}
}
