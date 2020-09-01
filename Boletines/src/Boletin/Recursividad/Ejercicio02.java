/////////////////////////////////////
//  Ejercicio02 - Christian Ramos  //
/////////////////////////////////////

package Boletin.Recursividad;

public class Ejercicio02 {
    public static void main(String[] args) {
       
        int n=7; // Número para comprobar la función
        int resultado= fibonacci(n);
        
        System.out.println("El número de fibonacci de la posición ("+n+") es: "+resultado);
    }
    
    public static int fibonacci(int n) {
        
        int r=0;
        if(n<=2){
            return 1;
        } else {
            r=fibonacci(n-1)+fibonacci(n-2);
        }
        
        return r;
    }
}
