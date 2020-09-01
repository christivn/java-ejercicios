//////////////////////////////////////
//  Ejercicio 12 - Christian Ramos  //
//////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio12 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    int x1=0;
    int x2=1;
    int x3; 

    System.out.print("Introduce la longitud de la serie: ");
    int contador=s.nextInt();
    
    System.out.println("----------------------------------");
    
    for(int i=0;i<contador;++i){
      x3=x1+x2;
      System.out.print(" "+x3);
      x1=x2;
      x2=x3;
    }  
    System.out.println("");
    
}
}
