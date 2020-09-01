/////////////////////////////////////
//  Ejercicio11 - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4;

import Boletin9.Boletin4.Clases.Bombilla;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        Bombilla[] bombillas=new Bombilla[3];
        bombillas[0]=new Bombilla(0,true,60);
        bombillas[1]=new Bombilla(1,false,15);
        bombillas[2]=new Bombilla(2,true,35);
        
        for(int i=0;i<bombillas.length-1;i++){
            int id=bombillas[i].getId();
                if(bombillas[i+1].getId()==id){
                    System.out.println("[ DEBES INTRODUCIR CORRECTAMENTE LOS ID ]");
                    System.exit(0);
                }
        }
        
        System.out.println("Potencia total consumida: "+bombillas[0].getPotencia_total()+"W");
        for(int i=0;i<bombillas.length;i++){
            System.out.println("id:"+bombillas[i].getId()+" - "+bombillas[i]+" - Potencia:"+bombillas[i].getPotencia()+"W");
        }
        System.out.print("\n");
        
        
        bombillas[1].setEstado(true);
        System.out.println("Potencia total consumida: "+bombillas[0].getPotencia_total()+"W");
        for(int i=0;i<bombillas.length;i++){
            System.out.println("id:"+bombillas[i].getId()+" - "+bombillas[i]+" - Potencia:"+bombillas[i].getPotencia()+"W");
        }
        System.out.print("\n");
        
        
        bombillas[0].setEstado(false);
        bombillas[2].setEstado(false);
        System.out.println("Potencia total consumida: "+bombillas[0].getPotencia_total()+"W");
        for(int i=0;i<bombillas.length;i++){
            System.out.println("id:"+bombillas[i].getId()+" - "+bombillas[i]+" - Potencia:"+bombillas[i].getPotencia()+"W");
        }
        System.out.print("\n");
        
        
    }
}
