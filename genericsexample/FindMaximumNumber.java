package genericsexample;

public class FindMaximumNumber {
	public static Double findMaximumNumber(Double x, Double y, Double z) {
		Double max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Maximum Number:" + findMaximumNumber(23.56, 12.34, 521.89));
	}
}
