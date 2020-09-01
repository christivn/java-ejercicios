//////////////////////////////////////
//  Ejercicio 21 - Christian Ramos  //
//////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio21 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
  
    System.out.print("Nota del primer control: ");
    double n1=s.nextDouble();
    
    System.out.print("Nota del segundo control: ");
    double n2=s.nextDouble();
    
    double media=(n1+n2)/2;
    
    System.out.println("----------------------------------");

    if(media<5){
        System.out.print("�Cu�l ha sido el resultado de la recuperaci�n? (apto/no apto): ");
        String apto=s.next();
        
        if(apto.toLowerCase().equals("apto")){
          media=5;
        } else {
          media=4.5;
        }
    }
    
    System.out.print("Tu nota de Programaci�n es: "+media);

}
}
