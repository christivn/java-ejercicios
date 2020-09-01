/////////////////////////////////////
//  Ejercicio07 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String2;
public class Ejercicio07 {
    public static void main(String[] args) {
    
    String str="Tengo una hormiguita en la patita, que me esta haciendo cosquillitas y no me puedo aguantar.";
    String palabra="cosquillitas";
    
    int ocurrencias=str.indexOf(palabra);
    
    System.out.println("Frase: "+str);
    System.out.println("Palabra a buscar: "+palabra);
    
        if(ocurrencias!=-1){
            System.out.println("La frase contiene la palabra \""+palabra+"\"");
        } else {
            System.out.println("La frase NO contiene la palabra \""+palabra+"\"");
        }
        
    }
}
