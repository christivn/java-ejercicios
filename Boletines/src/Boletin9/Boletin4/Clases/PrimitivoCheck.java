package Boletin9.Boletin4.Clases;
public class PrimitivoCheck {

    private byte by;
    private short sh;
    private char ch;
    private int in;
    private long lo;
    private float fl;
    private double dou;
    
    private String tipo;

    public PrimitivoCheck(byte by) {
        tipo="byte";
    }

    public PrimitivoCheck(short sh) {
        tipo="short";
    }

    public PrimitivoCheck(char ch) {
        tipo="char";
    }

    public PrimitivoCheck(int in) {
       tipo="int";
    }

    public PrimitivoCheck(long lo) {
        tipo="long";
    }

    public PrimitivoCheck(float fl) {
        tipo="float";
    }

    public PrimitivoCheck(double dou) {
        tipo="double";
    }

    public String getTipo() {
        return tipo;
    }

}
