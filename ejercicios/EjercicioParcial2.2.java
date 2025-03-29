public class EjercicioParcial2 {
  public static void main(String[] args) {
    boolean a = false;
    boolean b = true;
    boolean c = !a;
    boolean d = a || b;
    boolean e = d || c && !a;
    boolean f = true && !e;
    System.out.println (a);
    System.out.println (b);
    System.out.println (c);
    System.out.println (d);
    System.out.println (e);
    System.out.println (f); 
  }
}