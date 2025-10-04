// Clase que representa un nodo del árbol binario
class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}

public class ArbolBinario {

    // Método que cuenta los nodos de un árbol binario
    public static int contarNodos(Nodo raiz) {
        // Caso si el árbol está vacío
        if (raiz == null) {
            return 0;
        }
        // Cuenta el nodo actual, los nodos de la izquierda y los de la derecha
        return 1 + contarNodos(raiz.izquierdo) + contarNodos(raiz.derecho);
    }

    public static void main(String[] args) {
        // Construimos un árbol de ejemplo
        Nodo raiz = new Nodo(10);
        raiz.izquierdo = new Nodo(5);
        raiz.derecho = new Nodo(20);
        raiz.izquierdo.izquierdo = new Nodo(3);
        raiz.izquierdo.derecho = new Nodo(7);

        // Llamamos al método
        int cantidad = contarNodos(raiz);
        System.out.println("La cantidad de nodos del árbol es: " + cantidad);
    }
}
