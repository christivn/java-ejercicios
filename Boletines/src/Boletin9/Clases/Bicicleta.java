package Boletin9.Clases;
public class Bicicleta {

    String marca;
    String modelo;
    
    int kilometrosRecorridos;

    public Bicicleta(String marca, String modelo, int kilometrosRecorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometrosRecorridos = kilometrosRecorridos;
        Vehiculo.kilometrosTotales+=kilometrosRecorridos;
    }

    public Bicicleta(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Bicicleta() {
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
    
    public void caballito(){
        System.out.print("Haces el caballito con tu bicicleta "+this.marca+" "+this.modelo);
    }
    
    
}
