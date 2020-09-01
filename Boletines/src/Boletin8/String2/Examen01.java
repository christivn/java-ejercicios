///////////////////////////////////
//  Examen01 - Christian Ramos  //
//////////////////////////////////

package Boletin8.String2;
import java.util.Scanner;

import static Boletin8.String2.Examen01_Funciones.multiplo5;
import static Boletin8.String2.Examen01_Funciones.pesetas_duros1;
import static Boletin8.String2.Examen01_Funciones.pesetas_duros20;
import static Boletin8.String2.Examen01_Funciones.pesetas_duros5;

public class Examen01 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        
        int pesetas=1;
        while(multiplo5(pesetas)==false){
            System.out.print("Escriba un importe en pesetas (múltiplo de 5) para calcular sus duros: ");
            pesetas=s.nextInt();
            System.out.print("\n");
        }
        
        System.out.print(pesetas+" pesetas son: ");
        System.out.print(pesetas_duros20(pesetas)+" moneda(s) de 20 duros, ");
        System.out.print(pesetas_duros5(pesetas)+" moneda(s) de 5 duros y ");
        System.out.print(pesetas_duros1(pesetas)+" moneda(s) de 1 duros");
        
        System.out.print("\n");
    }
}
