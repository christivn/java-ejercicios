/////////////////////////////////////
//  Ejercicio 3 - Christian Ramos  //
/////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio03 { 
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Ingresa un n�mero del 1 al 7 (Obtendras el d�a de la semana): ");
  int num = s.nextInt();
  
  String dia;
  
  switch(num) {
  case 1:
    dia="Lunes";
    break;
    
  case 2:
    dia="Martes";
  break;
  
  case 3:
    dia="Miercoles";
  break;
  
  case 4:
    dia="Jueves";
  break;
  
  case 5:
    dia="Viernes";
  break;
  
  case 6:
    dia="Sabado";
  break;
  
  case 7:
    dia="Domingo";
  break;
    
  default:
    dia="ERROR";
}
  System.out.println("--------------------------------------------------------");

  if(!dia.equals("ERROR")){
    System.out.println("\nEl n�mero "+num+" corresponde la d�a de la semana: "+dia);
  } else {
    System.out.println("\n[N�MERO NO VALIDO]");
    System.out.println("Debes introducir un n�mero del 1 al 7");
  }
  
}
}
