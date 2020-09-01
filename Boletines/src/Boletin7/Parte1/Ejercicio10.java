/////////////////////////////////////
//  Ejercicio10 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;
public class Ejercicio10 {
    public static void main(String[] args) {
    
    int[] array = new int[20];
    int[] array_aux = new int[20];
    
    System.out.print("Array Generado: ");
    for(int i=0;i<20;i++){
        int rnd= (int)(Math.random()*101);
        array[i]=rnd;
        
        System.out.print(rnd);
        if(i!=19){
            System.out.print(" | ");
        }
    }
    System.out.print("\n");
    
    
    System.out.print("Array Ordenado: ");
    int cont=0;
    for(int i=0;i<20;i++){
        if((array[i]%2)==0){
            array_aux[cont]=array[i];
            cont++;
        }
    }
    
    for(int i=0;i<20;i++){
        if((array[i]%2)!=0){
            array_aux[cont]=array[i];
            cont++;
        }
    }
    
    for(int i=0;i<20;i++){
        array[i]=array_aux[i];
    }
    
    for(int i=0;i<20;i++){
        System.out.print(array[i]);
        if(i!=19){
            System.out.print(" | ");
        }
    }
    System.out.print("\n");
    
    }
}
