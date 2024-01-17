package Sorting;

import java.util.Arrays;

public class insertionsort {

  void insertionSort(int array[]) {
    int size = array.length;

    ///loop into unsorted array
    for (int i = 1; i < size; i++) {
      int current = array[i]; //unsorted array madhla elment
      int j = i - 1; //sorted madhla element cha start

      // Compare current with each element on the left of it until an element smaller than
      // it is found.
      // For descending order, change current<array[j] to current>array[j].
      while (j >= 0 && current < array[j]) {
        array[j + 1] = array[j];
        --j;
      }

      // Place current at after the element just smaller than it.
      array[j + 1] = current;
    }
  }

  // Driver code
  public static void main(String args[]) {
    int[] data = { 9, 5, 1, 4, 3 };
    insertionsort is = new insertionsort();
    is.insertionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}

