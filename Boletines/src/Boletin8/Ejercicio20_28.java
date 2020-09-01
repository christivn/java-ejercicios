/////////////////////////////////////////
//  Ejercicio20_28 - Christian Ramos  //
///////////////////////////////////////

package Boletin8;
import Funciones.Vectores;

public class Ejercicio20_28 {
    public static void main(String[] args) {
        
    int[] array=Vectores.generaArrayInt(10,0,5);

    System.out.println("1. Array aleatorio: \n"+Vectores.pintarArray(array));
    System.out.println("2. Minimo valor del array: "+Vectores.minimoArrayInt(array));
    System.out.println("\n3. Maximo valor del array: "+Vectores.maximoArrayInt(array));
    System.out.println("\n4. Media del array: "+Vectores.mediaArrayInt(array));
    System.out.println("\n5. ¿Está el número 2 en el array?: "+Vectores.estaEnArrayInt(array,2));
    System.out.println("\n6. Posiciones del número 2 en el array: \n"+Vectores.pintarArray(Vectores.posicionEnArray(array,2)));
    System.out.println("7. Voltea el array: \n"+Vectores.pintarArray(Vectores.volteaArrayInt(array)));
    System.out.println("8. Rota a la derecha 2 posiciones: \n"+Vectores.pintarArray(Vectores.rotaDerechaArrayInt(array,2)));
    System.out.println("9. Rota a la izquierda 2 posiciones: \n"+Vectores.pintarArray(Vectores.rotaIzquierdaArrayInt(array,2)));

    }
}
