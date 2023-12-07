package examen;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        String[] nombres = new String[numEstudiantes];
        double[][] notas = new double[numEstudiantes][3];

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese nombre y notas del estudiante " + (i + 1) + ": ");
            String[] entrada = sc.nextLine().split(" - ");
            nombres[i] = entrada[0];
            String[] notasStr = entrada[1].split("; ");
            for (int j = 0; j < 3; j++) {
                notas[i][j] = Double.parseDouble(notasStr[j]);
            }
        }

        mostrarDatos(nombres, notas);
    }

    public static void mostrarDatos(String[] nombres, double[][] notas) {
        System.out.printf("%-10s %5s %5s %5s %5s\n", "ALUMNO", "BD", "LM", "FH", "MEDIA");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < nombres.length; i++) {
            String nombreFormateado = nombres[i].length() > 10 ? nombres[i].substring(0, 7) + "..." : nombres[i];
            double media = (notas[i][0] + notas[i][1] + notas[i][2]) / 3;
            System.out.printf("%-10s %5.2f %5.2f %5.2f %5.4f\n", nombreFormateado, notas[i][0], notas[i][1], notas[i][2], media);
        }
    }
}
