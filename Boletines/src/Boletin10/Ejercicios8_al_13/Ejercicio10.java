/////////////////////////////////////
//  Ejercicio10 - Christian Ramos  //
/////////////////////////////////////

package Boletin10.Ejercicios8_al_13;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    HashMap<String,String> m = new HashMap<>();
    m.put("hola", "hello");
    m.put("adios", "bye");
    m.put("bienvenido", "welcome");
    m.put("red", "rojo");
    m.put("blue", "azul");
    m.put("green", "verde");
    m.put("yellow", "amarillo");
    m.put("dog", "perro");
    m.put("cat", "gato");
    m.put("bird", "pajaro");
    m.put("horse", "cabalo");
    m.put("home", "hogar");
    m.put("computer", "ordenador");
    m.put("screen", "pantalla");
    m.put("keyboard", "teclado");
    m.put("mouse", "ratón");
    m.put("clock", "reloj");
    m.put("car", "coche");
    m.put("windows", "ventana");
    m.put("door", "puerta");
    m.put("chair", "silla");
    m.put("sofa", "sofa");
    m.put("table", "mesa");
    m.put("bed", "cama");
    
    System.out.print("Introduce una palabra en español: ");
    String palabra_es=s.next();
    
    if(m.containsKey(palabra_es.toLowerCase())){
       System.out.println(palabra_es+" > "+m.get(palabra_es.toLowerCase()));
    } else {
        System.out.println("[ Esa palabra no existe en nuestro diccionario ]");
    }
        
    }
}
