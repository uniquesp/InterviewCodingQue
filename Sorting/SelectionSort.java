package Sorting;

import java.util.Arrays;

class SelectionSort {
  void selectionSort(int array[]) {
    int size = array.length;

    for (int step = 0; step < size - 1; step++) {
      int min_idx = step;

      for (int i = step + 1; i < size; i++) {

        // To sort in descending order, change > to < in this line.
        // Select the minimum element in each loop.
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }

      // put min at the correct position
      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }

  // driver code
  public static void main(String args[]) {
    int[] data = { 20, 12, 10, 15, 2 };
    SelectionSort ss = new SelectionSort();
    ss.selectionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}


/*------------------------------------------------------------------------------------------------------------------- */


/*

public class SelectionSort {
    
    public static void selectionSort(int[] arr) {
    	//Your code goes here
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = arr[i];
            int minIndex = i;
            for(int j=i+1;j<n;j++){
            	 if(arr[j]<min){
                     min = arr[j];
                     minIndex = j;
                 }
            }
            
            if(minIndex!=i){
              arr[minIndex] = arr[i];
                arr[i] = min;    
            }
        }
    } 

}
*/
