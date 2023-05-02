package day13;

public class longestSameCharacter {
	public static void main(String[] args) {
		String[] string = { "flower", "flow", "flight" };
		String prefix = longestCommonPrefix(string);
		System.out.println(prefix);
		System.out.println();
		System.out.println("O(n)");
	}

	public static int prefixString(String string1, String string2) {
		int j;
		for (j = 0; j < string1.length() && j < string2.length() && string1.charAt(j) == string2.charAt(j); j++) {
		}
		return j;
	}

	public static String longestCommonPrefix(String[] arrayString) {
		int k = prefixString(arrayString[0], arrayString[1]);
		for (int index = 2; index < arrayString.length; index++) {
			k = Math.min(k, prefixString(arrayString[0], arrayString[index]));
		}
		return arrayString[0].substring(0, k);
	}

}
