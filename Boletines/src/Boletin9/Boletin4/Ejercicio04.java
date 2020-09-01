/////////////////////////////////////
//  Ejercicio04 - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4;
import Boletin9.Boletin4.Clases.Canales;
import Boletin9.Boletin4.Clases.Sintonizador;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    
    Canales[] listaCanales= new Canales[5];
    listaCanales[0]=new Canales("RadioFM",100.5);
    listaCanales[1]=new Canales("Cadena SER",82);
    listaCanales[2]=new Canales("Radiole",94.5);
    listaCanales[3]=new Canales("Los 40",80.5);
    listaCanales[4]=new Canales("COPE",102.5);
    
    Sintonizador sintonizador=new Sintonizador(listaCanales);
    
    for(;;){
    System.out.println("\n"+sintonizador);
    System.out.println("\n+---------------------+");
    System.out.println("| 1. Subir frecuencia |");
    System.out.println("| 2. Bajar frecuencia |");
    System.out.println("| 3. Salir            |");
    System.out.println("+---------------------+");
    System.out.print("Selecciona una opción: ");
    int opcion=s.nextInt();
    switch(opcion){
        case 1: sintonizador.subirFrecuencia(); break;
        case 2: sintonizador.bajarFrecuencia(); break;
        case 3: System.exit(0); break;
        default: System.err.println("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]"); break;
    }
    }
    
    }
}
