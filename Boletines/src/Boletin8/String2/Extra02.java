/////////////////////////////////////
//  Extra02 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String2;
import java.util.Scanner;

public class Extra02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.print("Introduce una cadena de texto: ");
        String texto=s.nextLine();
        Extra02 cadena=new Extra02(texto);
        
        System.out.print("\n");
        
        cadena.primera_mitad_derecha();
        cadena.ultimo_caracter();
        cadena.invertir();
        cadena.caracteres_separados_gion();
        cadena.cantidad_vocales();
        cadena.texto_capicua();
                
    
        System.out.print("\n");
    }
    
    
    String str;
    public Extra02(String cadena) {
        this.str=cadena;
    }
    
    public void primera_mitad_derecha () {
        System.out.println("a) Primera mitad a la derecha: "+str.substring(0,(str.length()/2)));
    }
    
    
    
    public void ultimo_caracter () {
        System.out.println("b) Ultimo caracter: "+str.substring(str.length()-1,str.length()));
    }
    
    
    
    public void invertir () {
        String invertido="";
        for(int i=str.length()-1;i>=0;i--){
            invertido+=str.charAt(i);
        }
        System.out.println("c) Invertido: "+invertido);
    }
    
    
    
    public void caracteres_separados_gion () {
        String separado="";
        for(int i=0;i<str.length();i++){
            if(i!=str.length()-1){
                separado+=str.charAt(i)+"-";
            } else {
                separado+=str.charAt(i);
            }
        }
        System.out.println("d) Caracteres separados por gión: "+separado);
    }
    
    
    
    public void cantidad_vocales () {
        int cont=0;
        for(int i=0;i<str.length();i++){
            if(str.toLowerCase().charAt(i)=='a' || str.toLowerCase().charAt(i)=='e' || str.toLowerCase().charAt(i)=='i' || str.toLowerCase().charAt(i)=='o' || str.toLowerCase().charAt(i)=='u'){
                cont++;
            }
        }
        System.out.println("e) Cantidad de vocales: "+cont);
    }
    
    
    public void texto_capicua () {
        String invertido="";
        for(int i=str.length()-1;i>=0;i--){
            invertido+=str.charAt(i);
        }
        
        if(invertido.toLowerCase().equals(str.toLowerCase())){
            System.out.println("f) "+str+" se lee igual en las dos direcciones");
        } else {
            System.out.println("f) "+str+" NO se lee igual en las dos direcciones");
        }
    }
    
}
