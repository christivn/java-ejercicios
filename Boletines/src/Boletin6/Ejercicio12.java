/////////////////////////////////////
//  Ejercicio12 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
public class Ejercicio12 {
    public static void main(String[] args) throws InterruptedException {
    
    boolean bucle=true;
    while(bucle==true){
        
        for(int i=0;i<150;i++){
        int rand=((int)(Math.random()*(126+1))+32);
        char caracter=(char)rand;
        System.out.print("\033[0;32m"+caracter);
        }
        Thread.sleep(500);
        System.out.print("\n");
        
    }
        
    }
}
