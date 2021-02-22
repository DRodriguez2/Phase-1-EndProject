package functions;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class ViewFiles {

	public void showFiles(String _directory) {
		File directory = new File(_directory);
		List<String> list = Arrays.asList(directory.list());
		String[] fileNames = (String[]) list.toArray();
		mergeSort(fileNames, 0, fileNames.length - 1);

		// check if stream is empty and print accordingly
		if (list.stream().findAny().isPresent())
			list.stream().forEach(n -> System.out.println(n));
		else
			System.out.println("Empty Directory");

		/**
		 * This program was developed on a windows 10 machine which automatically sorts
		 * files in a directory by file name in ascending order. So it is trivial to
		 * sort the files above because they are already sorted. But for the
		 * assignment's sake/practice I implemented a merge sort that works too.
		 * See unit test for testing mergeSort with unsorted data.
		 */

	}

	public static void mergeSort(String[] arr, int low, int high) {

		// find the correct mid point relative to the low and high indices.
		int mid = low + (high - low) / 2;

		// Set condition to prevent infinite recursion and recursively call merge sort.
		// Call merge once the bottom of the recursion tree is reached.
		if (low < high) {
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}

	}

	private static void merge(String[] arr, int low, int mid, int high) {

		// Create two sub arrays with lengths based on the current low, mid, and high
		String[] leftSubarray = new String[mid - low + 1];
		String[] rightSubarray = new String[high - mid];

		// Copy the appropriate elements from the original array into the sub arrays
		for (int i = low, j = 0, k = 0; i <= high; i++) {
			if (j < leftSubarray.length) {
				leftSubarray[j] = arr[i];
				j++;
			} else {
				rightSubarray[k] = arr[i];
				k++;
			}
		}
		/*
		 * i is a pointer for the original array, j is a pointer for the left sub array,
		 * k is a pointer for the right sub array Compare the elements from the left and
		 * right sub arrays, putting the smaller element into the original array at
		 * index i. i is incremented every time an element is inserted.
		 */
		int i = low, j = 0, k = 0;
		while (j < leftSubarray.length && k < rightSubarray.length) {
			if (rightSubarray[k].compareTo(leftSubarray[j]) > 0) {
				arr[i] = leftSubarray[j];
				j++;
			} else {
				arr[i] = rightSubarray[k];
				k++;
			}
			i++;
		}

		/**
		 * Once either sub array has inserted all their elements into the original array
		 * the while loop above will end. In which case the remaining elements of the
		 * other sub array should be inserted into the original array, which is done in
		 * the while loops below. The elements being inserted at this point are
		 * guaranteed to already be sorted because both sub arrays should already be
		 * sorted.
		 */
		while (j < leftSubarray.length) {
			arr[i] = leftSubarray[j];
			j++;
			i++;
		}
		while (k < rightSubarray.length) {
			arr[i] = rightSubarray[k];
			k++;
			i++;
		}
	}

}
