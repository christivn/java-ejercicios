/////////////////////////////////////
//  Ejercicio05 - Christian Ramos  //
/////////////////////////////////////

package Boletin.Recursividad;

public class Ejercicio05 {
    public static void main(String[] args) {
        int n=62; // Número a probar
        int resultado=sumadigitos(n);
        
        System.out.println("La suma de los dígitos de ("+n+") es: "+resultado);
    }
    
    public static int sumadigitos(int n) {
        int r;
        if(n<10){
            return n;
        } else {
            r=1+sumadigitos(n-10);
        }
        return r;
    }
}
