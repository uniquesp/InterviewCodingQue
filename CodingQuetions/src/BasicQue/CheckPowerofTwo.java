package BasicQue;

public class CheckPowerofTwo {
	
	public static boolean PowerofTwo(int num) {
		boolean result = false;
		if(num==0) return result;
		while(num%2==0) {
			num = num/2;
		}
		if(num==1) {
			result = true;
		}
		return result;
	}
	
	//// Bit manipulation check
	//powers of two in binary form have exactly one bit set to 1 
	
	 public static boolean isPowerOfTwo(int n) {
	        if (n <= 0) {
	            return false;
	        }
	        return (n & (n - 1)) == 0;
	    }
	
	public static void main(String args[]) {
		int n = 67;
		System.out.println(PowerofTwo(n));
		System.out.println("Bit Manipulation Answer : " + isPowerOfTwo(n));
	}
}
