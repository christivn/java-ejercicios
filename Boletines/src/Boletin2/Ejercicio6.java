/////////////////////////////////////
//  Ejercicio 6 - Christian Ramos  //
/////////////////////////////////////

package Boletin2;
import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce la base del triangulo: ");
  int b = s.nextInt();
  
  System.out.print("Introduce la altura del triangulo: ");
  int h = s.nextInt();
  
  System.out.println("\nEl area del triangulo es: "+(b*h)/2);
}
}
