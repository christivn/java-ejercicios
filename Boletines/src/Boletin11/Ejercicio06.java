/////////////////////////////////////
//  Ejercicio06 - Christian Ramos  //
/////////////////////////////////////

package Boletin11;

import Boletin11.clases.Archivo;
import Boletin11.clases.Ruta;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) throws IOException {
       
    System.out.println("[ CONTADOR DE OCURRENCIAS ]");
    System.out.println("EJ: buscar_ocurrencias (nombre del archivo . extension) (palabra a buscar)");
    System.out.println("EJ: buscar_ocurrencias parrafo.txt lorem");
    System.out.println("--------------------------------------------------------");
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el comando: ");
    String comando_str = sc.nextLine();
    String[] comando = comando_str.split(" "); 

    if(comando.length==3 && comando[0].toLowerCase().equals("buscar_ocurrencias")){
        Ruta r_fichero=new Ruta(comando[1]);
    
        Archivo archivo= new Archivo(r_fichero);
        String[] lineas=archivo.leer();
        
        // Bucle que busca las ocurrencias
        int ocurrencias=0;
        for(String linea:lineas) {
            if (linea.toLowerCase().contains(comando[2].toLowerCase())) {
                ocurrencias++;
            }
        }
        
        System.out.println("\nSe han encontrado "+ocurrencias+" ocurrencias de la palabra ("+comando[2]+")");
    
    } else {
        System.out.println("\n[ DEBES INTRODUCIR EL COMANDO CORRECTAMENTE ]");
    }
        
    }
}
