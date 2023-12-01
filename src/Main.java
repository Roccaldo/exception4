public class Main {
	public static void main(String[] args) {
		division(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20);
	}

	public static void division(int[] arrayNumb, int numbToDivide) {
		try {
			int result = arrayNumb[numbToDivide] / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}