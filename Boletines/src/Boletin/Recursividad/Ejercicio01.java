/////////////////////////////////////
//  Ejercicio01 - Christian Ramos  //
/////////////////////////////////////

package Boletin.Recursividad;
public class Ejercicio01 {
    public static void main(String[] args) {
       
        int n=5; // Número para comprobar la función
        int resultado= factorial(n);
        
        System.out.println("El factorial de ("+n+") es: "+resultado);
    }
    
    public static int factorial(int n) {
        
        int r=0;
        if(n<=1){
            return 1;
        } else {
            r=factorial(n-1)+factorial(n-2);
        }
        
        return r;
    }
}
