
// a program to print the fibonacci sequence
// 7/19/16 dak
// Help at: http://www.java2novice.com/java-interview-programs/
// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 41815

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Enter the limit for the sequence");
		Scanner input = new Scanner(System.in);
		int limit = input.nextInt();

		// the start of the sequence 0 1 1
		int currentMinusOne = 1;
		int currentMinusTwo = 0;

		// print out the start and decrease the loop counter by the first 2
		System.out.print(currentMinusTwo + " " + currentMinusOne + " ");
		limit -= 2;

		// start at the 3rd value which is a 1: 0 1 1
		int current = 1;
		for (int i = 0; i < limit; i++) {
			current = currentMinusOne + currentMinusTwo;
			System.out.print(current + " ");

			// set up for next iteration
			currentMinusTwo = currentMinusOne;
			currentMinusOne = current;
		}

		// close the input
		input.close();
	}
}
