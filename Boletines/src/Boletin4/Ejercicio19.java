//////////////////////////////////////
//  Ejercicio 19 - Christian Ramos  //
//////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio19 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    System.out.print("Introduce un número entero: ");
    int num=s.nextInt();
    int tamano=String.valueOf(num).length();
    
    System.out.println("----------------------------------");
    System.out.println("El número "+num+" tiene "+tamano+" cifras");
}
}
