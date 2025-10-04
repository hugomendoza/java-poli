
public class Main {
  public static void main(String[] args) {
    int[] arreglo1 = {1, 2, 3, 4};
    int[] arreglo2 = {5, 6, 7, 8};
    int suma = 0;

    for(int i = 0; i < arreglo1.length; i++) {
      suma += arreglo1[i] * arreglo2[arreglo2.length - i - 1];
    }
    System.out.println("La suma de los productos es: " + suma);
  }
}