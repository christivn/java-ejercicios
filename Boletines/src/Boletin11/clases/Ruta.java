/////////////////////////////////////////////////////////////////////////
//  Objeto para crear ruta absoluta automaticamente - Christian Ramos  //
////////////////////////////////////////////////////////////////////////

package Boletin11.clases;
import java.io.File;

public class Ruta {
    private final String archivo;
    private final String ruta;

    public Ruta(String archivo) {
        this.archivo = archivo;
        // Se crea un objeto para poder recurrir al metodo para conseguir el nombre del paquete
        GetPackageName o = new GetPackageName();
        Package pack = o.getClass().getPackage();
        String packageName = pack.getName();
    
        // Se hace esto para formar una ruta absoluta, y no haya que cambiar el codigo
        // cada vez que se ejecuta en una maquina diferente.
        String ruta_realtiva = new File("").getAbsolutePath()+"\\src\\"+packageName;
        this.ruta = ruta_realtiva+"\\"+archivo;
    }

    public String getRuta() {
        return ruta;
    }

    public String getNombreArchivo() {
        return archivo;
    }
    
    
    // Objeto creado para conseguir el nombre del paquete
    private static class GetPackageName {
        public GetPackageName() {
        }
    }
}
