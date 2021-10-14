package genericsexample;

public class FindMaximumNumber {
	public static Integer findMaximumNumber(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Maximum Number:" + findMaximumNumber(20, 23, 21));
	}
}
