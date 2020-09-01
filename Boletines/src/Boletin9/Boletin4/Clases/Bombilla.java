package Boletin9.Boletin4.Clases;
public class Bombilla {

    private int id;
    private boolean estado;
    private int potencia;
    public String getid;
    
    private static int potencia_total;
    
    public Bombilla(int id, boolean estado, int potencia) {
        this.id = id;
        this.estado = estado;
        this.potencia = potencia;
        if(estado){
            potencia_total+=potencia;
        }
    }
    
    public Bombilla(int id, boolean estado) {
        this.id = id;
        this.estado = estado;
    }

    public Bombilla(int id) {
        this.id = id;
        this.estado = false;
    }

    public int getId() {
        return id;
    }

    public int getPotencia() {
        return potencia;
    }

    public static int getPotencia_total() {
        return potencia_total;
    }
    
    
    
    public boolean estado() {
        return estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado=estado;
        if(estado){
            potencia_total+=this.potencia;
        } else {
            potencia_total-=this.potencia;
        }
    }

    @Override
    public String toString() {
        String str;
        if(estado){
            str="encendida";
        } else {
            str="apagada";
        }
        return str;
    }
    
    
    
}
