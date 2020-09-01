//////////////////////////////////////
//  Ejercicio 18 - Christian Ramos  //
//////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio18 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    System.out.print("Introduce un número entero: ");
    String num=s.next();
    
    if(num.contains("0") || num.contains("1") || num.contains("2") || num.contains("3") || num.contains("4") || num.contains("5") || num.contains("6") || num.contains("7") || num.contains("8") || num.contains("9")){
      String primero = String.valueOf(num.charAt(0));
      primero = Character.toString(num.charAt(0));
      primero = num.substring(0, 1);
      
      int firts=Integer.parseInt(primero);
      int numero=Integer.parseInt(num);
    
      System.out.println("----------------------------------");
    
      System.out.println("La primera cifra del número "+numero+" es: "+firts);
    } else {
      System.out.print("[ DEBES INTRODUCIR UN NÚMERO ]");
  }
}
}
