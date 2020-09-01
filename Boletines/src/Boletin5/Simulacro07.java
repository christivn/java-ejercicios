/////////////////////////////////////
//  Simulacro07 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;
public class Simulacro07 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Escriba la altura: ");
    int altura=s.nextInt();
    
    System.out.println("------------------------------------");
    
    int contador=1;
    for(int i=0;i<altura;i++){
    
        for(int x=0;x<(altura-i);x++){
            if(contador<10){
                System.out.print(contador+" ");
            } else {
                System.out.print(contador);
            }
            contador++;
        }
        
     System.out.print("\n");
    }
    
    }
}
