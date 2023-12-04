package examen;

public class Ejercicio1 {
	public static String convertirAsteriscos(String input) {

		if (input == null || input.length() < 3) {
			return input;
		}

		return input.charAt(0) + "*".repeat(input.length() - 2) + input.charAt(input.length() - 1);
	}

	public static void main(String[] args) {
		String prueba = "Ejemplo";
		System.out.println(convertirAsteriscos(prueba));
	}
}
