package Boletin9.Boletin4.Clases;
public class PuntoCoordenada {

    private double x=0;
    private double y=0;

    public PuntoCoordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double medirDistancia(PuntoCoordenada p2){
        return Math.sqrt(Math.pow((p2.getX()-x), 2)+Math.pow(p2.getY()-y, 2));
    }

    @Override
    public String toString() {
        return "x="+x+"  y="+y;
    }

}
