/////////////////////////////////////
//  Ejercicio11 - Christian Ramos  //
/////////////////////////////////////

package Boletin10.Ejercicios8_al_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio11 {
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
    
    String[] keys = new String[m.size()];
    int index = 0;
        for (Map.Entry<String,String> mapEntry : m.entrySet()) {
        keys[index] = mapEntry.getKey();
        index++;
    }
    
    int bien=0;
    int mal=0;
    for(int i=0;i<5;i++){
        int rand=(int)(Math.random()*m.size());
        System.out.print("Que significa "+keys[rand]+": ");
        String palabra_es=s.next();
    
        if(m.get(keys[rand]).equals(palabra_es.toLowerCase())){
            bien++;
        } else { mal++; }
    }
    
    System.out.println("/n+---------------------+");
    System.out.println("Aciertos: "+bien);
    System.out.println("Fallos: "+mal);
        
    }
}
