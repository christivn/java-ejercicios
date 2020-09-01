/////////////////////////////////////
//  Ejercicio21 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    int num=1;
    int par=0;
    int imp=0;
    
    int mayor=0;
    
    int t_media=0;
    int media=0;
    
    while(num>=0){
    System.out.print("Introduce un número (negativo para parar): ");
    num=s.nextInt();
    
   if((num%2)==0 && num>=0){
        par++;
        if(num>mayor){
            mayor=num;
        }
    } else if ((num%2)!=0 && num>=0){
        imp++;
        t_media+=num;
    }
    
    }
    
    media=t_media/imp;
    
    System.out.println("----------------------------------");
    System.out.println("El total de números introducidos es: "+(par+imp));
    System.out.println("La media de los impares es: "+media);
    System.out.println("El número mayor de los pares es: "+mayor);
        
    }
}
