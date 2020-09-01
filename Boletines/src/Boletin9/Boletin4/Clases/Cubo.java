/////////////////////////////////////
//  Cubo - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4.Clases;

public class Cubo {

    private int capacidad;
    private int litros_actual;

    public Cubo(int capacidad, int litros_actual) {
        this.capacidad=capacidad;
        this.litros_actual=litros_actual;
    }

    public Cubo(int capacidad) {
        this.capacidad=capacidad;
        this.litros_actual=0;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getLitros_actual() {
        return litros_actual;
    }

    public void setLitros_actual(int litros_actual) {
        this.litros_actual = litros_actual;
    }
    
    public void verter_a(Cubo cubo) {
        if((this.capacidad-this.litros_actual)>=cubo.getLitros_actual()){
            this.litros_actual+=cubo.getLitros_actual();
            System.out.println("[ SE HAN VERTIDO "+cubo.getLitros_actual()+" EN EL CUBO ]");
            cubo.setLitros_actual(0);
        } else {
            System.out.println("[ NO SE PUEDE VERTER EN EL CUBO POR QUE SE DESBORDARÍA ]");
        }
    }

}
