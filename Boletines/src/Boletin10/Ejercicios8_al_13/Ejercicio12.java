/////////////////////////////////////
//  Ejercicio12 - Christian Ramos  //
/////////////////////////////////////

package Boletin10.Ejercicios8_al_13;

import java.util.HashMap;

public class Ejercicio12 {
    public static void main(String[] args) {
       
        HashMap<String,Integer> m = new HashMap<>();
        for(int i=0;i<5;i++){
            Carta c=new Carta();
            int valor=c.getValor();
            switch(valor){
                case 1: valor=11; break;
                case 3: valor=10; break;
                case 10: valor=2; break;
                case 11: valor=3; break;
                case 12: valor=4; break;
                default: valor=0; break;
            }
            m.put(c.getPalo(),valor);
            System.out.println(c);
        }
        
        int suma=0;
        for(int f : m.values()) {
            suma+=f;
        }
       
        System.out.println("Tienes "+suma+" puntos");
        
    }
}
