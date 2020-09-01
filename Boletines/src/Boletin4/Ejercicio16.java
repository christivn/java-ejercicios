//////////////////////////////////////
//  Ejercicio 16 - Christian Ramos  //
//////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio16 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    int puntos=0;
    
    System.out.println("Tu pareja parece estar m�s inquieta de lo normal sin ning�n motivo aparente.");
    System.out.print("Respuesta (Verdadero / Falso): ");
    String p1=s.nextLine();
    if(p1.toLowerCase().equals("verdadero")){
      puntos=puntos+3;
    }
    
    System.out.println("\n+--------------------------------+\n");
    
    System.out.println("Ha aumentado sus gastos de vestuario");
    System.out.print("Respuesta (Verdadero / Falso): ");
    String p2=s.nextLine();
    if(p2.toLowerCase().equals("verdadero")){
      puntos=puntos+3;
    }
    
    System.out.println("\n+--------------------------------+\n");
    
    System.out.println("Ha perdido el inter�s que mostraba anteriormente por ti");
    System.out.print("Respuesta (Verdadero / Falso): ");
    String p3=s.nextLine();
    if(p3.toLowerCase().equals("verdadero")){
      puntos=puntos+3;
    }
    
    System.out.println("\n+--------------------------------+\n");
    
    System.out.println("Ahora se afeita y se asea con m�s frecuencia (si es hombre) o ahora se arregla el pelo y se asea con m�s frecuencia (si es mujer)");
    System.out.print("Respuesta (Verdadero / Falso): ");
    String p4=s.nextLine();
    if(p4.toLowerCase().equals("verdadero")){
      puntos=puntos+3;
    }
    
    System.out.println("\n+--------------------------------+\n");
    
    System.out.println("No te deja que mires la agenda de su tel�fono m�vil");
    System.out.print("Respuesta (Verdadero / Falso): ");
    String p5=s.nextLine();
    if(p5.toLowerCase().equals("verdadero")){
      puntos=puntos+3;
    }
    
    System.out.println("\n+--------------------------------+\n");
    
    System.out.println("A veces tiene llamadas que dice no querer contestar cuando est�s t� delante");
    System.out.print("Respuesta (Verdadero / Falso): ");
    String p6=s.nextLine();
    if(p6.toLowerCase().equals("verdadero")){
      puntos=puntos+3;
    }
    
    System.out.println("\n+--------------------------------+\n");
    
    System.out.println("�ltimamente se preocupa m�s en cuidar la l�nea y/o estar bronceado/a");
    System.out.print("Respuesta (Verdadero / Falso): ");
    String p7=s.nextLine();
    if(p7.toLowerCase().equals("verdadero")){
      puntos=puntos+3;
    }
    
    System.out.println("\n+--------------------------------+\n");
    
    System.out.println("Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho m�s trabajo");
    System.out.print("Respuesta (Verdadero / Falso): ");
    String p8=s.nextLine();
    if(p8.toLowerCase().equals("verdadero")){
      puntos=puntos+3;
    }
    
    System.out.println("\n+--------------------------------+\n");
    
    System.out.println("Has notado que �ltimamente se perfuma m�s");
    System.out.print("Respuesta (Verdadero / Falso): ");
    String p9=s.nextLine();
    if(p9.toLowerCase().equals("verdadero")){
      puntos=puntos+3;
    }
    
    System.out.println("\n+--------------------------------+\n");
    
    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    System.out.print("Respuesta (Verdadero / Falso): ");
    String p10=s.nextLine();
    if(p10.toLowerCase().equals("verdadero")){
      puntos=puntos+3;
    }
       
    System.out.println("\n+--------------------------------+");
    System.out.println("Puntuaci�n: "+puntos+"\n");
    
    if(puntos>=0 && puntos<=10){
      System.out.println("Puntuaci�n entre 0 y 10:");
      System.out.println("�Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if(puntos>=11 && puntos<=22){
      System.out.println("Puntuaci�n entre 11 y 22:");
      System.out.println("Quiz�s exista el peligro de otra persona en su vida o en su mente, aunque seguramente ser� algo sin importancia. No bajes la guardia.");
    } else {
      System.out.println("Puntuaci�n entre 22 y 30:");
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco m�s y averig�es que es lo que est� pasando por su cabeza.");
    }
    
}
}
