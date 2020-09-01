//////////////////////////////////////
//  Ejercicio 22 - Christian Ramos  //
//////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio22 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    System.out.print("Día de la semana (Lunes, Martes...): ");
    String dia=s.next();
    
    System.out.print("Ingresa una hora (00,01,02,...,13,14): ");
    int hora=s.nextInt();
    
    System.out.print("Ingresa los minutos (00,01,02,...,13,14): ");
    int minuto=s.nextInt();
    
      int hora_r=24-hora;
      int minuto_r=60-minuto;
    
    switch(dia.toLowerCase()){
      case "lunes":
        hora=hora+((24*4)+13);
      break;
    
      case "martes":
        hora=hora+((24*3)+13);
      break;
      
      case "miercoles":
        hora=hora+((24*2)+13);
      break;
      
      case "jueves":
        hora=hora+((24*1)+13);
      break;
      
      case "viernes":
        hora=hora+((24*0)+13);
      break;
      
      case "sabado":
        hora=hora+((24*6)+13);
      break;
      
      case "domingo":
        hora=hora+((24*5)+13);
      break;
    }
    
    minuto=minuto_r+((hora_r+hora)*60);
        
    System.out.println("----------------------------------");
    System.out.println("Quedan "+minuto+" minutos para el viernes a las 13:00h");

}
}
