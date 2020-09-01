/////////////////////////////////////
//  Ejercicio 5 - Christian Ramos  //
/////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio05 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    int x;
    int a;
    int b;
    
    System.out.print("Ingresa el valor de A: ");
    a= s.nextInt();
    
    System.out.print("Ingresa el valor de b: ");
    b= s.nextInt();
    
    System.out.println("----------------------------------");
    
    if(a!=0){
    x= -b/a;
    System.out.println("Resultado de la ecuaci�n: "+x);
 
    }else if (b!=0){
    System.out.println("No hay soluci�n");
 
    }else{
    System.out.println ("La solucion es indeterminada");
    }
  
}
}
