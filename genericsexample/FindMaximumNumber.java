package genericsexample;

import java.util.Arrays;

public class FindMaximumNumber<T extends Comparable<T>> {
	T[] array;

	public FindMaximumNumber(T[] array) {
		this.array = array;
	}

	public T testMaximum() {
		return FindMaximumNumber.testMaximum(array);
	}

	public static <T extends Comparable<T>> T testMaximum(T[] array) {
		// Sorted array in increasing order.
		for (int k = 0; k < array.length - 1; k++) {
			for (int i = 0; i < array.length - k - 1; i++) {
				if (array[i].compareTo(array[i + 1]) > 0) {
					T temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}

		System.out.println("Sorted array" + Arrays.toString(array));
		printMax(array);
		return array[array.length - 1];
	}

	public static <T> void printMax(T[] array) {
		System.out.println("Maximum  Element:" + array[array.length - 1]);
	}

	public static void main(String[] args) {

		Integer[] arrayInt = { 12, 43, 5, 63, 67, 89, 23, 65, 100 };
		Double[] arrayDouble = { 1.26, 123.6, 90.4, 21.3, 89.87, 34.67, 78.56 };
		String[] arrayString = { "Apple", "Banana", "Peach", "Mango", "Orange" };

		new FindMaximumNumber<Integer>(arrayInt).testMaximum();
		new FindMaximumNumber<Double>(arrayDouble).testMaximum();
		new FindMaximumNumber<String>(arrayString).testMaximum();
	}
}
