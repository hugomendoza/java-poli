

public class EjercicioParcial1 {
  public static void main(String[] args) {
    int numero = 22;
    int resultado = 0;
    if (numero % 2 == 0) {
      if (numero % 4 == 0) {
        if (numero % 6 == 0)
          resultado = 3;
        else
          resultado = 2;
        }
      else {
        resultado = 1;
      }
    }
    else {
      resultado = 0;
    }
    System.out.println("El resultado es: " + resultado + " para el numero " + numero); 
  }
}