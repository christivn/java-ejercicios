/////////////////////////////////////
//  Ejercicio28 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int num=s.nextInt();
    
    System.out.println("-------------------------------------");
    
    int fac=num;
    int n=num;
    for(int i=0;i<num;i++){
        if((num-i-1)!=0){
        fac=n*(num-i-1);
        n=fac;
        }
    }
    
    System.out.println("El factorial de "+num+" es igual a: "+fac);
        
    }
}
