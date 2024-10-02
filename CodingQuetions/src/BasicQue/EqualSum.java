package BasicQue;

public class EqualSum {

	// by calculating sum 
	// 1tox = (x*(x+1))/2;
	// xton = (n(n+1)/2) -  (x*(x-1))/2;
	// 1tox = xton calculate this and get x2 = (n * (n + 1)) / 2
	public static int equalSumElement(int n) {
		int result = -1;
		int xSquare = (n * (n + 1)) / 2;
		double sqrtValue = Math.sqrt(xSquare);
		 if (sqrtValue == (int) sqrtValue && sqrtValue<=n) {
			 result = (int)sqrtValue;
		 }
		return result;
	}
	
	
	
	//By cumulativeSum
	public static int findX(int n) {
        int totalSum = 0;
        
        // Calculate total sum from 1 to n
        for (int i = 1; i <= n; i++) {
            totalSum += i;
        }
        int leftSum = 0; // Cumulative sum from 1 to x
        
        // Now iterate over possible values of x
        for (int x = 1; x <= n; x++) {
            leftSum += x; // Add current x to the left sum
            
            // Calculate right sum (sum from x to n)
            int rightSum = totalSum - leftSum + x;
            
            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                return x;
            }
        }
        // If no such x found, return -1
        return -1;
    }
	
	public static void main(String[] args) {
		int n = 8;
		System.out.println(equalSumElement(n));
		System.out.println("Cumulative: " + findX(n));
	}
}
