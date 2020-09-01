/////////////////////////////////////
//  Ejercicio 7 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio07 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int pass=1234;
  
    System.out.println("[ CAJA FUERTE ]");
    System.out.print("Introduce la combinación: ");
    int user_pass=s.nextInt();
    
    System.out.println("----------------------------------");
    
    if(user_pass!=pass){
    
    for(int i=0;i<4;i++){
      System.out.println("Lo siento, esa no es la combinación");
      System.out.println("[ TE QUEDAN "+(4-i)+" INTENTOS ]\n");
      
      System.out.print("Introduce la combinación de nuevo: ");
      user_pass=s.nextInt();
      System.out.println("----------------------------------");
      
      if(user_pass==pass){
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        i=4;
      } 
    }
    
    } else {
      System.out.println("La caja fuerte se ha abierto satisfactoriamente");
    }
}
}
