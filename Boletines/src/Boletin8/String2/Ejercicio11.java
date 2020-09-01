/////////////////////////////////////
//  Ejercicio11 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String2;
public class Ejercicio11 {
    public static void main(String[] args) {
    
    String texto="Apenas dieron las 6 de la mañana, despuntaba el sol, e iluminaba la población,\n"+
                 " mostrando lo que la oscuridad de la noche no había dejado ver a mi arribo: \n"+
                 " varias casas con tejas esmaltadas, brillando bajo los primeros rayos del sol;\n"+
                 " la sombra de la torre de la iglesia pasando por el centro de la plaza hasta terminar\n"+
                 " con la sombra de la cruz sobre la puerta del palacio municipal. A un lado, los comercios\n"+
                 " del mercado que han abierto antes del alba: la carnicería, la recaudería, con verduras\n"+
                 " recién cortadas, en la tienda de abarrotes, frijol y maíz de la última cosecha… Después\n"+
                 " de 40 años, ese amanecer me llenó el corazón.";
    texto=texto.replaceAll(" +", " ");
    String[] palabras=texto.split(" ");
    
    
    // Quitar signos de puntuación a las palabras
    for(int i=0;i<palabras.length;i++){
        palabras[i]=palabras[i].replaceAll("\\.","");
        palabras[i]=palabras[i].replaceAll(",","");
        palabras[i]=palabras[i].replaceAll(":","");
        palabras[i]=palabras[i].replaceAll(";","");
        palabras[i]=palabras[i].replaceAll("¿","");
        palabras[i]=palabras[i].replaceAll("\\?","");
        palabras[i]=palabras[i].replaceAll("!","");
        palabras[i]=palabras[i].replaceAll("¡","");
        palabras[i]=palabras[i].replaceAll("\\(","");
        palabras[i]=palabras[i].replaceAll("\\)","");
        palabras[i]=palabras[i].replaceAll("\\[","");
        palabras[i]=palabras[i].replaceAll("]","");
        palabras[i]=palabras[i].replaceAll("\\{","");
        palabras[i]=palabras[i].replaceAll("}","");
        palabras[i]=palabras[i].replaceAll("\n","");
    }
    
    
    // Coger la palabra más larga
    String palabra_larga=palabras[0];
    for(int i=0;i<palabras.length;i++){
        if(palabras[i].length()>palabra_larga.length()){
            palabra_larga=palabras[i];
        }
    }
    
    
    System.out.println(texto+"\n+------------------------------------------------------------------------------+");
    System.out.println("La palabra más larga es: "+palabra_larga);
    System.out.println("La longitud de la palabra más larga es: "+palabra_larga.length());
    System.out.println("La posición inicial de la palabra más larga es: "+texto.indexOf(palabra_larga));
    System.out.println("+------------------------------------------------------------------------------+");
    System.out.println("Palabras con una longitud entre 8 y 16 caracteres que poseen más de tres veces la vocal \"a\": ");
    for(int i=0;i<palabras.length;i++){
        if(palabras[i].length()>=8 && palabras[i].length()<=16){
            
            int ocurrencias=0;
            for(int z=0;z<palabras[i].length();z++){
                char caracter=palabras[i].charAt(z);
                if(caracter=='a'){
                    ocurrencias++;
                }
            }
            
            if(ocurrencias>=3){
                System.out.print(palabras[i]+", ");
            }
        }
    }
    System.out.println("\n+------------------------------------------------------------------------------+");
    
    }
}