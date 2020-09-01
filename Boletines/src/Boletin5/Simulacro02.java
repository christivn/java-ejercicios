/////////////////////////////////////
//  Simulacro02 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;
public class Simulacro02 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
        
    System.out.print("Escribe una altura: ");
    int altura=s.nextInt();
    
    int numeros=0;
    
    System.out.println("------------------------------");
    
    if(altura>=1){
    for(int i=1;i<=altura;i++){
        for(int x=2;x<i+2;x++){
            System.out.print(x);
            numeros++;
        }
     System.out.println("");
    }
    
    for(int i=1;i<=altura;i++){
        for(int x=2;x<(altura-i)+3;x++){
            System.out.print(x);
            numeros++;
        }
     System.out.println("");
    }
    System.out.println("\nSe han introducido: "+numeros+" números");
    } else {
        System.out.println("[ DEBES INTRODUCIR UNA ALTURA VALIDA ]");
    }

    }
}
