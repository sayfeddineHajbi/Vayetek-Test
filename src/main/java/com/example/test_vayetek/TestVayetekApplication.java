package com.example.test_vayetek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestVayetekApplication {

	public static void main(String[] args) {
		String calibrationDocument = "1abc2\n" +
				"pqr3stu8vwx\n" +
				"a1b2c3d4e5f\n" +
				"treb7uchet\n";

		String[] lines = calibrationDocument.split("\n");

		int somme = 0;

		for (int i = 0; i < lines.length; i++) {
			String line = lines[i];
			String digitsOnly = line.replaceAll("[^0-9]", "");

			if (!digitsOnly.isEmpty()) {
				char firstChar = digitsOnly.charAt(0);
				char lastChar = digitsOnly.charAt(digitsOnly.length() - 1);

				int firstDigit = Character.getNumericValue(firstChar);
				int lastDigit = Character.getNumericValue(lastChar);

				int calibrationValue = firstDigit * 10 + lastDigit;

				somme = calibrationValue+somme;
			}
		}

		System.out.println("La somme totale des valeurs d'étalonnage est : " + somme);
	}
}
