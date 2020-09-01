//////////////////////////////////////
//  Ejercicio 11 - Christian Ramos  //
//////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio11 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    int hora;
    int minuto;
    
    System.out.print("Hora: ");
    hora=s.nextInt();
    
    System.out.print("Minutos: ");
    minuto=s.nextInt();
    
    System.out.println("----------------------------------");
    

    int h_media_noche= (24-hora)*3600;
    int m_media_noche= (60-minuto)*60;
    
    if(hora==0){
      h_media_noche=0;
    }
    
    if(minuto==0){
      m_media_noche=0;
    }

    if(hora>23 || hora<0 || minuto>60 || minuto<0){
      System.out.println("[ DEBES INTRODUCIR UNA HORA VALIDA ]");
    } else {
      System.out.println("Quedan "+(h_media_noche+m_media_noche)+" segundos para media noche");
      System.out.println("Quedan "+(h_media_noche/3600)+" horas y "+(m_media_noche/60)+" minutos para media noche");
    }
}
}
