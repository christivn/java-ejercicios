/////////////////////////////////////
//  Ejercicio09 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
public class Ejercicio09 {
    public static void main(String[] args) {
    
    int rand=0;
    int contador=0;
    while(rand!=24){
        rand=(int)(Math.random()*(101));
        System.out.println(rand);
        contador++;
    }
    System.out.println("+---------------------------------+");
    System.out.println("Se han generado "+contador+" números");
        
    }
}
