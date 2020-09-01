//////////////////////////////////////
//  Ejercicio 15 - Christian Ramos  //
//////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio15 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    System.out.print("Introduce un caracter: ");
    String caracter=s.nextLine();
    
    System.out.print("Direcci�n del vertice de la piramide (izquierda, derecha, abajo, arriba): ");
    String dire=s.nextLine();
    
    System.out.println("----------------------------------\n");
    
    switch(dire.toLowerCase()){
      case "izquierda":
        System.out.println("  "+" "+" "+caracter);
        System.out.println("  "+" "+caracter+caracter);
        System.out.println("  "+caracter+caracter+caracter);
        System.out.println(" "+caracter+caracter+caracter+caracter);
        System.out.println("  "+caracter+caracter+caracter);
        System.out.println("  "+" "+caracter+caracter);
        System.out.println("  "+" "+" "+caracter);
      break;
      
      
      case "derecha":
        System.out.println(" "+caracter+" "+" "+" ");
        System.out.println(" "+caracter+caracter+" "+" ");
        System.out.println(" "+caracter+caracter+caracter+" ");
        System.out.println(" "+caracter+caracter+caracter+caracter);
        System.out.println(" "+caracter+caracter+caracter+" ");
        System.out.println(" "+caracter+caracter+" "+" ");
        System.out.println(" "+caracter+" "+" "+" ");
      break;
      
      
      case "abajo":
        System.out.println(" "+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
        System.out.println(" "+" "+caracter+caracter+caracter+caracter+caracter);
        System.out.println(" "+" "+" "+caracter+caracter+caracter);
        System.out.println(" "+" "+" "+" "+caracter);
      break;
      
      
     case "arriba":
        System.out.println(" "+" "+" "+" "+caracter);
        System.out.println(" "+" "+" "+caracter+caracter+caracter);
        System.out.println(" "+" "+caracter+caracter+caracter+caracter+caracter);
        System.out.println(" "+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
     break;
     
      default:
      System.out.println("[ DEBES INTRODUCIR LA DIRECCI�N DEL VERTICE ]");
    }
    
}
}
