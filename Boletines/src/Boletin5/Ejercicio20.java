//////////////////////////////////////
//  Ejercicio 20 - Christian Ramos  //
//////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio20 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un caracter: ");
    String c=s.next();
    
    System.out.print("Introduce la altura de la piramide: ");
    int a=s.nextInt();

    System.out.println("----------------------------------");
    
    int i=0;
    while(a>i){
        for(int x=a;x>i;x--){
            System.out.print(" ");
        }
        
        for(int x=0;x<(i+1);x++){
            if(i==(a-1)){
                System.out.print(c);
            } else {
            if(x<1){
                System.out.print(c);
            } else {
                System.out.print(" ");
            }
            }
        }
        
        for(int x=0;x<i;x++){
            if(i==(a-1)){
                System.out.print(c);
            } else {
            if(x==(i-1)){
                System.out.print(c);
            } else {
                System.out.print(" ");
            }
            }
        }
        System.out.print("\n");
        i++;
    }
    
}
}
