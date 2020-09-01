package Boletin9.Boletin4.Clases;
public class Monedero {
    
    private int saldo;

    public Monedero() {
        this.saldo=0;
    }

    public int getSaldo() {
        return saldo;
    }

    public void addSaldo(int saldo) {
        this.saldo += saldo;
    }
    
    public void removeSaldo(int saldo) {
        this.saldo -= saldo;
    }

}
