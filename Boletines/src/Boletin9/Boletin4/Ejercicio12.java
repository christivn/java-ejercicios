/////////////////////////////////////
//  Ejercicio12 - Christian Ramos   //
/////////////////////////////////////

package Boletin9.Boletin4;

import Boletin9.Boletin4.Clases.Votacion;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        // SE REPARTEN 100 VOTOS
        
        Votacion[] elecciones=new Votacion[5];
        elecciones[0]=new Votacion("PSOE");
        elecciones[1]=new Votacion("PODEMOS");
        elecciones[2]=new Votacion("PP");
        elecciones[3]=new Votacion("VOX");
        elecciones[4]=new Votacion("CIUDADANOS");
        
        for(int i=0;i<100;i++){
            int rand=(int)(Math.random()*5);
            elecciones[rand].Votar();
        }
        
        for(int i=0;i<elecciones.length;i++){
            System.out.println(elecciones[i]);
        }
        
        String candidato="";
        int max=0;
        for(int i=0;i<elecciones.length-1;i++){
            if(elecciones[i].getVotos()>=max){
                candidato=elecciones[i].getNombre();
                max=elecciones[i].getVotos();
            }
        }
        System.out.println("\nCandidato con mas votos: "+candidato);
        
    }
}
