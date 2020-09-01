/////////////////////////////////////
//  Ejercicio25 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int num=s.nextInt();
    String snum=String.valueOf(num);
    
    StringBuilder inver= new StringBuilder(snum);
    String sinver=inver.reverse().toString();
    
    System.out.println("--------------------------------");
    System.out.println("El número del revés es: "+sinver);
        
    }
}
