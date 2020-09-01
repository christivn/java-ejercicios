/////////////////////////////////////
//  Extra04 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String2;
import java.util.Scanner;

public class Extra04 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.print("Introduce una cadena de texto: ");
        String texto=s.nextLine();
        Extra04 frase=new Extra04(texto);
        
        frase.palabras();
    }
    
    
    String frase;
    public Extra04(String fra) {
        this.frase=fra;
    }
    
    public void palabras () {
        String[] palabras=frase.split(" ");
        for(int i=0;i<palabras.length;i++){
            System.out.println(palabras[i]);
        }
    }
    
}
