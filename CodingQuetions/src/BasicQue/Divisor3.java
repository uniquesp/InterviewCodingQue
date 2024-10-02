package BasicQue;

public class Divisor3 {

//A number has exactly three divisors if and only if it is the square of a prime number. 
//This is because:
//For a number n=p^2 where p is prime number, the divisors of n are 1,p,p^2 so there exactly 3 divisor
//Check if the number is a perfect square.
//If it's a perfect square, check if the square root is a prime number.
//If both conditions are true, the number has exactly three divisors.
	
	 public static boolean isPrime(int num) {
	        if (num < 2) {
	            return false;
	        }
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	 
	 public static boolean hasExactlyThreeDivisors(int n) {
	        // Check if n is a perfect square
	        int sqrt = (int) Math.sqrt(n);
	        if (sqrt * sqrt != n) {
	            return false; // n is not a perfect square
	        }

	        // Check if the square root is prime
	        return isPrime(sqrt);
	    }
	 
	 public static void main(String[] args) {
		 int num = 4;
		 boolean result = hasExactlyThreeDivisors(num);
	     System.out.println("Has exactly 3 divisors? " + result);
	}
}
