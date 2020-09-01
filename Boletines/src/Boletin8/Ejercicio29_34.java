////////////////////////////////////////
//  Ejercicio29_34 - Christian Ramos  //
////////////////////////////////////////

package Boletin8;
import Funciones.Matrices;
import Funciones.Vectores;

public class Ejercicio29_34 {
    public static void main(String[] args) {
    
    int[][] array=Matrices.generaArrayBiInt(3,5,0,9); // generado aleatoriamente
    
    System.out.println("1. Array aleatorio (minimo 1 / maximo 9): \n"+Matrices.pintarArrayBi(array)+"\n");
    System.out.println("2. Devuelve la fila introducida (EJ: fila 1): \n"+Vectores.pintarArray(Matrices.filaDeArrayBiInt(array,1))+"\n");
    System.out.println("3. Devuelve la columna introducida (EJ: columna 0): \n"+Vectores.pintarArray(Matrices.columnaDeArrayBiInt(array,0))+"\n");
    System.out.println("4. Devuelve las posiciones en el array del número introducido (Ej: 2): \n"+Matrices.pintarArrayBi(Matrices.coordenadasEnArrayBiInt(array,2)));
    System.out.println("5. Dice si un número es o no punto de silla, es decir,\n mínimo en su fila y máximo en su columna (EJ: fila 1, columna 3): "+Matrices.esPuntoDeSilla(array,1,3)+"\n");
    System.out.println("6. Devuelve la diagonal del array (Ej: fila 0, fila 0, nose): \n"+Vectores.pintarArray(Matrices.diagonal(array,0,0,"nose")));
    
    }
}
