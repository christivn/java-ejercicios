/////////////////////////////////////
//  Ejercicio23 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    int sum=0;
    int contador=0;

    while(sum<10000){
    System.out.print("Introduce un número (total:"+sum+"): ");
    int num=s.nextInt();
    
    sum+=num;
    contador++;
    }
    
    System.out.println("---------------------------------");
    System.out.println("Total acumulado: "+sum);
    System.out.println("Números introducidos: "+contador);
    System.out.println("Media: "+sum/contador);
    
    }
}
