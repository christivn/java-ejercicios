//////////////////////////////////////
//  Ejercicio 20 - Christian Ramos  //
//////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio20 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    System.out.print("Introduce un número entero: ");
    int num=s.nextInt();
    
    int tamano=String.valueOf(num).length();
    String p1=String.valueOf(num).substring(0,(tamano/2));
    String u1=String.valueOf(num).substring((tamano-p1.length()),tamano);
    
    int numero1=Integer.parseInt(p1);
    int resultado1=0;
     while(numero1>0) {
        resultado1=resultado1+(numero1%10);
        numero1=numero1/10;
      }
      
    int numero2=Integer.parseInt(u1);
    int resultado2=0;
     while(numero2>0) {
        resultado2=resultado2+(numero2%10);
        numero2=numero2/10;
      }
    
    System.out.println("----------------------------------");

    if(resultado1==resultado2){
      System.out.println("El número "+num+" es capicúa");
    } else {
      System.out.println("El número "+num+" no es capicúa");
    }
}
}
