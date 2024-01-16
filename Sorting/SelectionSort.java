package Sorting;

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

