/////////////////////////////////////
//  Ejercicio05 - Christian Ramos  //
/////////////////////////////////////

package Boletin10.Ejercicios1_al_7;
import Boletin9.Clases.Disco;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
    Scanner c=new Scanner(System.in);
    Scanner a=new Scanner(System.in);
    Scanner t=new Scanner(System.in);
    Scanner g=new Scanner(System.in);
    Scanner x=new Scanner(System.in);
        
    int opcion;
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    int duracionIntroducida;
    int primeraLibre;
    
    ArrayList<Disco> album = new ArrayList<>();
    
    int i;
    do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = x.nextInt();
      
      switch (opcion) {
      case 1:
        System.out.println("\nLISTADO");
        System.out.println("=======");
        for(i = 0; i < album.size(); i++) {
          if (!album.get(i).getCodigo().equals("LIBRE")) {
            System.out.println(album.get(i));
          }
        }
        break;
        
      case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");
        
        album.add(new Disco());
        
        primeraLibre = -1;
        do {
          primeraLibre++;
        } while (!((album.get(primeraLibre).getCodigo()).equals("LIBRE")));
        
        System.out.println("Por favor, introduzca los datos del disco.");
        
        System.out.print("Código: ");
        codigoIntroducido = c.next();
        album.get(primeraLibre).setCodigo(codigoIntroducido);
        
        System.out.print("Autor: ");
        autorIntroducido = a.nextLine();
        album.get(primeraLibre).setAutor(autorIntroducido);
        
        System.out.print("Título: ");
        tituloIntroducido = t.nextLine();
        album.get(primeraLibre).setTitulo(tituloIntroducido);
        
        System.out.print("Género: ");
        generoIntroducido = g.next();
        album.get(primeraLibre).setGenero(generoIntroducido);
        
        System.out.print("Duración: ");
        duracionIntroducida = x.nextInt();
        album.get(primeraLibre).setDuracion(duracionIntroducida);
        
        break;
        
      case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigoIntroducido = c.next();
  
        i = -1;
        do {
          i++;
        } while (!((album.get(i).getCodigo()).equals(codigoIntroducido)));
        
        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
  
        System.out.println("Código: " + album.get(i).getCodigo());
        System.out.print("Nuevo código: ");
        codigoIntroducido = c.next();
        if (!codigoIntroducido.equals("")) {
          album.get(i).setCodigo(codigoIntroducido);
        }
        
        System.out.println("Autor: " + album.get(i).getAutor());
        System.out.print("Nuevo autor: ");
        autorIntroducido = a.nextLine();
        if (!autorIntroducido.equals("")) {
          album.get(i).setAutor(autorIntroducido);
        }
        
        System.out.println("Título: " + album.get(i).getTitulo());
        System.out.print("Nuevo título: ");
        tituloIntroducido = t.nextLine();
        if (!tituloIntroducido.equals("")) {
          album.get(i).setTitulo(tituloIntroducido);
        }
        
        System.out.println("Género: " + album.get(i).getGenero());
        System.out.print("Nuevo género: ");
        generoIntroducido = g.next();
        if (!generoIntroducido.equals("")) {
          album.get(i).setGenero(generoIntroducido);
        }
        
        System.out.println("Duración: " + album.get(i).getDuracion());
        System.out.print("Duración: ");
        duracionIntroducidaString = x.next();
        if (!duracionIntroducidaString.equals("")) {
          album.get(i).setDuracion(Integer.parseInt(duracionIntroducidaString));
        }
        
        break;
        
      case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigoIntroducido = c.next();
  
        i = -1;
        do {
          i++;
        } while (!((album.get(i).getCodigo()).equals(codigoIntroducido)));
        album.get(i).setCodigo("LIBRE");
        System.out.println("Album borrado.");
        
        break;
        
      default:
      
      }
    } while (opcion != 5);
  }
}
