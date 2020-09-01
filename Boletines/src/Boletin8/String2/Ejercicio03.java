/////////////////////////////////////
//  Ejercicio03 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String2;
public class Ejercicio03 {
    public static void main(String[] args) {
    
    String str="Tengo una hormiguita en la patita, que me esta haciendo cosquillitas y no me puedo aguantar. Esto es una segunda frase de ejemplo para ver que la frase ha terminado en el punto.";
    str=str.replaceAll(" +", " ");
    String str_frase=str.substring(0, str.indexOf("."));
    String[] array_palabras = str_frase.split(" ");
    
    System.out.println("Frase: "+str_frase);
    System.out.println("La frase tiene "+array_palabras.length+" palabras");
    }
}
