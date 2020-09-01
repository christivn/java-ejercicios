/////////////////////////////////////
//  Ejercicio06 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String1;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String parrafo=" Apenas dieron las 6 de la mañana, despuntaba el sol, e iluminaba la población,\n"+
                " mostrando lo que la oscuridad de la noche no había dejado ver a mi arribo: \n"+
                " varias casas con tejas esmaltadas, brillando bajo los primeros rayos del sol;\n"+
                " la sombra de la torre de la iglesia pasando por el centro de la plaza hasta terminar\n"+
                " con la sombra de la cruz sobre la puerta del palacio municipal. A un lado, los comercios"+
                " del mercado que han abierto antes del alba: la carnicería, la recaudería, con verduras\n"+
                " recién cortadas, en la tienda de abarrotes, frijol y maíz de la última cosecha… Después\n"+
                " de 40 años, ese amanecer me llenó el corazón.";
    
    for(;;){
    System.out.println("\n"+parrafo);
    
    System.out.print("\nIntroduce la palabra que quieres sustituir: ");
    String palabra_eliminar=s.next();
    System.out.print("Introduce la palabra que va a ir en su lugar: ");
    String palabra_sustituir=s.next();
    parrafo=parrafo.replaceAll(palabra_eliminar,palabra_sustituir);

    System.out.println("\n"+parrafo);
    System.out.println("\nSe a sustituido la palabra ("+palabra_eliminar+") por ("+palabra_sustituir+")");
    System.out.print("¿Quieres seguir? (S/N): ");
    String menu=s.next();
    menu=menu.toLowerCase();
        if(menu.equals("n")){
            break;
        }
    }
        
    
    }
}
