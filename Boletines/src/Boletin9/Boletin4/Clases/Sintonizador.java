package Boletin9.Boletin4.Clases;
public class Sintonizador {

    protected double frecuencia=80;
    private Canales[] listacanales;

    public Sintonizador(double frecuencia, Canales[] listacanales) {
        if(frecuencia>=80 && frecuencia<=108){
            this.frecuencia = frecuencia;
        } else {
            System.err.println("[ La frecuencia debe de estar entre 80Mhz y 108Mhz ]");
        }
    }
    
    public Sintonizador(double frecuencia) {
        if(frecuencia>=80 && frecuencia<=108){
            this.frecuencia = frecuencia;
        } else {
            System.err.println("[ La frecuencia debe de estar entre 80Mhz y 108Mhz ]");
        }
    }

    public Sintonizador(Canales[] listacanales) {
        this.listacanales = listacanales;
    }

    public Sintonizador() {
    }

    public void subirFrecuencia() {
        if(frecuencia<108){
            this.frecuencia+=0.5;
        } else {
            this.frecuencia=80;
        }
    }
    
    public void bajarFrecuencia() {
        if(frecuencia>80){
            this.frecuencia-=0.5;
        } else {
            this.frecuencia=108;
        }
    }

    public double getFrecuencia() {
        return frecuencia;
    }
    
    public String buscarCanal(){
        String canal="Ningún Canal";
        if(listacanales.length!=0){
        for(int i=0;i<listacanales.length;i++){
            if(listacanales[i].getFrecuencia()==frecuencia){
                canal=listacanales[i].getNombre();
            }
        }
        }
        return canal;
    }
    
    @Override
    public String toString() {
        String barra="[";
        int cont=0;
        for(int i=0;i<28;i++){
            if(cont==Math.round((frecuencia-80))){
                barra+="#";
                cont++;
            } else {
                barra+="-";
                cont++;
            }
        }
        barra+="]\n\u001B[35m"+buscarCanal()+"\u001B[0m";
        return "\u001B[32m"+barra+"\n\u001B[32mSintonizador {"+frecuencia+" Mhz"+'}'+"\u001B[0m";
    }
    
}
