package PatternPrograms;

public class Pyramid {

	public static void pyramidPattern(int n) {
		 for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	            // Move to the next line
	            System.out.println();
	        }
	}

	public static void main(String[] args) {
		int n = 5;
		pyramidPattern(n);
	}
}
