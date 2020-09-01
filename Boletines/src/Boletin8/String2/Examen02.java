/////////////////////////////////////
//  Examen02 - Christian Ramos     //
/////////////////////////////////////

package Boletin8.String2;

import java.util.Scanner;
import static Boletin8.String2.Examen01_Funciones.multiplo5;
import static Boletin8.String2.Examen01_Funciones.pesetas_duros1;
import static Boletin8.String2.Examen01_Funciones.pesetas_duros5;
import static Boletin8.String2.Examen01_Funciones.pesetas_duros20;

public class Examen02 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        
        int pesetas=1;
        while(multiplo5(pesetas)==false){
            System.out.print("Escriba un importe en pesetas (múltiplo de 5) para calcular sus duros: ");
            pesetas=s.nextInt();
            System.out.print("\n");
        }
        
        int monedas=pesetas_duros20(pesetas)+pesetas_duros5(pesetas)+pesetas_duros1(pesetas);
        System.out.println("El cambio para "+pesetas+" pesetas son "+monedas+" monedas.");
    
    }
}
