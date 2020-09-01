/////////////////////////////////////
//  Ejercicio08 - Christian Ramos  //
/////////////////////////////////////

package Boletin.Recursividad;
public class Ejercicio08 {
    public static void main(String[] args) {
        String palabra="reconocer"; // Palabra de prueba
        System.out.println("Es un palíndromo la palabra ("+palabra+"): "+palindromo(palabra));
    }
    
    public static boolean palindromo(String str) {
        if(str.equals(reves(str))){
            return true;
        } else {
            return false;
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
