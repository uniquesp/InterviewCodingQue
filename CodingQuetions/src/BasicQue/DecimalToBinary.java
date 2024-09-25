package BasicQue;

public class DecimalToBinary {
	
	// Simple Approch
	public static String DecimalToBinaryConversion(int n) {
		String result = "";
		while(n>0) {
			if(n%2==0) {
				result = "0" + result;
			}
			if(n%2==1) {
				result = "1"+ result;
			}
			n=n/2;
		}
		return result;
	}
	
	
	 // Converts using Bit Manipulation
	  static String DecimalToBinaryByBit(int num) {
	    String str = "";
	    while (num > 0) {
	    // check num even or odd  if odd then 1 else 0
	      if ((num & 1) == 1) 
	        str = '1' + str;
	      else 
	    	  str = '0' + str;
	      // in decimal rightshift means divide by 2
	      num >>= 1; // Right shift the number
	    }
	    return str; 
	  }
	  
	public static void main(String args[]) {
		int n = 12;
		System.out.println("Result : "+ DecimalToBinaryConversion(n));
		System.out.println("Using Builtin Function : "+ Integer.toString(n,2));
		System.out.println("BitManipulation : "+ DecimalToBinaryByBit(n));
	}
}
