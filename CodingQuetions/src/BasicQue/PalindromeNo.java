package BasicQue;

class PalindromeNo {

	public static boolean isPalindrome(int num) {
		if (num < 0) {
			return false;
		}
		int original = num;
		int reversed = 0;

		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10 ;
		}
		return original == reversed;
	}


	
	public static void main(String[] args) {
		int num = 121; 
		if (isPalindrome(num)) {
			System.out.println(num + " is a palindrome.");
		} else {
			System.out.println(num + " is not a palindrome.");
		}
	}
}