//////////////////////////////////////
//  Ejercicio 10 - Christian Ramos  //
//////////////////////////////////////

package Boletin2;
import java.util.Scanner;

public class Ejercicio10 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce MB: ");
  int mb = s.nextInt();
  
  System.out.println("\n"+mb+"MB son: "+(mb*1024)+"KB");
}
}
