/////////////////////////////////////
//  Ejercicio06 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String2;
public class Ejercicio06 {
    public static void main(String[] args) {
    
    String str="Tengo una hormiguita en la patita, que me esta haciendo cosquillitas y no me puedo aguantar. Esto es una segunda frase de ejemplo para ver que la frase ha terminado en el punto.";
    str=str.replaceAll(" +", " ");
    String[] str_frase=str.split("\\.");
    
    for(int i=0;i<str_frase.length;i++){
        String[] array_palabras = str_frase[i].split(" ");
        
        System.out.println("Frase "+(i+1)+": "+str_frase[i]);
        System.out.println("La frase "+(i+1)+" tiene "+array_palabras.length+" palabras\n");
    }
    
    }
}
