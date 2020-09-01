package Boletin10.Ejercicios1_al_7;

public class Moneda {

    String valor;
    String posicion;

    public Moneda() {
        int rand=(int)(Math.random()*8);
        String valor="";
        switch(rand){
            case 0: valor="1 céntimo"; break;
            case 1: valor="2 céntimo"; break;
            case 2: valor="5 céntimo"; break;
            case 3: valor="10 céntimo"; break;
            case 4: valor="25 céntimo"; break;
            case 5: valor="50 céntimo"; break;
            case 6: valor="1 euro"; break;
            case 7: valor="2 euros"; break;
        }
        this.valor = valor;
        
        rand=(int)(Math.random()*2);
        String posicion="";
        switch(rand){
            case 0: posicion="cara"; break;
            case 1: posicion="cruz"; break;
        }
        this.posicion = posicion;
    }

    public String getValor() {
        return valor;
    }

    public String getPosicion() {
        return posicion;
    }
    
}
