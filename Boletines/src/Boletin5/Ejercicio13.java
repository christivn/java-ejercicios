//////////////////////////////////////
//  Ejercicio 13 - Christian Ramos  //
//////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio13 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int p_contador=0;
    int n_contador=0;
    
    for(int i=0;i<10;i++){
      System.out.print("Introduce números positivos y negativos: ");
      int num=s.nextInt();
      
      if(num>0){
        p_contador+=1;
      } else if(num<0){
        n_contador+=1;
      }
    }
    
    System.out.println("----------------------------------");
    System.out.println("Números positivos: "+p_contador);
    System.out.println("Números negativos: "+n_contador);
    
}
}
