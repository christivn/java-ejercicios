
package Boletin9.Clases;
public class Tiempo {
    
    int hora;
    int minuto;
    int segundo;

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora=Math.abs(hora);
        this.minuto=Math.abs(minuto);
        this.segundo=Math.abs(segundo);
        
        while(this.segundo>=60){
            this.minuto++;
            this.segundo-=60;
        }
        while(this.minuto>=60){
            this.hora++;
            this.minuto-=60;
        }
    }
    
    public Tiempo() {}

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    @Override
    public String toString() {
        return hora+"h "+minuto+"m "+segundo+"s";
    }
    
    /////////////////////////////////////////////////////

    public void suma(Tiempo tiempo2) {
        this.segundo+=tiempo2.getSegundo();
        this.minuto+=tiempo2.getMinuto();
        this.hora+=tiempo2.getHora();
    }
        
    public void resta(Tiempo tiempo2) {
        if(this.hora>=tiempo2.getHora() && this.minuto>=tiempo2.getMinuto() && this.segundo>=tiempo2.getSegundo()){
            this.hora-=tiempo2.getHora();
            this.minuto-=tiempo2.getMinuto();
            this.segundo-=tiempo2.getSegundo();
        } else {
            System.err.println("[ DEBES DE INTRUCIR VALORES VÁLIDOS PARA LA RESTA ]");
        }
    }
    

}
