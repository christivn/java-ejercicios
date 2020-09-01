/////////////////////////////////////
//  Ejercicio 5 - Christian Ramos  //
/////////////////////////////////////

package Boletin2;
import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce la base del rectangulo: ");
  int b = s.nextInt();
  
  System.out.print("Introduce la altura del rectangulo: ");
  int h = s.nextInt();
  
  System.out.println("\nEl area del rectangulo es: "+(b*h));
}
}
