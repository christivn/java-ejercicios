/////////////////////////////////////
//  Ejercicio 2 - Christian Ramos  //
/////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio02 { 
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce una hora (1,2,3,4,...,22,23,00): ");
  int hora = s.nextInt();
  
  
  System.out.println("--------------------------------------------------------");

  if(hora>=6 && hora<=12){
    System.out.print("Buenos d�as");
  } else if(hora>=13 && hora<=20){
    System.out.print("Buenas tardes");
  } else if(hora<=21 && hora>=5){
    System.out.print("Buenas noches");
  } else {
    System.out.print("[ Debes introducir una hora valida ]");
  }
  
}
}
