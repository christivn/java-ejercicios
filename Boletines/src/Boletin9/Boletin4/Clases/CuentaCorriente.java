package Boletin9.Boletin4.Clases;
public class CuentaCorriente {

    private String nombreTitular;
    private int saldo=0;

    public CuentaCorriente(String nombreTitular, int saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public CuentaCorriente(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void imposicion(int cant) {
        this.saldo+=cant;
    }
    
    public void reintegro(int cant) {
        this.saldo-=cant;
    }

    public void traspaso(CuentaCorriente cuenta,int cant) {
        this.saldo-=cant;
        cuenta.imposicion(cant);
    }
    
    @Override
    public String toString() {
        return "Titular: "+nombreTitular+", Saldo: "+saldo+"€";
    }
    
}
