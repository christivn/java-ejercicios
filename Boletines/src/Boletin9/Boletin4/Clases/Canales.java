package Boletin9.Boletin4.Clases;
public class Canales extends Sintonizador {

    private String nombre;

    public Canales(String nombre, double frecuencia) {
        super(frecuencia);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
