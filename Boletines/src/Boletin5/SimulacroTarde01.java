/////////////////////////////////////
//  SimulacroTarde01 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SimulacroTarde01 {
    public static void main(String[] args) {
    
    Scanner n = new Scanner(System.in);
    Scanner c = new Scanner(System.in);
    Scanner s = new Scanner(System.in);
    
    String nombre_apellidos="";
    String estado_civil="";
    double peso=0;
    double altura=0;
    
    double imc1=0;
    double imc2=0;
    double imc3=0;
    double imc4=0;
    
    double max=0;
    double min=100;
    int cont_casados=0;
    
    for(int i=0;i<4;i++){ 
    System.out.println("\n<------------------[ Persona ("+(i+1)+"/4) ]------------------------>");
    
    boolean nombre_apellidos_check=true;
    while(nombre_apellidos_check==true){
        System.out.print("Nombre y Apellidos: ");
        nombre_apellidos=n.nextLine();
        
        if(nombre_apellidos.equals("")){
            System.out.print("[ DEBES INTRODUCIR UN NOMBRE ]\n");
            nombre_apellidos_check=true;
        } else {
            nombre_apellidos_check=false;
        }
    }
    
    
    boolean estado_civil_check=true;
    while(estado_civil_check==true || estado_civil.equals("")){
        System.out.print("Estado civil (S/C/V/D): ");
        estado_civil=c.nextLine();
        estado_civil=estado_civil.toLowerCase();
        
        if(estado_civil.equals("c")){
            cont_casados++;
        }
        
        if(!estado_civil.equals("s") && !estado_civil.equals("c") && !estado_civil.equals("v") && !estado_civil.equals("d")){
            System.out.print("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA (S - C - V - D)]\n");
            estado_civil_check=true;
        } else {
            estado_civil_check=false;
        }
    }
    
    
    while(peso<=0 && peso<=200){
        System.out.print("Peso (kg): ");
        peso=s.nextDouble();
        
        if(peso<=0){
         System.out.print("[ DEBES INTRODUCIR UN PESO VÁLIDO ]\n");
        }
    }
    
    
    while(altura<=0 && altura<=250){
        System.out.print("Altura (metros): ");
        altura=s.nextDouble();
        
        if(altura<=0){
         System.out.print("[ DEBES INTRODUCIR UNA ALTURA VÁLIDA ]\n");
        }
    }
    
    
    if(i==0){
        imc1=peso/altura;
                
    }
    if(i==1){
        imc2=peso/altura;
    }
    if(i==2){
        imc3=peso/altura;
    }
    if(i==3){
        imc4=peso/altura;
    }
    
    nombre_apellidos="";
    estado_civil="";
    peso=0;
    altura=0;  
    }
    

    
    if(imc1>max){
        max=imc1;
    }
    if(imc2>max){
        max=imc2;
    }
    if(imc3>max){
        max=imc3;
    }
    if(imc4>max){
        max=imc4;
    }
    
    
    if(imc1<min){
        min=imc1;
    }
    if(imc2<min){
        min=imc2;
    }
    if(imc3<min){
        min=imc3;
    }
    if(imc4<min){
        min=imc4;
    }
    
    DecimalFormat df2 = new DecimalFormat("#.##");
    System.out.println("<----------------------------------------------------------->\n");
    System.out.println("Persona 1 (IMC): "+df2.format(imc1));
    System.out.println("Persona 2 (IMC): "+df2.format(imc2));
    System.out.println("Persona 3 (IMC): "+df2.format(imc3));
    System.out.println("Persona 4 (IMC): "+df2.format(imc4)+"\n");
    System.out.println(" -IMC mayor: "+df2.format(max));
    System.out.println(" -IMC menor: "+df2.format(min));
    System.out.println("\n -Casados: "+cont_casados);
    
    }
}
