/////////////////////////////////////
//  PruebaPLaneta2 - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4.Clases;

import java.util.Scanner;

public class PruebaPLaneta2 {

    private Planeta[] planetas=new Planeta[5];

    public PruebaPLaneta2() {
        for(int i=0;i<5;i++){
            Scanner s=new Scanner(System.in);
            System.out.print("Introduce el nombre del planeta ("+(i+1)+" de 5): ");
            String nombre_str=s.next();
            planetas[i]=new Planeta(nombre_str);
            planetas[i].setDiametro((int)(Math.random()*90000)+10000);
            planetas[i].setDistancia_orbita((int)(Math.random()*90000)+10000);
            planetas[i].setMasa((int)(Math.random()*90000)+10000);
            planetas[i].setPeriodo_rotacion((int)(Math.random()*90000)+10000);
            planetas[i].setPeriodo_traslacion((int)(Math.random()*90000)+10000);
        }
    }

    @Override
    public String toString() {
        String str="\n";
        for(int i=0;i<5;i++){
            str+=planetas[i]+"\n\n";
        }
        return str;
    }
}
