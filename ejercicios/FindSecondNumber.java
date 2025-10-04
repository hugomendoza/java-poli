// Grupo 18

// Tania Garcia Lavira
// Juan Codina Ariza
// Hugo Mendoza Soler

import java.util.Scanner;

class FindSecondNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int segundoMax = Integer.MIN_VALUE;

        for (int num : numeros) {
            if (num > max) {
                segundoMax = max;
                max = num;
            } else if (num > segundoMax && num != max) {
                segundoMax = num;
            }
        }

        if (segundoMax == Integer.MIN_VALUE) {
            System.out.println("No hay un segundo número más grande (todos los números son iguales).");
        } else {
            System.out.println("El segundo número más grande es: " + segundoMax);
        }

        scanner.close();
    }
}