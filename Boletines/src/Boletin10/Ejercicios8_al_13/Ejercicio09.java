/////////////////////////////////////
//  Ejercicio09 - Christian Ramos  //
/////////////////////////////////////

package Boletin10.Ejercicios8_al_13;

import java.util.ArrayList;

public class Ejercicio09 {
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
        
      for(int i = 0; i<a.size()-1; i++) {
         for (int j = i+1; j<a.size(); j++) {
            if(a.get(i).getPalo().compareTo(a.get(j).getPalo())>0) {
               Carta temp = a.get(i);
               a.set(i,a.get(j));
               a.set(j,temp);
            }
         }
      }
        
      for(int i = 0; i<a.size()-1; i++) {
         for (int j = i+1; j<a.size(); j++) {
            if(a.get(i).getPalo().equals(a.get(j).getPalo())) {
                if(a.get(i).getValor()>(a.get(j).getValor())) {
                    Carta temp = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,temp);
                }
            }
         }
      }
        
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        
        
    }
}
