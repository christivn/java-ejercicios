/////////////////////////////////////
//  Ejercicio13 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
public class Ejercicio13 {
    public static void main(String[] args) throws InterruptedException {
    
    int dado1=0;
    int dado2=1;
    
    while(dado1!=dado2){
    dado1=((int)(Math.random()*(6))+1);
    dado2=((int)(Math.random()*(6))+1);
    
    if(dado1==dado2){
        System.out.println("\n\n\n[Ambos dados son iguales]");
    }
    
    System.out.println("+--------------------------+");
    System.out.println("| Dado 1 es: "+dado1+"             |");
    System.out.println("| Dado 2 es: "+dado2+"             |");
    System.out.println("+--------------------------+\n");
    Thread.sleep(1000);
    }

    }
}
