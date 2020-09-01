/////////////////////////////////////
//  Coche - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4.Clases;

public class Coche {

    private String matricula;
    private String modelo;
    private String motor;
    private int precio;
    private String color;

    public Coche(String matricula, String modelo, String motor, int precio, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.motor = motor;
        this.precio = precio;
        this.color = color;
    }

    public Coche(String matricula, int precio) {
        this.matricula = matricula;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "matricula:"+matricula+", modelo:"+modelo+", motor:"+motor+", precio:"+precio+", color:"+color;
    }

}
