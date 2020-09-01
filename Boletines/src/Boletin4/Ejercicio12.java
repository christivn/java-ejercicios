//////////////////////////////////////
//  Ejercicio 12 - Christian Ramos  //
//////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio12 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    int puntos=0;
    
    System.out.println("�Cu�l es la longitud de un tipo de dato byte?");
    System.out.println("a) 8 bit");
    System.out.println("b) 16 bit");
    System.out.println("c) 32 bit");
    System.out.print("\nRespuesta: ");
    String p1=s.nextLine();
    if(p1.toLowerCase().equals("a")){
      puntos++;
    }
    
    System.out.println("\n+--------------------------------+\n");
    
    System.out.println("En la precedencia de operadores cual va antes");
    System.out.println("a) &&");
    System.out.println("b) + -");
    System.out.println("c) * / %");
    System.out.print("\nRespuesta: ");
    String p2=s.nextLine();
    if(p2.toLowerCase().equals("c")){
      puntos++;
    }
    
    System.out.println("\n+--------------------------------+\n");
    
    System.out.println("�Cu�l es la longitud de un tipo de dato int");
    System.out.println("a) 1.000.000");
    System.out.println("b) 2*10^9");
    System.out.println("c) 10.000.000");
    System.out.print("\nRespuesta: ");
    String p3=s.nextLine();
    if(p3.toLowerCase().equals("b")){
      puntos++;
    }
    
    System.out.println("\n+--------------------------------+");
    System.out.println("| Puntuaci�n: "+puntos+" de 3\t\t |");
    System.out.println("+--------------------------------+");
}
}
