/////////////////////////////////////
//  Ejercicio04 - Christian Ramos  //
/////////////////////////////////////

package Boletin.Recursividad;

public class Ejercicio04 {
    public static void main(String[] args) {
       
        int a=6; // Dividendo
        int b=2; // Divisor
        int resultado= dividir(a,b);
        
        System.out.println("La división de ("+a+"/"+b+") es: "+resultado);
        
    }
    
    public static int dividir(int a,int b) {
        int r;
        if(a<b){
            return a;
        } else {
            r=1+dividir(a-b,b);
        }
        return r;
    }
}
