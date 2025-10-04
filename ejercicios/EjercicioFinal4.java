public class EjercicioFinal4 {
  public static void main(String[] args) {
    int n = 5;
    int m = n * 2;
   int i = 1;
   while (i < m) {
       int j = 1;
       while (j < m) {
           if (i == 1 || i == m - 1) {
               if (j <= n)
                   System.out.print (" " + j + " ");
               else
                   System.out.print (" " + (m - j) + " ");
           } else if (j == 1 || j == m - 1) {
               if (i <= n)
                   System.out.print (" " + i + " ");
               else
                   System.out.print (" " + (m - i) + " ");
           } else {
               System.out.print ("   ");
           }         j = j + 1;
       }
       System.out.println ();
       i = i + 1;
   } 
  }
}