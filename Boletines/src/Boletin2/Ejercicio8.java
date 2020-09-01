/////////////////////////////////////
//  Ejercicio 8 - Christian Ramos  //
/////////////////////////////////////

package Boletin2;
import java.util.Scanner;

public class Ejercicio8 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce las horas trabajadas diarias: ");
  int horas = s.nextInt();
  
  System.out.println("\nEl salario semanal es: "+(horas*12)*7);
}
}
