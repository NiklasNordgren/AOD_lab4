package se.hig.aod.lab4;

import java.util.List;

/**
 * The {@code Sorter} class contains one single public static method {@code quickSort} that performs a Quicksort
 * on lists containing objects of the type comparable or has a superclass that is of the comparable type.
 * 
 * The strategy used to choose pivot element in the Quicksort algorithm is median of three.
 * 
 * @author Thomas Lundgren, Niklas Nordgren
 * @version 1.0.0
 * @since 2019-01-03
 */
public class Sorter {

	/**
	 * This method performs a Quicksort on a list object containing <T> generic
	 * type objects of the type comparable or has a superclass that is of the comparable type.
	 * 
	 * The strategy used to choose pivot element in the Quicksort algorithm is median of three.
	 *
	 * @param <T> the generic type
	 * @param list
	 */
	public static <T extends Comparable<? super T>> void quickSort(List<T> list) {
		
		if(list.size() <= 1)
			return;

		quickSorter(list, 0, list.size() - 1);
	
	}

	/**
	 * Quick sorter.
	 *
	 * @param <T> the generic type
	 * @param list the list
	 * @param low the index of the leftmost element
	 * @param high the index of the rightmost element
	 */
	private static <T extends Comparable<? super T>> void quickSorter(List<T> list, int low, int high) {

		T pivotValue = medianOfThree(list.get(low), list.get(low + (high - low) / 2), list.get(high));
		
		int left = low;
		int right = high;
	
		while(left <= right) {
			
			while(list.get(left).compareTo(pivotValue) < 0) {
				left++;
			}
			
			while(list.get(right).compareTo(pivotValue) > 0) {
				right--;
			}
			
			if(left <= right) {
				swap(list, left, right);
				left++;
				right--;
			}
			
		}
		
		if(low < right) {
			quickSorter(list, low, right);
		}
		
		if(left < high) {
			quickSorter(list, left, high);
		}
		
	}

	/**
	 * Swap places in the list of the elements at index a and b
	 *
	 * @param <T> the generic type
	 * @param list the list
	 * @param a index of element a
	 * @param b index of element b
	 */
	private static <T extends Comparable<? super T>> void swap(List<T> list, int a, int b) {

		T temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);

	}

	/**
	 * Median of three.
	 *
	 * @param <T> the generic type
	 * @param first the leftmost element
	 * @param middle the middle element
	 * @param last the rightmost element
	 * @return median of the first, middle and last element
	 */
	private static <T extends Comparable<? super T>> T medianOfThree(T first, T middle, T last) {

		if(first.compareTo(last) >= 0 && first.compareTo(middle) <= 0)
			return first;
		else if(last.compareTo(first) >= 0 && last.compareTo(middle) <= 0)
			return last;
		else
			return middle;
		
	}

}
