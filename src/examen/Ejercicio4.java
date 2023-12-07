package examen;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroAlumnos = Integer.parseInt(scanner.nextLine().trim());

		ArrayList<String> nombres = new ArrayList<>();
		ArrayList<double[]> notas = new ArrayList<>();

		for (int i = 0; i < numeroAlumnos; i++) {
			String linea = scanner.nextLine().trim();
			String[] partes = linea.split(" - ");
			nombres.add(partes[0]);
			String[] calificaciones = partes[1].split("; ");
			double[] califs = new double[3];
			for (int j = 0; j < 3; j++) {
				califs[j] = Double.parseDouble(calificaciones[j].replace(',', '.'));
			}
			notas.add(califs);
		}

		mostrarTabla(nombres, notas);
		scanner.close();
	}

	private static void mostrarTabla(ArrayList<String> nombres, ArrayList<double[]> notas) {
		System.out.printf("%-10s |%5s|%5s|%5s|%8s\n", "ALUMNO", "BD", "LM", "FH", "MEDIA");
		System.out.println("----------|-----|-----|-----|--------");

		for (int i = 0; i < nombres.size(); i++) {
			double media = calcularMedia(notas.get(i));
			String nombreFormato = nombres.get(i).length() > 10 ? nombres.get(i).substring(0, 7) + "..."
					: nombres.get(i);
			System.out.printf("%-10s |%5.2f|%5.2f|%5.2f|%8.4f\n", nombreFormato, notas.get(i)[0], notas.get(i)[1],
					notas.get(i)[2], media);
		}
	}

	private static double calcularMedia(double[] calificaciones) {
		double suma = 0;
		for (double calificacion : calificaciones) {
			suma += calificacion;
		}
		return suma / calificaciones.length;
	}
}
