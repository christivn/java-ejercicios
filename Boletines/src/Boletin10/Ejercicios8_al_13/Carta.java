package Boletin10.Ejercicios8_al_13;

public class Carta {

    int valor;
    String palo;

    public Carta() {
        int valor=(int)(Math.random()*12)+1;
        this.valor = valor;
        
        int rand=(int)(Math.random()*4);
        String palo="";
        switch(rand){
            case 0: palo="oro"; break;
            case 1: palo="copas"; break;
            case 2: palo="espadas"; break;
            case 3: palo="bastos"; break;
        }
        this.palo = palo;
    }
    

    public int getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }
    
    @Override
    public String toString() {
        String str_valor=Integer.toString(valor);
        if(str_valor.equals("1")){
            str_valor="as";
        }
        if(str_valor.equals("10")){
            str_valor="sota";
        }
        if(str_valor.equals("11")){
            str_valor="caballo";
        }
        if(str_valor.equals("12")){
            str_valor="rey";
        }
        return str_valor+" de "+palo;
    }
    
    

}
