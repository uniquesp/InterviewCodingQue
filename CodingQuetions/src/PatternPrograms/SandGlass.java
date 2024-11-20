package PatternPrograms;

public class SandGlass {
	 public static void main(String[] args) {
	        int rows = 10; 
	      
	        // Lower part of the hourglass
	        for (int i = rows - 1; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	    }
}
