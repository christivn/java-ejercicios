package Boletin9.Clases;

import Boletin9.MetodosDePilotoFormula1;

public class PilotoF1 implements MetodosDePilotoFormula1{

    String escuderia;
    String nombre;
    String apellido;
    String nacionalidad;
    
    int trofeosGanados;
    int numeroEnParrilla;
    int edad;
    int tiempoEnF1;
    int tiempoEnEscuderia;
    
    String nombCircuito;
    String piloto;
    String nuevaEscuderia;

    public PilotoF1(String nombre, String apellido, String nacionalidad, String escuderia) {
        this.escuderia = escuderia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    public PilotoF1(String nombre, String apellido, String nacionalidad, String escuderia, String nombCircuito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.escuderia = escuderia;
        this.nombCircuito = nombCircuito;
    }
    
    

    @Override
    public String getEscuderia() {
        return escuderia;
    }

    @Override
    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public int getTrofeosGanados() {
        System.out.print(this.nombre+" lleva "+this.trofeosGanados+" trofeos este año.");
        return trofeosGanados;
    }

    @Override
    public void setTrofeosGanados(int trofeosGanados) {
        System.out.print("Sorprendentemente: "+this.nombre+" lleva "+this.trofeosGanados+" trofeos este año. Por ello, gana su cuarto campeonato.");
        this.trofeosGanados = trofeosGanados;
    }

    @Override
    public int getNumeroEnParrilla() {
        return numeroEnParrilla;
    }

    @Override
    public void setNumeroEnParrilla(int numeroEnParrilla) {
        this.numeroEnParrilla = numeroEnParrilla;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int getTiempoEnF1() {
        return tiempoEnF1;
    }

    @Override
    public void setTiempoEnF1(int tiempoEnF1) {
        this.tiempoEnF1 = tiempoEnF1;
    }

    @Override
    public int getTiempoEnEscuderia() {
        return tiempoEnEscuderia;
    }

    @Override
    public void setTiempoEnEscuderia(int tiempoEnEscuderia) {
        this.tiempoEnEscuderia = tiempoEnEscuderia;
    }

    public String getNombCircuito() {
        return nombCircuito;
    }

    public void setNombCircuito(String nombCircuito) {
        this.nombCircuito = nombCircuito;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getNuevaEscuderia() {
        return nuevaEscuderia;
    }

    public void setNuevaEscuderia(String nuevaEscuderia) {
        this.nuevaEscuderia = nuevaEscuderia;
    }

    
    
    
    
    
    @Override
    public void celebracionTriunfo() {
        System.out.println("Ahora unas palabras del piloto "+this.nacionalidad+". Muchas gracias al equipo "+this.escuderia+" por este triunfo.");
    }

    @Override
    public void circuito(String nombCircuito) {
        System.out.println("Bienvenidos al circuito de "+this.nombCircuito+"... y comienza la carrera.");
    }

    @Override
    public void adelanta(String piloto) {
        System.out.println(this.nombre+" adelanta a "+piloto+" y se pone primero.");
    }

    @Override
    public void gana() {
        System.out.println("¡¡¡"+this.nombre+" cruza la línea de parrilla y gana!!!!");
    }

    @Override
    public void averia() {
        System.out.println("Atención: "+this.nombre+" lleva el coche a boxes por un pinchazo");
    }

    @Override
    public int nuevoTrofeo() {
        System.out.println("Y con este, "+this.nombre+" lleva "+this.trofeosGanados+" trofeos este año.");
        return this.trofeosGanados;
    }

    @Override
    public void nuevaEscuderia(String nuevaEscuderia) {
        this.escuderia=nuevaEscuderia;
        System.out.println(this.nombre+" ha cambiado a la escudería "+nuevaEscuderia);
    }
    
}
