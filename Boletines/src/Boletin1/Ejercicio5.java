/////////////////////////////////////
//  Ejercicio 5 - Christian Ramos  //
/////////////////////////////////////

package Boletin1;
public class Ejercicio5 { 
public static void main(String[] args) {
  
String rojo = "\033[31m";
String verde = "\033[32m";
String naranja = "\033[33m";
String azul = "\033[34m";
String morado = "\033[35m";
String cian = "\u001B[36m";
String blanco = "\033[37m";
  
  System.out.print(blanco+"\n         +-------+--------+-----------+--------+---------+\n");
  System.out.print("         | LUNES | MARTES | MIERCOLES | JUEVES | VIERNES |\n");
  System.out.print("+--------+-------+--------+-----------+--------+---------+\n");
  System.out.print("|  8:00  |"+naranja+" PROG  "+blanco+"|"+naranja+" PROG   "+blanco+"|"+azul+" BD        "+blanco+"|"+rojo+" SI     "+blanco+"|"+morado+" FOL     "+blanco+"|\n");
  System.out.print("|  9:00  |"+naranja+" PROG  "+blanco+"|"+naranja+" PROG   "+blanco+"|"+azul+" BD        "+blanco+"|"+rojo+" SI     "+blanco+"|"+cian+" LMARC   "+blanco+"|\n");
  System.out.print("|  10:00 |"+naranja+" PROG  "+blanco+"|"+naranja+" PROG   "+blanco+"|"+azul+" BD        "+blanco+"|"+verde+" ED     "+blanco+"|"+cian+" LMARC   "+blanco+"|\n");
  System.out.print("|########################################################|\n");
  System.out.print("|  11:30 |"+verde+" ED    "+blanco+"|"+azul+" BD     "+blanco+"|"+rojo+" SI        "+blanco+"|"+naranja+" PROG   "+blanco+"|"+rojo+" SI      "+blanco+"|\n");
  System.out.print("|  12:30 |"+verde+" ED    "+blanco+"|"+azul+" BD     "+blanco+"|"+rojo+" SI        "+blanco+"|"+cian+" LMARC  "+blanco+"|"+rojo+" SI      "+blanco+"|\n");
  System.out.print("|  13:30 |"+morado+" FOL   "+blanco+"|"+azul+" BD     "+blanco+"|"+morado+" FOL       "+blanco+"|"+cian+" LMARC  "+blanco+"|"+naranja+" PROG    "+blanco+"|\n");
  System.out.print("+--------+-------+--------+-----------+--------+---------+\n");
}
}
