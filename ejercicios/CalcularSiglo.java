import java.util.Scanner;

public class CalcularSiglo {
  public static void main(String[] args) {
    int anho;
    Scanner entrada = new Scanner(System.in);
      do {
          System.out.println("Ingresa un año: ");
          anho = entrada.nextInt();
          if( anho < 0 ) {
            System.out.println("No puedes ingresar números negativos. Ingresa valores como 1945 o 1999");
          }
      } while( anho < 0 );
      int siglo = siglo(anho);
      int primerAnho = primerAnho(siglo);
      System.out.println("El año " + anho + " pertenece al siglo " + siglo);
      System.out.println("El primer año del siglo " + siglo + " es " + primerAnho);
      entrada.close();
  }

  static int siglo(int anho) {
    /*
     * El siglo se calcula sumando 1 al año
     * que se recibe como parametro dividido entre 100
     */
    return (anho / 100) + 1;
  }

  static int primerAnho(int siglo) {
    /*
     * El primer año del siglo se calcula multiplicando
     * el siglo que se recibe como parametro se resta 1
     * y después se multiplica por 100 sumando 1
     */
    return (siglo - 1) * 100 + 1;
  }
}
