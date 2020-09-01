/////////////////////////////////////
//  Ejercicio 8 - Christian Ramos  //
/////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio08 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    double n1;
    double n2;
    double n3;
    
    System.out.print("Ingresa la primera nota: ");
    n1=s.nextDouble();
    System.out.print("Ingresa la segunda nota: ");
    n2=s.nextDouble();
    System.out.print("Ingresa la tercera nota: ");
    n3=s.nextDouble();
    
    System.out.println("----------------------------------");
    
    double media=(n1+n2+n3)/3;
    System.out.println("La m�dia de las notas es igual a "+media);
    
    if(media<5){
      System.out.println("[INSUFICIENTE]");
    } else if(media>=5 && media<=6){
      System.out.println("[BIEN]");
    } else if(media>=7 && media<=8){
      System.out.println("[NOTABLE]");
    } else if(media>=9 && media<=10){
      System.out.println("[SOBRESALIENTE]");
    }
}
}
