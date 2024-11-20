package PatternPrograms;

public class AlphabatePt {
	public static void main(String[] args) {
		int alphabet = 65;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) alphabet + " ");
			}
			alphabet++;
			System.out.println();
		}
	}
}
