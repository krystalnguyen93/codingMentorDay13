package day13;

import java.util.Arrays;

public class sort {
	public static void main(String[] args) {
		int arrayInput[] = { 1, 2, 2, 0, 0, 1, 2, 2, 1 };
		sortArray(arrayInput);
		System.out.println(Arrays.toString(arrayInput));
		System.out.println();
		System.out.println("O(n)");
	}

	public static int[] sortArray(int[] array) {
		int countzero = 0;
		int countone = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 0) {
				countzero++;
			}

			if (array[i] == 1) {
				countone++;
			}
		}

		for (int i = 0; i < countzero; i++) {
			array[i] = 0;
		}

		for (int i = countzero; i < (countzero + countone); i++) {
			array[i] = 1;
		}

		for (int i = (countzero + countone); i < array.length; i++) {
			array[i] = 2;
		}
		return array;
	}

}