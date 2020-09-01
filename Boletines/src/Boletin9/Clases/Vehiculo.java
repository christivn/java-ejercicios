package Boletin9.Clases;
public class Vehiculo {
    
    static int vehiculosCreados=0;
    static int kilometrosTotales=0;

    public Vehiculo() {
        Vehiculo.vehiculosCreados++;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }
    
    

}
