/////////////////////////////////////
//  Votacion - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4.Clases;

public class Votacion {

    private String nombre;
    private int votos;

    public Votacion(String nombre) {
        this.nombre = nombre;
        this.votos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void Votar() {
        this.votos=this.votos+1;
    }

    @Override
    public String toString() {
        return nombre+" - votos:"+votos;
    }
    
    

}
