/////////////////////////////////////
//  Ejercicio01 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
public class Ejercicio01 {
    public static void main(String[] args) {
    
    int suma=0;
        for(int i=0;i<3;i++){
            int rand=(int)(Math.random()*6) + 1;
            suma+=rand;
            System.out.println("(Tirada "+(i+1)+") Dado es igual a: "+rand);
        }
    System.out.println("----------------------------------------");
    System.out.println("La suma de los dados es igual a: "+suma);

    }
}
