/////////////////////////////////////
//  Ejercicio 9 - Christian Ramos  //
/////////////////////////////////////

package Boletin2;
import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("Introduce el radio del cono: ");
  int radio = s.nextInt();
  
    System.out.print("Introduce la altura del cono: ");
  int altura = s.nextInt();
  
  double volumen = ((Math.PI*(radio*radio))*altura)/3;
  
  System.out.println("\nEl valumen del cono es: "+volumen);
}
}
