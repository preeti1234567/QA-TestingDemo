package javaDay1;

public class AddingNumbers {
	// Write a program to calculate factorial of a number
	 int factOfNumber(int factNumber) {
		int fact = 1;

		for (int i = 1; i <= factNumber; i++) {
			fact = fact * i;
		}
		return fact;
	}
// Write a program to print the numbers in pyramid format
	/*
	 * static void printNumberInPyramidFormat (int number) {
	 * 
	 * }
	 */
		
	

	public static void main(String[] args) {
		// Program for printing name less than or equal to 7 times
		String name = "Preeti";
		boolean ans = false;
		for (int i = 0; i <= 7; i++) {
			System.out.println(name);

		}
//conditional loop if the boolean value is true or false 
		if (ans == true) {
			System.out.println("boolean has true value");
		} else {
			System.out.println("boolean variable has false value");
		}
//loop for printing name less than 5 using while loop	
		int l = 0;
		do {
			System.out.println(name);
			l++;
		} while (l < 5);

//loop for calculating multiplication of number 1 to 6 upto 20 times	
		for (int j = 0; j <= 6; j++) {
			System.out.println("Multiplication Table of " + j + " is: ");
			int k = 0;
			do {
				System.out.println(j + "*" + k + "=" + j * k);
				k++;
			} while (k <= 10);
		}

//loop for reversing the given number

		int[] n1 = { 1, 2, 3, 4, 5 };

		for (int m = n1.length - 1; m >= 0; m--) {
			System.out.println("The reverse of the number" + n1[m]);
		}

// program for verifying given number is pallindrome or not
// % gives the remainder value
// '/' gives the quotient value
		int number = 4962;
		int originalnumber = number;
		int reverse = 0;
		while (number != 0) {

			int lastdigit = number % 10;

			reverse = reverse * 10 + lastdigit;

			number /= 10;
		}
		System.out.println(reverse);

		if (originalnumber == reverse) {
			System.out.println("number is pallindrome");
		} else {
			System.out.println("number is not pallindrome");
		}

//Write a program to reverse the array of characters.
		char[] charArray = { 'A', 'B', 'C', 'D', 'E' };
		char[] newArray = new char[charArray.length];

		System.out.println(charArray);
		int n = 0;
		for (int i = charArray.length - 1; i >= 0; i--) {
			// System.out.println("The reverse of the Array of characters are: " +
			// charArray[i]);

			newArray[n] = charArray[i];
			n++;

		}
		System.out.println(newArray);
	 
	
		AddingNumbers ad = new AddingNumbers();
		int result = ad.factOfNumber(10);
		 System.out.println("The factorial of a given number is: " + result);	
		
		
		//printNumberInPyramidFormat(7);
		
		int inputnumber =1;
		int [] Array1 = new int[6];
		//int[] Array2 = new int [(Array1.length) -1];
		for (int i=0; i<Array1.length; i++) {
			Array1[i]= inputnumber;
			System.out.println(Array1[i]);
			inputnumber = inputnumber + 1;
			
			
		
		}
		//System.out.println (Array1);
	}
}
