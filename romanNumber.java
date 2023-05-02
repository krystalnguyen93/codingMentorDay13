package day13;

public class romanNumber {
	public static void main(String[] args) {
		int romanCon = romanConvert("MCMLXXXIX");
		System.out.println(romanCon);
		System.out.println();
		System.out.println("O(n)");
	}

	public static int romanConvert(String romanNumber) {
		int num = 0;
		for (int i = 0; i < romanNumber.length();) {
			if (romanNumber.charAt(i) == 'I' && romanNumber.charAt(i + 1) == 'V') {
				num += 4;
				i += 2;
			} else if (romanNumber.charAt(i) == 'I' && romanNumber.charAt(i + 1) == 'X') {
				num += 9;
				i += 2;
			} else if (romanNumber.charAt(i) == 'I') {
				num++;
				i++;
			} else if (romanNumber.charAt(i) == 'V') {
				num += 5;
				i++;
			} else if (romanNumber.charAt(i) == 'X' && romanNumber.charAt(i + 1) == 'L') {
				num += 40;
				i += 2;
			} else if (romanNumber.charAt(i) == 'X' && romanNumber.charAt(i + 1) == 'C') {
				num += 90;
				i += 2;
			} else if (romanNumber.charAt(i) == 'X') {
				num += 10;
				i++;
			} else if (romanNumber.charAt(i) == 'L') {
				num += 50;
				i++;
			} else if (romanNumber.charAt(i) == 'C' && romanNumber.charAt(i + 1) == 'M') {
				num += 900;
				i += 2;
			} else if (romanNumber.charAt(i) == 'C' && romanNumber.charAt(i + 1) == 'D') {
				num += 400;
				i += 2;
			} else if (romanNumber.charAt(i) == 'C') {
				num += 100;
				i++;
			} else if (romanNumber.charAt(i) == 'D') {
				num += 500;
				i++;
			} else if (romanNumber.charAt(i) == 'M') {
				num += 1000;
				i++;
			} else {
				break;
			}
		}
		return num;
	}
}
