package day13;

public class squareRoot {
	public static void main(String[] args) {
		double num = 10;
		System.out.println(squareRRoot(num));
		System.out.println();
		System.out.println("O(n)");
	}

	public static double squareRRoot(double number) {
		double temp;
		double square = number / 2;
		for (;;) {
			temp = square;
			square = (temp + (number / temp)) / 2;
			if (temp == square) {
				break;
			}
		}
		return square;
	}
}
