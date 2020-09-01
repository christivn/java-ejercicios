/////////////////////////////////////
//  Ejercicio04 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String2;
public class Ejercicio04 {
    public static void main(String[] args) {
    
    String str="Tengo una hormiguita en la patita, que me esta haciendo cosquillitas y no me puedo aguantar";
    str=str.replaceAll(" +", " ");
    String[] array_palabras=str.split(" ");
    
    String primera_palabra=array_palabras[0];
    String ultima_palabra=array_palabras[array_palabras.length-1];
    
    System.out.println("Frase: "+str);
    System.out.println("Primera palabra: "+primera_palabra);
    System.out.println("Ultima palabra: "+ultima_palabra);
    if(primera_palabra.equals(ultima_palabra)){
        System.out.println("La primera palabra es igual a la ultima");
    } else {
        System.out.println("La primera palabra NO es igual a la ultima");
    }
    
    }
}
