/////////////////////////////////////
//  Ejercicio09 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String2;
public class Ejercicio09 {
    public static void main(String[] args) {
        
    String str="Tengo una hormiguita en la patita, que me esta haciendo cosquillitas y no me puedo aguantar";

    System.out.println("Frase original: "+str);
    System.out.print("Frase invertida: ");
    for(int i=str.length()-1;i>=0;i--){
        char caracter=str.charAt(i);
        System.out.print(caracter);
    }
    System.out.print("\n");
    
    }
}
