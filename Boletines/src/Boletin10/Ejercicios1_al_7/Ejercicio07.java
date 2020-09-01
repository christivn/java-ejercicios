/////////////////////////////////////
//  Ejercicio07 - Christian Ramos  //
/////////////////////////////////////

package Boletin10.Ejercicios1_al_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        ArrayList<Moneda> a = new ArrayList<>();
        
        System.out.println("+-------------------------+");
        System.out.println("|        EUROCOIN         |");
        System.out.println("+-------------------------+");
        System.out.print("¿Cuantas monedas quieres generar?: ");
        int num_monedas=s.nextInt();
        
        for(int i=0;i<num_monedas;i++){
            a.add(new Moneda());
            System.out.println(a.get(i).getValor()+" - "+a.get(i).getPosicion());
        }
        
    }
}
