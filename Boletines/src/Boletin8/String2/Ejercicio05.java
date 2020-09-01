/////////////////////////////////////
//  Ejercicio05 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String2;

public class Ejercicio05 {
    public static void main(String[] args) {
    
    String str="hola";
    char[] str_array=str.toCharArray();
    
    for(int n=0;n<str_array.length+1;n++){
    char[] auxiliar = new char[str_array.length];
    int cont=0;
    for(int i=0;i<auxiliar.length;i++){
        if(i<n){
            auxiliar[i]=str_array[(str_array.length-n)+cont];
            cont++;
        } else {
            auxiliar[i]=str_array[i];
        }
    }
    
    System.out.print(auxiliar);
    System.out.print(" ");
    }
    
    for(int i=0;i<str_array.length;i++){
        System.out.print(str_array[i]);
    }
    
    System.out.print("\n");
    }
}
