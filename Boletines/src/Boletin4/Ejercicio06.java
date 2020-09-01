/////////////////////////////////////
//  Ejercicio 6 - Christian Ramos  //
/////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio06 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    double t;
    double g=9.81;
    double h;
    
    System.out.print("Ingresa el valor de la aultura: ");
    h=s.nextDouble();
    
    System.out.println("----------------------------------");
    
    t=Math.sqrt(((2*h)/g));
    System.out.println("El objeto tardar� en caer desde una altura de "+h+" metros "+t+" segundos");

  
}
}
