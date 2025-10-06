import java.util.HashSet;
import java.util.Scanner;

public class ValidarSubconjunto {
  public static void main(String[] args) {
    int tamanoConjuntoS;
    int tamanoConjuntoT;

    Scanner ingresarTamanoConjuntoS = new Scanner(System.in);
    System.out.println("Ingresa el tamaño del conjunto S: ");

    tamanoConjuntoS = ingresarTamanoConjuntoS.nextInt();
    int[] conjuntoS = new int[tamanoConjuntoS];

    Scanner ingresarValoresConjuntoS = new Scanner(System.in);
    System.out.println("Ingresa los elementos del conjunto S: ");

    for (int i = 0; i < tamanoConjuntoS; i++) {
      conjuntoS[i] = ingresarValoresConjuntoS.nextInt();
    }

    Scanner ingresarTamanoConjuntoT = new Scanner(System.in);
    System.out.println("Ingresa el tamaño del conjunto T: ");

    tamanoConjuntoT = ingresarTamanoConjuntoT.nextInt();
    int[] conjuntoT = new int[tamanoConjuntoT];

    Scanner ingresarValoresConjuntoT = new Scanner(System.in);
    System.out.println("Ingresa los elementos del conjunto T: ");

    for (int i = 0; i < tamanoConjuntoT; i++) {
      conjuntoT[i] = ingresarValoresConjuntoT.nextInt();
    }

    esSubconjunto(conjuntoS, conjuntoT);

    ingresarTamanoConjuntoS.close();
    ingresarValoresConjuntoS.close();
    ingresarTamanoConjuntoT.close();
    ingresarValoresConjuntoT.close();
  }

  public static boolean esSubconjunto(int[] S, int[] T) {
    HashSet<Integer> setT = new HashSet<>();
    for (int elemento : T) {
      setT.add(elemento);
    }

    for (int elemento : S) {
      if (!setT.contains(elemento)) {
        System.out.println("El conjunto S no es un subconjunto del conjunto T.");
        return false;
      }
    }
    System.out.println("El conjunto S es un subconjunto del conjunto T.");
    return true;
  }

}