package Boletin11.clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Archivo {

    private final Ruta ruta;
    private final String nombre;

    public Archivo(Ruta ruta) {
        this.ruta = ruta;
        this.nombre= ruta.getNombreArchivo();
    }
    
    public Archivo(Ruta ruta, String[] palabras) throws IOException {
        this.ruta = ruta;
        this.nombre= ruta.getNombreArchivo();
        this.crear(palabras);
    }
    
    // Devuelve un array con todas las lineas del archivo
    public String[] leer() {
    Ruta r=ruta;
    int cont=0;
    try {
        try (BufferedReader bf = new BufferedReader(new FileReader(r.getRuta()))) {
            String linea="";
            while (linea!=null) {
                linea = bf.readLine();
                cont++;
            }
        }
        
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    
    String[] palabras=new String[cont-1];
    try {
        try (BufferedReader bf = new BufferedReader(new FileReader(r.getRuta()))) {
            String linea;
            for(int i=0;i<cont-1;i++) {
                linea=bf.readLine();
                palabras[i]=linea;
            }
        }
        
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    return palabras;
    }
    
    
    // Crea un archivo mediante un array que se le pasa
    public void crear(String[] palabras) throws IOException {
    Scanner sc = new Scanner(System.in);
        
    Ruta r_fichero=new Ruta(nombre);
    File fichero = new File(r_fichero.getRuta());
    boolean exists = fichero.exists();
    
    if(!exists){
    fichero.delete();
    
    if(fichero.createNewFile()){
        System.out.println("El fichero se ha creado correctamente como ("+nombre+")");
    } else {
        System.out.println("No ha podido ser creado el fichero");
    }

    try {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(r_fichero.getRuta()))) {
            String linea;
            for(int i=0;i<palabras.length-1;i++) {
                bw.write(palabras[i]+"\n");
            }
        }
        
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    
    } else {
        System.out.println("No ha podido ser creado el fichero, por que ya existe uno con ese nombre");
    }
    }
    
    
    
    // Crea un archivo vacio si no pasas información del contenido
    public void crear() throws IOException {
    Scanner sc = new Scanner(System.in);
    String[] palabras= new String[1];
    palabras[0]="";
        
    Ruta r_fichero=new Ruta(nombre);
    File fichero = new File(r_fichero.getRuta());
    boolean exists = fichero.exists();
    
    if(!exists){
    fichero.delete();
    
    if(fichero.createNewFile()){
        System.out.println("El fichero se ha creado correctamente como ("+nombre+")");
    } else {
        System.out.println("No ha podido ser creado el fichero");
    }

    try {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(r_fichero.getRuta()))) {
            String linea;
            for(int i=0;i<palabras.length-1;i++) {
                bw.write(palabras[i]+"\n");
            }
        }
        
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    
    } else {
        System.out.println("No ha podido ser creado el fichero, por que ya existe uno con ese nombre");
    }
    }

    
    
    // Modifica un fichero sin mostrar salidas por pantalla
    public void modificar(String[] palabras) {
    Ruta r_fichero=new Ruta(nombre);
    File fichero = new File(r_fichero.getRuta());
    try {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(r_fichero.getRuta()))) {
            String linea;
            for(int i=0;i<palabras.length-1;i++) {
                bw.write(palabras[i]+"\n");
            }
        }
        
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    }
    
}
