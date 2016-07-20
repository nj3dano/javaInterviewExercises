// a program to find sum of each digit in the given number using recursion
// 7/19/16 dak
// example, pass in 223, return sum of 2+2+3=7

public class SumOfEachDigitInANumber {
	int sum = 0;

	// modulo is the number remaining after division
	public int getNumberSum(int number) {
		if (number == 0) {
			return sum;
		} else {
			sum += (number % 10);      // get the remainder
			getNumberSum(number / 10); // shorten the number
		}
		return sum;
	}

	public static void main(String[]  arg) {
		SumOfEachDigitInANumber myApp = new SumOfEachDigitInANumber();
		myApp.sum = 0; System.out.println("Sum is: " + myApp.getNumberSum(223));
		myApp.sum = 0; System.out.println("Sum is: " + myApp.getNumberSum(154));
		myApp.sum = 0; System.out.println("Sum is: " + myApp.getNumberSum(1064));
		myApp.sum = 0; System.out.println("Sum is: " + myApp.getNumberSum(9));
	}
}
