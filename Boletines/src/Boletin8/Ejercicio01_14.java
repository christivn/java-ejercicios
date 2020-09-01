///////////////////////////////////////////
//  Ejercicio01_14-14 - Christian Ramos  //
///////////////////////////////////////////

package Boletin8;
import Funciones.Varias;

public class Ejercicio01_14 {
public static void main(String[] args) {
  
    int num=12345; // Introduce aqui el numero a probar
    
    System.out.println("1. ¿El número "+num+" es capicua?: "+Varias.esCapicua(num)+"\n");
    System.out.println("2. ¿El número "+num+" es primo?: "+Varias.esPrimo(num)+"\n");
    System.out.println("3. El número menor primo de "+num+" es: "+Varias.siguientePrimo(num)+"\n");
    System.out.println("4. La potencia de "+num+" elevado a 2 es: "+Varias.potencia(num,2)+"\n");
    System.out.println("5. Cuenta número de dígitos de "+num+" es: "+Varias.digitos(num)+"\n");
    System.out.println("6. Voltea el número "+num+": "+Varias.voltea(num)+"\n");
    System.out.println("7. El digito número 2 de "+num+" es: "+Varias.digitoN(num,2)+"\n");
    System.out.println("8. La posición del dígito 2 en el numero "+num+" es: "+Varias.posicionDeDigito(num,2)+"\n");
    System.out.println("9. El número "+num+" sin 2 digitos de detrás es: "+Varias.quitaPorDetras(num,2)+"\n");
    System.out.println("10. El número "+num+" sin 2 digitos de delante es: "+Varias.quitaPorDelante(num,2)+"\n");
    System.out.println("11. El número "+num+" con el número 2 añadido por detras es: "+Varias.pegaPorDetras(num,2)+"\n");
    System.out.println("12. El número "+num+" con el número 2 añadido por delante es: "+Varias.pegaPorDelante(num,2)+"\n");
    System.out.println("13. Trozo de "+num+" con inicio posición 2 y final posición 4 es: "+Varias.trozoDeNumero(num,2,4)+"\n");
    System.out.println("14. Pegar el número "+num+" y el número 123: "+Varias.juntaNumeros(num,123)+"\n");
 }
}

