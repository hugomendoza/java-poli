import java.util.Scanner;


public class CalculateCentury {
  public static void main(String[] args) {
    int year;
    Scanner entrada = new Scanner(System.in);
      do {
          System.out.println("Ingresa un año: ");
          year = entrada.nextInt();
          if( year < 0 ) {
            System.out.println("Ingresa un  número positivo");
          }
      } while( year < 0 );
      int century = siglo(year);
      primerAnho(century);
      entrada.close();
  }

  static int siglo(int year) {
    int century = (year / 100) + 1;
    System.out.println("El año " + year + " pertenece al siglo " + century);
    return century;
  }
  

  static int primerAnho(int century) {
    int year = (century - 1) * 100 + 1;
    System.out.println("El primer año del siglo " + century + " es " + year);
    return year;
  }
}

// import java.util.Scanner;


// public class CalculateCentury {
//   public static void main(String[] args) {
//     int year;
//     Scanner entrada = new Scanner(System.in);
//       do {
//           System.out.println("Ingresa un año: ");
//           year = entrada.nextInt();
//           if( year < 0 ) {
//             System.out.println("Ingresa un  número positivo");
//           }
//       } while( year < 0 );
//       siglo(year);
//       entrada.close();
//   }

//   static int siglo(int year) {
//     int century = (year / 100) + 1;
//     System.out.println("El año " + year + " pertenece al siglo " + century);
//     primerAnho(century);
//     return century;
//   }
  
//   static int primerAnho(int century) {
//     int year = (century - 1) * 100 + 1;
//     System.out.println("El primer año del siglo " + century + " es " + year);
//     return year;
//   }
// }