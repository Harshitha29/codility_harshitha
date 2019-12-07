package com.virtusa.codility;

import java.util.*;
import java.io.IOException;

public final class NumbersToWordsMain {
	private final NumbersToWords numberWords;
	private final Scanner sc;

	public NumbersToWordsMain() {
		numberWords = new NumbersToWords();
		sc = new Scanner(System.in);
	}

	public void evaluate() throws IOException {
		while (true) {
			try {
				System.out.print("Enter the number (0 to exit): ");
				String value;
				value = sc.nextLine();
				int number = Integer.parseInt(value);
				if (number == 0) {
					break;
				} else {
					String result = numberWords.convertToWords(number);
					System.out.println(result);
				}

			} catch (NumberFormatException e) {
				System.out.println("Invalid number");
			}
		}
	}

	public static void main(String[] args) {
		try {
			new NumbersToWordsMain().evaluate();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}