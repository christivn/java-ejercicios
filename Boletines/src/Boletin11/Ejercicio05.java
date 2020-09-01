/////////////////////////////////////
//  Ejercicio05 - Christian Ramos  //
/////////////////////////////////////

package Boletin11;

import Boletin11.clases.Archivo;
import Boletin11.clases.Ruta;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) throws IOException {
    
    System.out.println("[ QUITAR COMENTARIOS DE UN PROGRAMA ]");
    System.out.println("EJ: quita_commentarios programa.txt programalimpio.txt");
    System.out.println("--------------------------------------------------------");
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el comando: ");
    String comando_str = sc.nextLine();
    String[] comando = comando_str.split(" "); 

    if(comando.length==3 && comando[0].toLowerCase().equals("quita_commentarios")){
        Ruta r_fichero=new Ruta(comando[1]);
        Ruta r_nuevofichero=new Ruta(comando[2]);
    
        Archivo archivo= new Archivo(r_fichero);
        String[] lineas=archivo.leer();
        
        // Bucle que quita los comentarios
        for(int i=0;i<lineas.length;i++){
            if(lineas[i].contains("//")){
                String substring = lineas[i].substring(lineas[i].indexOf("//"));
                String replace = lineas[i].replace(substring, "");
                lineas[i]=replace;
            }
        }
        
        Archivo archivo_nuevo= new Archivo(r_nuevofichero);
        archivo_nuevo.crear(lineas);
    
    } else {
        System.out.println("\n[ DEBES INTRODUCIR EL COMANDO CORRECTAMENTE ]");
    }
        
    }
}
