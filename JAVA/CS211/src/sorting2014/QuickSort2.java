package sorting2014;

import java.util.ArrayList;
import java.util.List;

public class QuickSort2 implements Sorter{
	 private Comparable[] numbers;
	  private int number;
	@Override
	public void sort(Comparable[] items, int cutoff) {
	 
		 this.sort2(items);
		
	}

	 

	  public void sort2(Comparable[] values) {
	    // check for empty or null array
	    if (values ==null || values.length==0){
	      return;
	    }
	    this.numbers = values;
	    number = values.length;
	    quicksort(0, number - 1);
	  }

	  private void quicksort(int low, int high) {
	    int i = low, j = high;
	    // Get the pivot element from the middle of the list
	    Comparable pivot = numbers[low + (high-low)/2];

	    // Divide into two lists
	    while (i <= j) {
	      // If the current value from the left list is smaller then the pivot
	      // element then get the next element from the left list
	      while (numbers[i].compareTo(pivot) < 0 ) {
	        i++;
	      }
	      // If the current value from the right list is larger then the pivot
	      // element then get the next element from the right list
	      while (numbers[j].compareTo(pivot) > 0 ) {
	        j--;
	      }

	      // If we have found a values in the left list which is larger then
	      // the pivot element and if we have found a value in the right list
	      // which is smaller then the pivot element then we exchange the
	      // values.
	      // As we are done we can increase i and j
	      if (i <= j) {
	        exchange(i, j);
	        i++;
	        j--;
	      }
	    }
	    // Recursion
	    if (low < j)
	      quicksort(low, j);
	    if (i < high)
	      quicksort(i, high);
	  }

	  private void exchange(int i, int j) {
	    Comparable temp = numbers[i];
	    numbers[i] = numbers[j];
	    numbers[j] = temp;
	  }
	 
	
}