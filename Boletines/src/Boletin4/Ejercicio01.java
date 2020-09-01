/////////////////////////////////////
//  Ejercicio 1 - Christian Ramos  //
/////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio01 { 
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Ingresa un d�a de la semana (Lunes, Martes...): ");
  String dia = s.nextLine();
  dia=dia.toLowerCase();
  
  String asignatura;
  
  switch(dia) {
  case "lunes":
    asignatura="Programacion";
    break;
    
  case "martes":
    asignatura="Programacion";
  break;
  
  case "miercoles":
    asignatura="Bases de datos";
  break;
  
  case "jueves":
    asignatura="Sistemas Informaticos";
  break;
  
  case "viernes":
    asignatura="Formacion y orientacion laboral";
  break;
    
  default:
    asignatura="ERROR";
}
  System.out.println("--------------------------------------------------------");

  if(!asignatura.equals("ERROR")){
    System.out.println("\nEl "+dia+" tienes a primera hora "+asignatura);
  } else {
    System.out.println("\n[D�A NO VALIDO]");
    System.out.println("Debes introducir un d�a de la semana de Lunes a Viernes");
  }
  
}
}
