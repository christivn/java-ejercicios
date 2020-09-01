package Boletin9.Boletin4.Clases;
public class Planeta {

    private String nombre;
    private int masa;
    private int diametro;
    private int periodo_rotacion;
    private int periodo_traslacion;
    private int distancia_orbita;

    public Planeta(String nombre, int masa, int diametro, int periodo_rotacion, int periodo_traslacion, int distancia_orbita) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.periodo_rotacion = periodo_rotacion;
        this.periodo_traslacion = periodo_traslacion;
        this.distancia_orbita = distancia_orbita;
    }

    public Planeta(String nombre) {
        this.nombre = nombre;
    }

    public Planeta() {
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getPeriodo_rotacion() {
        return periodo_rotacion;
    }

    public void setPeriodo_rotacion(int periodo_rotacion) {
        this.periodo_rotacion = periodo_rotacion;
    }

    public int getPeriodo_traslacion() {
        return periodo_traslacion;
    }

    public void setPeriodo_traslacion(int periodo_traslacion) {
        this.periodo_traslacion = periodo_traslacion;
    }

    public int getDistancia_orbita() {
        return distancia_orbita;
    }

    public void setDistancia_orbita(int distancia_orbita) {
        this.distancia_orbita = distancia_orbita;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\n"+
                "Diametro: "+diametro+" km"+"\n"+
                "Periodo rotación: "+periodo_rotacion+" dias"+"\n"+
                "Periodo traslación: "+periodo_traslacion+" dias"+"\n"+
                "Distancia_orbita: " + distancia_orbita+" km";
    }
    
    
    
}
