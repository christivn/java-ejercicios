/////////////////////////////////////
//  Ejercicio09 - Christian Ramos  //
/////////////////////////////////////

package Boletin.Recursividad;
public class Ejercicio09 {
    public static void main(String[] args) {
        String palabra="reconocer"; // Palabra de prueba
        System.out.println("Es un palíndromo la palabra ("+palabra+"): "+palindromo(palabra));
    }
    
    public static boolean palindromo(String str) {
        boolean r;
        if(str.length()>1){
            char[] chars = str.toCharArray();
            if(chars[0]==chars[chars.length-1]){
                r=palindromo(str.substring(1,str.length()-1));
            } else {
                return false;
            }
        } else {
            r=true;
        }
        return r;
    }

}
