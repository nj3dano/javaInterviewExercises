// a program to reverse a number 
// 7/19/16 dak
// example, pass in 567, return sum of 765

public class ReverseNumber {
	
	public int reverse(int number) {
		int reversedNumber = 0;
		while (number != 0){
			// multiple by 10 to shift the number left
			// then add the number you just plucked with modulo
			reversedNumber = (reversedNumber * 10) + (number  % 10);
			number = number / 10; // shorten the number by one place
		}
		return reversedNumber;
	}

	public static void main(String a[]) {
		ReverseNumber myApp = new ReverseNumber();
		System.out.println("Number is: " + myApp.reverse(567));
		System.out.println("Number is: " + myApp.reverse(987537));
		System.out.println("Number is: " + myApp.reverse(2));
	}
}