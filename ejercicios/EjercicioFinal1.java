

public class EjercicioFinal1 {
  public static void main(String[] args) {
  }
  static int menor(int[]A) {
    if (A.length==1) return A[0];
    int[] B = new int[A.length-1];
    for(int i = 0; i < A.length-1; i++)
      B[i] = A[i];
    return Math.min(A[A.length-1], menor(B));
  } 
}