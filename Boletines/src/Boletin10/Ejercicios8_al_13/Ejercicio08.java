/////////////////////////////////////
//  Ejercicio08 - Christian Ramos  //
/////////////////////////////////////

package Boletin10.Ejercicios8_al_13;

import java.util.ArrayList;

public class Ejercicio08 {
    public static void main(String[] args) {
       
        ArrayList<Carta> a = new ArrayList<>();
        for(int i=0;i<10;i++){
            Carta carta=new Carta();
            if(!a.contains(carta)){
                a.add(carta);
            } else {
                i--;
            }
        }
        
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        
    }
}
