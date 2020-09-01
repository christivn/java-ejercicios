/////////////////////////////////////
//  Extra04 - Christian Ramos      //
/////////////////////////////////////

package Boletin5;
import java.util.Random;

public class Extra04 {
    public static void main(String[] args) {

    Random rnd = new Random();  
    int valor = rnd.nextInt(100);
        
    while(valor!=0){ 
        valor = rnd.nextInt(100);
        if(valor!=0){
         valor+=100;
        }
        System.out.print(valor);
        
        if(valor!=0){
        if((valor%2)==0){
            System.out.print(" - Par\n");
        } else {
            System.out.print(" - Impar\n");
        }
        } else {
            System.out.print(" - Par/Impar\n");
        }
    }
    
    }
}
