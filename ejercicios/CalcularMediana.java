import java.util.Arrays;
import java.util.Scanner;

public class CalcularMediana {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese la dimensión del arreglo: ");
    int dimension = scanner.nextInt();

    int [] numeros = new int[dimension];

    System.out.println("Ingrese los elementos del arreglo: ");
    for (int i = 0; i < dimension; i++) {
      System.out.println("Numero " + (i + 1) + ": ");
      numeros[i] = scanner.nextInt();
    }

    double mediana =  obtenerMediana(numeros);

    System.out.println("La mediana del arreglo es: " + mediana);
    scanner.close();
  }

  public static double obtenerMediana(int[] numeros) {
    Arrays.sort(numeros);
    int longitudArreglo = numeros.length;
    if (numeros.length % 2 == 0) {
      return (numeros[longitudArreglo / 2 -1 ] + numeros[longitudArreglo / 2]) / 2.0;
    } else {
      return numeros[longitudArreglo / 2];
    }
  } 
}