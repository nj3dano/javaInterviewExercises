// a program to reverse a string using recursive algorithm 
// 7/19/16 dak
// example, pass in "hat", return "tah"

public class ReverseStringUsingRecursion {
	String reverse = "";

	public String reverse(String str) {
		if( str.length() <= 1 ){
			return str; // this is where you put the last character
		}
		int lastIndex = str.length() - 1; // shorten the string by one
		return str.charAt(lastIndex) + reverse(str.substring(0, lastIndex));
	}

	public static void main(String a[]) {
		ReverseStringUsingRecursion myApp = new ReverseStringUsingRecursion();
		System.out.println("String is: " + myApp.reverse("Dottie Ann Kessler"));
		System.out.println("String is: " + myApp.reverse("hat"));
		System.out.println("String is: " + myApp.reverse("Q"));
	}
}
