
import java.util.Scanner;
//import java.lang.String;

public class APP {

	public static void main(String[] args) {
		String myValue = null;

		Scanner scan = new Scanner(System.in);
		System.out.println("White Space Eminiator");
		System.out.println("Enter your string: ");
		myValue = scan.nextLine();
		System.out.printf("Input String  is: %s\n", myValue);

		String myValueStrippedOfWhitepace = myValue.replaceAll("\\s+", "");
		System.out.printf("Output String is  %s\n", myValueStrippedOfWhitepace);
		scan.close();

		String str = "This is a String to use as an example to present raplaceAll";

		// replace all occurrences of 'a' with '@'
		String newStr = str.replaceAll("a", "@");
		System.out.println(newStr);
		
		// replace all occurrences of 'e' with '3'
		newStr = newStr.replaceAll("e", "3");
		System.out.println(newStr);

		// replace all occurrences of 't' with 'T'
		newStr = newStr.replaceAll("t", "T");
		System.out.println(newStr);
		
		// remove all occurrences of 'o'
		newStr = newStr.replaceAll("o", "");
		System.out.println(newStr);

		// replace all occurrences of 't' with 'That'
		newStr = newStr.replaceAll("T", "That");
		System.out.println(newStr);

	}
}
