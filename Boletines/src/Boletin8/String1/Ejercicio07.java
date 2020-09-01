/////////////////////////////////////
//  Ejercicio07 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String1;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un texto para ser formateado: ");
    String introducido=s.nextLine();
    
    System.out.println("\nTexto formateado: ");
    introducido=introducido.substring(0,1).toUpperCase()+introducido.substring(1,introducido.length()).toLowerCase();
    System.out.println(introducido);
    
    
    }
}
