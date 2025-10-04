// Grupo 18

// Tania Garcia Lavira
// Juan Codina Ariza
// Hugo Mendoza Soler

import java.util.Scanner;

class Nodo {
  int valor;
  Nodo izquierdo;
  Nodo derecho;

  Nodo(int valor) {
    this.valor = valor;
    this.izquierdo = null;
    this.derecho = null;
  }
}

public class EncontrarNodo {
  public static void main(String[] args) {
    int tamanoArreglo;
    Nodo raiz = null;

    Scanner ingresarTamanoArreglo = new Scanner(System.in);
    System.out.println("Ingresa el tamaño del arreglo: ");
    
    tamanoArreglo = ingresarTamanoArreglo.nextInt();
    int[] arreglo = new int[tamanoArreglo];
    
    Scanner ingresarDatosArreglo = new Scanner(System.in);
    System.out.println("Ingresa los elementos del arreglo: ");
    
    for (int i = 0; i < tamanoArreglo; i++) {
      arreglo[i] = ingresarDatosArreglo.nextInt();
    }
    
    for (int valor : arreglo) {
      raiz = insertar(raiz, valor);
    }

    Scanner ingresarNodo = new Scanner(System.in);
    System.out.println("Ingresa el nodo a buscar: ");

    int nodo = ingresarNodo.nextInt();

    boolean result = buscar(raiz, nodo);

    System.out.println("El resultado de tu busqueda es " + (result ? "verdadero" : "falso"));

    ingresarTamanoArreglo.close();
    ingresarDatosArreglo.close();
    ingresarNodo.close();
  }

  static Nodo insertar(Nodo raiz, int valor) {
    if(raiz == null) {
      return new Nodo(valor);
    }
    if(valor < raiz.valor) {
      raiz.izquierdo = insertar(raiz.izquierdo, valor);
    } else if (valor > raiz.valor) {
      raiz.derecho = insertar(raiz.derecho, valor);
    }
    return  raiz;
  }

  static boolean buscar(Nodo raiz, int valor) {
    if(raiz == null) {
      return false;
    }
    if(valor == raiz.valor) {
      return true;
    } else if (valor < raiz.valor) {
      return buscar(raiz.izquierdo, valor);
    } else {
      return buscar(raiz.derecho, valor);
    }
  }
} 