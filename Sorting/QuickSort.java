package Sorting;

public class QuickSort {
    
    public static int partition(int[] arr, int low, int high){
        int pivote = arr[high]; //we take last element as pivote
        int i=low-1; //i is used to take current element and compare with pivote
        for(int j=low;j<high;j++){
            if(arr[j]<pivote){
                i++; // to make seat for samll element
                //swap to give position to small element 
                int temp = arr[i]; //current elemet
                arr[i] = arr[j];  //j is smaller than pivote
                arr[j] = temp;
            }
        }
        // now for last swap to give pivote its real position
            i++;
            int temp = arr[i]; //current element
            arr[i] = pivote;  
            arr[high] = temp; //append current element to last pos
            return i;
    }

    public static void quicksort(int[] arr, int low, int high){
        if(low < high){
            int pividx = partition(arr,low,high);
            quicksort(arr,0,pividx-1);
            quicksort(arr,pividx+1,high);
        }

    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;
        quicksort(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
