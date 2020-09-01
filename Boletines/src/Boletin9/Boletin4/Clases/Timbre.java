package Boletin9.Boletin4.Clases;
public class Timbre {

    private static boolean estado=false;

    public Timbre() {
    }
    
    public static void alarma_calor() {
        alarma();
        System.out.println("\u001B[31m[ LAS TEMPERATURAS SON DEMASIADO ALTAS ]");
    }
    
    public static void alarma_frio() {
        alarma();
        System.out.println("\u001B[31m[ LAS TEMPERATURAS SON DEMASIADO BAJAS ]");
    }

    public static void alarma() {
        Timbre.estado=true;
        System.out.println("\u001B[31m[ ALARMA DE TEMPERATURA SE HA ACTIVADO]");
    }

}
