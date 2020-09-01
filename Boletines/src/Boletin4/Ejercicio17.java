//////////////////////////////////////
//  Ejercicio 17 - Christian Ramos  //
//////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio17 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    System.out.print("Introduce un n�mero entero: ");
    String num=s.next();
    
    if(num.contains("0") || num.contains("1") || num.contains("2") || num.contains("3") || num.contains("4") || num.contains("5") || num.contains("6") || num.contains("7") || num.contains("8") || num.contains("9")){
      int tamano=num.length();
      String ultimo=num.substring((tamano-1),tamano);
      int numero=Integer.parseInt(num);
    
      System.out.println("----------------------------------");
    
      System.out.println("La �ltima cifra del n�mero "+numero+" es: "+ultimo);
    } else {
      System.out.print("[ DEBES INTRODUCIR UN N�MERO ]");
  }
}
}
