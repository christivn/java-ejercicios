/////////////////////////////////////
//  Ejercicio10 - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4;

import Boletin9.Boletin4.Clases.Bombilla;
import Boletin9.Boletin4.Clases.Fusible;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        Bombilla[] bombillas=new Bombilla[3];
        bombillas[0]=new Bombilla(0,true);
        bombillas[1]=new Bombilla(1,false);
        bombillas[2]=new Bombilla(2,true);
        
        for(int i=0;i<bombillas.length-1;i++){
            int id=bombillas[i].getId();
                if(bombillas[i+1].getId()==id){
                    System.out.println("[ DEBES INTRODUCIR CORRECTAMENTE LOS ID ]");
                    System.exit(0);
                }
        }
        
        Fusible fusible=new Fusible(bombillas);
        
        System.out.println("Estado de fusible: "+fusible.Estado());
        for(int i=0;i<bombillas.length;i++){
            System.out.println("id:"+bombillas[i].getId()+" - "+bombillas[i]);
        }
        System.out.print("\n");
        
        
        fusible.SaltarFusibles();
        System.out.println("Estado de fusible: "+fusible.Estado());
        for(int i=0;i<bombillas.length;i++){
            System.out.println("id:"+bombillas[i].getId()+" - "+bombillas[i]);
        }
        System.out.print("\n");
        
        
        fusible.RepararFusibles();
        System.out.println("Estado de fusible: "+fusible.Estado());
        for(int i=0;i<bombillas.length;i++){
            System.out.println("id:"+bombillas[i].getId()+" - "+bombillas[i]);
        }
        System.out.print("\n");
        
    }
}
