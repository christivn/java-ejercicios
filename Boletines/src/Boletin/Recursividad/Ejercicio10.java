/////////////////////////////////////
//  Ejercicio10 - Christian Ramos  //
/////////////////////////////////////

package Boletin.Recursividad;
public class Ejercicio10 {
    public static void main(String[] args) {
        int b=6; // Base
        int e=2; // Exponente
        int resultado= potencia(b,e);
        System.out.println("El resultado de ("+b+"^"+e+") es: "+resultado);
    }
    
    private static int potencia(int b, int e){
        if(e==0){
            return 1;
        } else if (e<0) {
            return potencia(b,e+1)/b;
        } else {
            return b*potencia(b,e-1);
        }
    }
    
}
