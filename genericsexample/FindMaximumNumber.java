package genericsexample;

public class FindMaximumNumber<T extends Comparable<T>> {
	T x, y, z;

	public static <T extends Comparable<T>> T findMaximumNumber(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Maximum  Number using Integer type are: " + findMaximumNumber(45, 67, 27));
		System.out.println("Maximum  Number using Double type are: " + findMaximumNumber(123.32, 89.67, 75.27));
		System.out.println("Maximum  String  using String type are: " + findMaximumNumber("Apple", "Banana", "Orange"));
	}
}