package Boletin9.Clases;
public class Pizza {
    
    public enum tam {
        mediana,
        familiar;
    }
        
    tam tamano;
    String tipo;
    private String estado;
    
    static int PizzasPedidas=0;
    static int PizzasServidas=0;
    
    public Pizza(String tipo) {
        this.tipo = tipo;
        
        this.estado = "pedida";
        Pizza.PizzasPedidas++;
    }

    public Pizza(String tipo, tam tamano) {
        this.tamano = tamano;
        this.tipo = tipo;
        
        this.estado = "pedida";
        Pizza.PizzasPedidas++;
    }

    public tam getTamano() {
        return tamano;
    }

    public void setTamano(tam tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void sirve(){
        if(this.estado.equals("pedida")){
            this.estado="servida";
            Pizza.PizzasServidas++;
        } else {
            System.out.println("Esa pizza ya se ha servido");
        }
    }
    
    public static int getTotalPedidas(){
        return Pizza.PizzasPedidas;
    }
    
    public static int getTotalServidas(){
        return Pizza.PizzasServidas;
    }

    @Override
    public String toString() {
        return "Pizza: "+tamano+" "+tipo+", "+estado;
    }

}
