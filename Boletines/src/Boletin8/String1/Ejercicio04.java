/////////////////////////////////////
//  Ejercicio04 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String1;
public class Ejercicio04 {
    public static void main(String[] args) {
    
    String parrafo=" Apenas dieron las 6 de la mañana, despuntaba el sol, e iluminaba la población,\n"+
                   " mostrando lo que la oscuridad de la noche no había dejado ver a mi arribo: \n"+
                   " varias casas con tejas esmaltadas, brillando bajo los primeros rayos del sol;\n"+
                   " la sombra de la torre de la iglesia pasando por el centro de la plaza hasta terminar\n"+
                   " con la sombra de la cruz sobre la puerta del palacio municipal. A un lado, los comercios"+
                   " del mercado que han abierto antes del alba: la carnicería, la recaudería, con verduras\n"+
                   " recién cortadas, en la tienda de abarrotes, frijol y maíz de la última cosecha… Después\n"+
                   " de 40 años, ese amanecer me llenó el corazón.";
    System.out.println(parrafo);
    
    String palabra="de";
    System.out.println("\nLas posiciones de la palabra ("+palabra+") son: ");
    
    int pos=0;
    int cont=0;
    while(pos!=-1){
        pos=parrafo.indexOf(palabra, pos+cont);
        cont++;
        
        if(pos!=-1){
            System.out.println("Posición "+cont+": "+pos);
        }
    }
    
    
    }
}
