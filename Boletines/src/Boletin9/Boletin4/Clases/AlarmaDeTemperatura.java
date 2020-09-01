package Boletin9.Boletin4.Clases;
public class AlarmaDeTemperatura {

    private int temperatura=0;
    
    public AlarmaDeTemperatura() {
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        System.out.println("'La temperatura se ha actualizado a "+temperatura+"º'");
        this.temperatura=temperatura;
        if(temperatura>=80){Timbre.alarma_calor();}
        if(temperatura<=-10){Timbre.alarma_frio();}
    }

}
