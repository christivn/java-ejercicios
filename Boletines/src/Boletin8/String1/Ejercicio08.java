/////////////////////////////////////
//  Ejercicio08 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String1;
public class Ejercicio08 {
    public static void main(String[] args) {
    
    String cadena1="  HoLa MuNdO";
    String cadena2="hOlA mUnDo ";
    
    System.out.println("Cadena 1: "+cadena1);
    System.out.println("Cadena 2: "+cadena2+"\n");
    
    cadena1=cadena1.toLowerCase().trim();
    cadena2=cadena2.toLowerCase().trim();
   
    System.out.println("Cadena 1: "+cadena1);
    System.out.println("Cadena 2: "+cadena2+"\n");
    
    if(cadena1.equals(cadena2)){
        System.out.println("Las cadenas de texto son iguales");
    } else {
        System.out.println("Las cadenas de texto no son iguales");
    }
    
    }
}
