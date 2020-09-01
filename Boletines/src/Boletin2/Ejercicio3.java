/////////////////////////////////////
//  Ejercicio 3 - Christian Ramos  //
/////////////////////////////////////

package Boletin2;
import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce las pesetas que quieres pasar a euros: ");
  double pesetas = s.nextDouble();
  double euros = pesetas/166.386;
  
  System.out.println("\n"+pesetas+" pesetas son: "+euros+" euros");
}
}
