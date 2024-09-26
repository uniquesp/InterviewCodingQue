package BasicQue;

class PerfectNo{
	
	public static boolean isPerfect(int n) {
		int sum = 1;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				if (i == n / i) {
					sum = sum + i;
				} else {
					sum = (sum+i) + n / i;
				}
			}
		}

		return sum == n && n != 1;	
	}
	
	 public static void findPerfectNumbers(int n) {
	        for (int i = 2; i <= n; i++) {
	            if (isPerfect(i)) {
	                System.out.println(i + " is a perfect number.");
	            }
	        }
	    }
	
	public static void main(String[] args) {
		int n = 10000;  // Set the upper limit to search for perfect numbers
        System.out.println("Perfect numbers up to " + n + ":");
        findPerfectNumbers(n);
	}
}