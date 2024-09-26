package BasicQue;

public class CountOnes {
	
	// simple approch
	public static int countOnes(int num) {
		int count = 0;
		String binaryNum = Integer.toString(num, 2);
		
		for(int i=0; i<binaryNum.length(); i++) {
			
			if(binaryNum.charAt(i)=='1') {
				count++;
			}
		}	
		return count;
	}
	
	//Brian Kernighan’s algorithm
	public static int countTotalOnes(int n) {
		int count = 0;
		while(n!=0) {
			n = n & (n-1);
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int n = 8;
		System.out.println("Total Count of One : "+ countOnes(n));
		System.out.println("By Algorithms : "+ countTotalOnes(n));
	}
}
