/////////////////////////////////////
//  Ejercicio06 - Christian Ramos  //
/////////////////////////////////////

package Boletin.Recursividad;

public class Ejercicio06 {
    public static void main(String[] args) {
        int n=123; // Número a probar
        int resultado=invertir(n);
        
        System.out.println("El número ("+n+") invertido es: "+resultado);
        
    }
    
    public static int invertir(int n) {
        if(n<10){
            return n;
        } else {
            return Integer.parseInt(reves(String.valueOf(n)));
        }
    }
    
    public static String reves(String str) {
        String r;
        if(str.length()==1){
            return str;
        } else {
            r=reves(str.substring(1))+str.charAt(0);
        }
        return r;
    }
}
