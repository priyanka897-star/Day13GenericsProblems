package genericsexample;

public class FindMaximumNumber<T extends Comparable<T>> {
	T x, y, z;

	public FindMaximumNumber(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximum() {
		return FindMaximumNumber.maximum(x, y, z);

	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static String testMaximum(String x, String y, String z) {

		String max = y;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		Integer xInt = 4, yInt = 5, zInt = 6;
		Double xDouble = 45.23, yDouble = 67.25, zDouble = 12.89;
		String xString = "Apple", yString = "Banana", zString = "Orange";

		String maximum = FindMaximumNumber.testMaximum(xString, yString, zString);
		System.out.println("Maximum String are :" + maximum);

		int maxInt = new FindMaximumNumber<Integer>(xInt, yInt, zInt).maximum();
		System.out.println("Maximum Number are :" + maxInt);

		double maxDouble = new FindMaximumNumber<Double>(xDouble, yDouble, zDouble).maximum();
		System.out.println("Maximum Number are :" + maxDouble);

		String maxString = new FindMaximumNumber<String>(xString, yString, zString).maximum();
		System.out.println("Maximum String are :" + maxString);
	}
}
