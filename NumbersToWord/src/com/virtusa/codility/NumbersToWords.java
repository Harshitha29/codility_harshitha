package com.virtusa.codility;

public class NumbersToWords {
	private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	public static final String[] tens = { "", // 0
			"", // 1
			"Twenty", // 2
			"Thirty", // 3
			"Forty", // 4
			"Fifty", // 5
			"Sixty", // 6
			"Seventy", // 7
			"Eighty", // 8
			"Ninety" // 9
	};

	public String convertToWords(int n) {

		// Condition: If the number is less than zero.
		if (n < 0) {
			return "Number out of range";
		}

		// Condition: If the number is less than twenty.
		if (n < 20) {
			return units[n];
		}

		// Condition: If the number is less than hundred.
		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		// Condition: If the number is less than thousand.
		if (n < 1000) {
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " and " : "") + convertToWords(n % 100);
		}

		// Condition: If the number is less than lakh.
		if (n < 100000) {
			return convertToWords(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convertToWords(n % 1000);
		}

		// Condition: If the number is less than crore.
		if (n < 10000000) {
			return convertToWords(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convertToWords(n % 100000);
		}

		return convertToWords(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "")
				+ convertToWords(n % 10000000);

	}

}
