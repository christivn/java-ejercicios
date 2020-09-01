/////////////////////////////////////
//  Ejercicio03 - Christian Ramos   //
/////////////////////////////////////

package Boletin10.Sencillos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<>();
        
        for(int i=1;;i++){
            System.out.print("Introduce la ciudad nº"+i+": ");
            String ciudad=s.next();
            if(!"fin".equals(ciudad.toLowerCase())){
                ciudades.add(ciudad);
            } else {
                break;
            }
        }
        
        System.out.print("\n");
        for(int i=0;i<ciudades.size();i++){
            System.out.println(ciudades.get(i));
        }
        
    }
}
