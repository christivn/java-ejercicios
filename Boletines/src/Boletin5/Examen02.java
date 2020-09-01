//////////////////////////////////////
//  EXAMEN 02 - Christian Ramos     //
//////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Examen02 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    int num=0;
    int contador=1;
    while(num<=0){ 
    System.out.print("Introduce un número entero: ");
    num=s.nextInt();
    
    if(num>0){
    System.out.println("---------------------------------");
    
    int suma=0;
    
        for(int i=1;i<=num;i++){
            if(i<=num-1){
            System.out.print(i+" + ");
            } else {
            System.out.print(i+" ");
            }
            suma+=i;
        }
        System.out.print("= "+suma);
        
    System.out.println("\n---------------------------------");
    System.out.println("La suma del valor "+num+" es: "+suma);
    System.out.println("El número de intentos ha sido: "+contador);
    } else {
        System.out.println("\n[ EL NUMERO INTRODUCIDO NO PUEDE SER MENOR A CERO O CERO ]");
        contador++;
    }
    }
        
    }
}
