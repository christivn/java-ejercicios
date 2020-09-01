
package Boletin9.Clases;
public class Fraccion {

    int numerador;
    int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion() {}

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    ////////////////////////////////////////////////////////

    public void invertir() {
        int aux_numerador=this.numerador;
        int aux_denominador=this.denominador;
        this.numerador=aux_denominador;
        this.denominador=aux_numerador;
    }
    
    public void simplifica() {
        while((this.numerador/3)>0 && (this.denominador/3)>0){
            this.numerador/=3;
            this.denominador/=3;
        }
        
        while((this.numerador/2)>0 && (this.denominador/2)>0){
            this.numerador/=2;
            this.denominador/=2;
        }
    }
    
    public void multiplica(Fraccion f2) {
        this.numerador*=f2.getNumerador();
        this.denominador*=f2.getDenominador();
    }
        
    public void divide(Fraccion f2) {
        this.numerador*=f2.getDenominador();
        this.denominador*=f2.getNumerador();
    }

    @Override
    public String toString() {
        return  "["+this.numerador+"|"+this.denominador+"]";
    }
    
}
