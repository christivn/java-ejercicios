package Boletin10.Ejercicios8_al_13;

public class Articulo {

    private String codigo;
    private String descripcion;
    private double precio_compra;
    private double precio_venta;
    private int stock;

    public Articulo(String codigo, String descripcion, double precio_compra, double precio_venta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.stock = stock;
    }

    public Articulo() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Codigo: "+codigo+"\n"
                +"Descripcion: "+descripcion+"\n"
                +"Precio de compra: "+precio_compra+"\n"
                +"Precio de venta: "+precio_venta+"\n"
                +"Stock: "+stock;
    }
    
}
