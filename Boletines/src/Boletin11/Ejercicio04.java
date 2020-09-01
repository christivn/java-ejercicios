/////////////////////////////////////
//  Ejercicio04 - Christian Ramos  //
/////////////////////////////////////

package Boletin11;

import Boletin11.clases.Ruta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) throws IOException {
        
    ///////////////////////////////////
    //      LECTURA DEL ARCHIVO
    ///////////////////////////////////
    
    Ruta r=new Ruta("palabras.txt");
    int cont=0;
    
    try {
        BufferedReader bf = new BufferedReader(new FileReader(r.getRuta()));
        
        String linea="";
        while (linea!=null) {
            linea = bf.readLine();
            cont++;
        }
        bf.close();
        
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    
    
    String[] palabras=new String[cont-1];
    try {
        BufferedReader bf = new BufferedReader(new FileReader(r.getRuta()));

        String linea;
        for(int i=0;i<cont-1;i++) {
            linea=bf.readLine();
            palabras[i]=linea;
        }
        bf.close();
        
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    
    System.out.println("Palabras: "+Arrays.toString(palabras));
    Arrays.sort(palabras);
    System.out.println("Palabras ordenadas: "+Arrays.toString(palabras)+"\n");
    
    
    ///////////////////////////////////
    //      CREACIÓN DEL ARCHIVO
    ///////////////////////////////////
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce nombre para guardar el archivo: ");
    String nombre_archivo = sc.next();
    
    Ruta r_fichero=new Ruta(nombre_archivo+"_sort.txt");
    File fichero = new File(r_fichero.getRuta());
    boolean exists = fichero.exists();
    
    if(exists){
    System.out.print("Ya existe un fichero con ese nombre ¿Quieres sobreescribirlo? (S/N): ");
    String sn = sc.next();
    
    if(sn.toLowerCase().equals("s")){
    fichero.delete();
    
    if(fichero.createNewFile()){
        System.out.println("El fichero se ha creado correctamente como ("+nombre_archivo+"_sort.txt)");
    } else {
        System.out.println("No ha podido ser creado el fichero");
    }

    try {
        BufferedWriter bw = new BufferedWriter(new FileWriter(r_fichero.getRuta()));

        String linea;
        for(int i=0;i<cont-1;i++) {
            bw.write(palabras[i]+"\n");
        }
        bw.close();
        
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    
    } else {
        System.out.println("No ha podido ser creado el fichero, por que ya existe uno con ese nombre");
    }
    }
}
}
