////////////////////////////////////////
//  EjercicioFalla - Christian Ramos  //
////////////////////////////////////////

package Boletin8.String2;
import java.util.Scanner;

public class EjercicioFalla {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String miPalabra = "";
        System.out.println("Por favor, introduzca una frase: ");
        String frase = s.nextLine();

        System.out.println("\nPor favor, introduzca una palabra: ");
        String palabra = s.next();

        int cont=0;
        for (int i=0;i<frase.length();i++) {
            if (!(frase.charAt(i)==' ')) {
                miPalabra+= frase.charAt(i);
            }
            if (frase.charAt(i)==' ' || i==frase.length()-1) {
                if (palabra.equalsIgnoreCase(miPalabra)) {
                    cont++;
                }
                miPalabra = "";
            }
        }
        
        if(cont==0){
            System.out.println("La palabra introducida no se encuentra en la frase.");
        } else {
            System.out.println("La palabra introducida se encuentra en la frase.");
        }

    }
}

