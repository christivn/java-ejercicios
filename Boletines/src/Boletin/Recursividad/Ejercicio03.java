/////////////////////////////////////
//  Ejercicio03 - Christian Ramos  //
/////////////////////////////////////

package Boletin.Recursividad;
public class Ejercicio03 {
    public static void main(String[] args) {
        System.out.println(reves("Hola Mundo"));
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
