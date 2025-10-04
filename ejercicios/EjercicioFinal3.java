public class EjercicioFinal3 {
  public static void main(String[] args) {
    int n=2;   

    for (int i=1; i<=n; i++){

    for (int j=n; j>=1; j--){

    if (i>j){                         

    System.out.print (j+2);     

    }else{                      

    System.out.print (" ");     

    }          

    if (i>=j){                                    

    System.out.print (i);       

    }else{

    System.out.print ("");      

    }

    }

    System.out.println();

    }
  }
}