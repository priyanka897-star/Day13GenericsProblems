package genericsexample;

public class FindMaximumNumber {
	public static String findMaximumString(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Maximum Number:" + findMaximumString("Apple", "Peach", "Banana"));
	}
}
