/////////////////////////////////////
//  Ejercicio 7 - Christian Ramos  //
/////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio07 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    double n1;
    double n2;
    double n3;
    
    System.out.print("Ingresa la primera nota: ");
    n1=s.nextDouble();
    System.out.print("Ingresa la segunda nota: ");
    n2=s.nextDouble();
    System.out.print("Ingresa la tercera nota: ");
    n3=s.nextDouble();
    
    System.out.println("----------------------------------");
    
    System.out.println("La m�dia de las notas es igual a "+((n1+n2+n3)/3));
}
}
