//////////////////////////////////////
//  Ejercicio 10 - Christian Ramos  //
//////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio10 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    int dia;
    int mes;
    
    System.out.print("D�a de nacimiento: ");
    dia=s.nextInt();
    
    System.out.print("Mes de nacimiento: ");
    mes=s.nextInt();
    
    System.out.println("----------------------------------");
    
    if(dia>=22 && mes==12 || dia<=20 && mes==1){
      System.out.println("Tu horoscopo es Capricornio");
    } else if(dia>=21 && mes==1 || dia<=19 && mes==2){
      System.out.println("Tu horoscopo es Acuario");
    } else if(dia>=20 && mes==2 || dia<=20 && mes==3){
      System.out.println("Tu horoscopo es Piscis");
    } else if(dia>=21 && mes==3 || dia<=20 && mes==4){
      System.out.println("Tu horoscopo es Aries");
    } else if(dia>=21 && mes==4 || dia<=21 && mes==5){
      System.out.println("Tu horoscopo es Tauro");
    } else if(dia>=22 && mes==5 || dia<=21 && mes==6){
      System.out.println("Tu horoscopo es G�minis");
    } else if(dia>=22 && mes==6 || dia<=23 && mes==7){
      System.out.println("Tu horoscopo es C�ncer");
    } else if(dia>=24 && mes==7 || dia<=23 && mes==8){
      System.out.println("Tu horoscopo es Leo");
    } else if(dia>=24 && mes==8 || dia<=23 && mes==9){
      System.out.println("Tu horoscopo es Virgo");
    } else if(dia>=24 && mes==9 || dia<=23 && mes==10){
      System.out.println("Tu horoscopo es Libra");
    } else if(dia>=24 && mes==10 || dia<=22 && mes==11){
      System.out.println("Tu horoscopo es Escorpio");
    } else if(dia>=23 && mes==11 || dia<=21 && mes==12){
      System.out.println("Tu horoscopo es Sagitario");
    }
  
}
}
