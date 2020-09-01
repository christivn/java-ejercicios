//////////////////////////////////////
//  Ejercicio 11 - Christian Ramos  //
//////////////////////////////////////

package Boletin2;
import java.util.Scanner;

public class Ejercicio11 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce KB: ");
  int kb = s.nextInt();
  
  System.out.println("\n"+kb+"KB son: "+(kb/1024)+"MB");
}
}
