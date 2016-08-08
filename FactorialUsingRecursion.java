// dak 8/8/16
import java.util.Scanner;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		// eg 4! = 4*3*2*1 = 24
		// eg 7! = 7*6*5*4*3*2*1 = 5040
		// eg 1! = 1*1 = 1

		System.out.println("Enter the number to perform factorial");
		Scanner input = new Scanner(System.in);
		int numberForFactorial = input.nextInt();
		System.out.println(factorial(numberForFactorial));
		input.close();
	}

	private static int factorial(int value) {
		// System.out.printf("value is %d\n", value);
		// you need to provide a way for the method to stop calling itself
		if (value == 1) {
			return 1;
		}
		return factorial(value - 1) * value;
	}
}

// Tower of Hanoi is another puzzle where you can use a recursion solution

