package se.hig.aod.lab4;

import java.util.List;

public class Sorter {

	public static <T extends Comparable<? super T>> void quickSort(List<T> list) {
		
		if(list.size() <= 1)
			return;

		quickSorter(list, 0, list.size() - 1);
	}

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

	private static <T extends Comparable<? super T>> void swap(List<T> list, int a, int b) {

		T temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);

	}

	private static <T extends Comparable<? super T>> T medianOfThree(T first, T middle, T last) {

		if(first.compareTo(last) >= 0 && first.compareTo(middle) <= 0)
			return first;
		else if(last.compareTo(first) >= 0 && last.compareTo(middle) <= 0)
			return last;
		else
			return middle;
		
	}

}
