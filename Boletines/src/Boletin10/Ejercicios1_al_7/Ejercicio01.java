/////////////////////////////////////
//  Ejercicio01 - Christian Ramos  //
/////////////////////////////////////

package Boletin10.Ejercicios1_al_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class Ejercicio01 {
    public static void main(String[] args) {
       
        ArrayList<String> a = new ArrayList<String>();
        a.add("David");
        a.add("Salvador");
        a.add("Jose Cristian");
        a.add("Pablo");
        a.add("Daniel");
        a.add("Joaquin");
        
        Enumeration enumerador=Collections.enumeration(a);
        
        System.out.println("Listado sin indice:");
        while(enumerador.hasMoreElements()){
            System.out.println(enumerador.nextElement());
        }
        
    }
}
