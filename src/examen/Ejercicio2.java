package examen;

import java.util.Scanner;

public class Ejercicio2 {
	public static String convertirAsteriscos(String input) {

		if (input == null || input.length() < 3) {
			return input;
		}

		return input.charAt(0) + "*".repeat(input.length() - 2) + input.charAt(input.length() - 1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String prueba = in.next();
		System.out.println(convertirAsteriscos(prueba));
		in.close();

	}
}
