/////////////////////////////////////
//  Ejercicio 4 - Christian Ramos  //
/////////////////////////////////////

package Boletin2;
import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce el primer n�mero: ");
  int primero = s.nextInt();
  
  System.out.print("Introduce el segundo n�mero: ");
  int segundo = s.nextInt();
  
  System.out.println("\nSuma: "+primero+"+"+segundo+"= "+(primero+segundo));
  System.out.println("Resta: "+primero+"-"+segundo+"= "+(primero-segundo));
  System.out.println("Multiplicaci�n: "+primero+"*"+segundo+"= "+(primero*segundo));
  System.out.println("Divisi�n: "+primero+"/"+segundo+"= "+(primero/segundo));
}
}
