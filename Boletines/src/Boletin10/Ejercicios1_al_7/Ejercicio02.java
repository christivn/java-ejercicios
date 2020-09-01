/////////////////////////////////////
//  Ejercicio02 - Christian Ramos  //
/////////////////////////////////////

package Boletin10.Ejercicios1_al_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class Ejercicio02 {
    public static void main(String[] args) {
       
        ArrayList<Integer> a = new ArrayList<>();
        Enumeration enumerador=Collections.enumeration(a);
        
        int longitud = (int)(Math.random()*10+10);
        
        int suma=0;
        int media=suma/longitud;
        int maximo=0;
        int minimo=100;
        for(int i=0;i<longitud;i++){
            a.add((int)(Math.random()*100));
            suma+=a.get(i);
            
            if(a.get(i)>maximo){
                maximo=a.get(i);
            }
            if(a.get(i)<minimo){
                minimo=a.get(i);
            }
        }
        
        System.out.println("Números: "+a);
        System.out.println("\n- SUMA: "+suma);
        System.out.println("- MEDIA: "+media);
        System.out.println("\n- MAXIMO: "+maximo);
        System.out.println("- MINIMO: "+minimo);
        
    }
}
