package Array;


public class Sort012 {
	 public static void sortArray(int[] nums, int n) {

		 int temp=0, low=0, mid=0, high=n-1;

	        while(mid<=high){
	            switch(nums[mid]){
	                case 0 : {
	                    temp = nums[low];
	                    nums[low] = nums[mid];
	                    nums[mid] = temp;
	                     low++;
	                     mid++;
	                }
	                 break;

	                case 1 :
	                    mid++;
	                
	                break;

	                case 2: {
	                    temp = nums[mid];
	                    nums[mid] = nums[high];
	                    nums[high] = temp;
	                    high--;
	                }
	                break;
	                

	            }
	        }
	    }

	    public static void main(String args[]) {
	        int n = 6;
	        int[] arr = {2,1,0,2,1,1,0,2};
	        sortArray(arr, n);
	        System.out.println("After sorting:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();

	    }

}
