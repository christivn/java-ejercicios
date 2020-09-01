/////////////////////////////////////
//  Ejercicio 2 - Christian Ramos  //
/////////////////////////////////////

package Boletin2;
import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce los euros que quieres pasar a pesetas: ");
  double euros = s.nextDouble();
  double pesetas = euros*166.386;
  
  System.out.println("\n"+euros+" euros son: "+pesetas+" pesetas");
}
}
