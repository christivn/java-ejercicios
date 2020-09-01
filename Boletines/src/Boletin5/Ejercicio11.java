//////////////////////////////////////
//  Ejercicio 11 - Christian Ramos  //
//////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio11 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
  
    System.out.print("Introduzca un número: ");
    int num=s.nextInt();
    System.out.println("\nNúmero  Cuadrado   Cubo");
    System.out.println("-------------------------");

    for (int i=num;i <num+5; i++) {
            
      System.out.printf("%4d %8d %9d\n", i, i*i, i*i*i);
    }
  
}
}
