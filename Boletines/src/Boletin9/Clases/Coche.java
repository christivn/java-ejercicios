package Boletin9.Clases;
public class Coche extends Vehiculo{
    
    String marca;
    String modelo;
    
    int kilometrosRecorridos;

    public Coche(String marca, String modelo) {
        this.marca=marca;
        this.modelo=modelo;
        this.kilometrosRecorridos=0;
    }

    public Coche(String marca, String modelo, int kilometrosRecorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometrosRecorridos=kilometrosRecorridos;
        Vehiculo.kilometrosTotales+=kilometrosRecorridos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void addKilometros(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        Vehiculo.kilometrosTotales+=kilometrosRecorridos;
    }

    public void quemarRueda(){
        System.out.print("Quemas rueda con tu "+this.marca+" "+this.modelo);
    }
    
}
