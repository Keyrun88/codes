package CodingRound.Java;

public class SwapTwoString {

	public static void main(String[] args) {

		String a = "Keyrun";
		String b = "Patil";

		System.out.println("String Before Swpping :: " + a + " " + b);

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("String after Swpping :: " + a + " " + b);

	}

}
