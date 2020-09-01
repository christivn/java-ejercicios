/////////////////////////////////////
//  Examen04 - Christian Ramos     //
/////////////////////////////////////

package Boletin8.String2;

import static Boletin8.String2.Examen04_Funciones.cont_puntos;
import static Boletin8.String2.Examen04_Funciones.contador_vocales;
import static Boletin8.String2.Examen04_Funciones.palabras_mas_10_menos_14_co;
import static Boletin8.String2.Examen04_Funciones.porcentaje_espacios;
import static Boletin8.String2.Examen04_Funciones.textoASCII;
import static Boletin8.String2.Examen04_Funciones.vocales_escritas;

public class Examen04 {
    public static void main(String[] args) {
    
    String telegrama_completo="Tengo una hormiguita en la patita que me esta haciendo cosquillitas y no me puedo aguantar. Stop.";
    
    int ocurrencia_stop=telegrama_completo.toLowerCase().indexOf("stop");
    String telegrama=telegrama_completo.substring(0,ocurrencia_stop)+telegrama_completo.substring(ocurrencia_stop,ocurrencia_stop+5);
    String[] palabras=telegrama.split(" ");
    
    int palabras_mas_10_menos_14_co=palabras_mas_10_menos_14_co(palabras);
    System.out.println("El texto tiene "+palabras_mas_10_menos_14_co+" palabra/as con más de 10 letras, menos de 14 letras y empieza por co.");
    
    String[] vocales=new String[5];
    vocales[0]="a";
    vocales[1]="e";
    vocales[2]="i";
    vocales[3]="o";
    vocales[4]="u";
    int[] vocales_cont=contador_vocales(palabras);
    System.out.println("\nEl texto tiene "+vocales_cont[0]+" a, "+vocales_cont[1]+" e, "+vocales_cont[2]+" i, "+vocales_cont[3]+" o y "+vocales_cont[4]+" u");
    
    System.out.println("\nLas vocales escritas en el texto son: "+vocales_escritas(vocales_cont));
    System.out.println("Su conversión en ASCII es: "+textoASCII(vocales_cont)+" y su conversión a texto es: "+vocales_escritas(vocales_cont));
    
    System.out.println("\nEl texto pasado tiene "+cont_puntos(telegrama)+" puntos.");
    
    System.out.println("\nPorcentaje de espacios: "+porcentaje_espacios(telegrama)+"%");
    
    }
}
