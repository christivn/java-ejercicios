/////////////////////////////////////
//  Ejercicio 1 - Christian Ramos  //
/////////////////////////////////////

package Boletin2;
import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce el primer n�mero: ");
  int primero = s.nextInt();
  
  System.out.print("Introduce el segundo n�mero: ");
  int segundo = s.nextInt();
  
  System.out.println("\nEl resultado de la multiplicaci�n de "+primero+" y "+segundo+" es: "+(primero*segundo));
}
}
