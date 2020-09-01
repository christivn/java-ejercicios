/////////////////////////////////////
//  Ejercicio10 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte2;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[][]n=new int[3][3];
    boolean fin=true;
    boolean win=false;
    
    while(fin){
    
    // Pinta el tablero
    int cont=1;
    for(int i=0;i<3;i++){
        System.out.print("       +-----+-----+-----+\n");
        System.out.print("       ");
        for(int x=0;x<3;x++){
            if(n[i][x]==0){
                System.out.print("|  "+(cont)+"  ");
            } else {
            if(n[i][x]==1){
                System.out.print("|  \u001B[36mX  ");
                System.out.print("\u001B[0m");
            } 
            if(n[i][x]==2){
                System.out.print("|  \u001B[31mO  ");
                System.out.print("\u001B[0m");
            }
            }
            cont++;
            
        }
        System.out.print("|\n");
    }
    System.out.print("       +-----+-----+-----+\n");
    
    // Elegir posición jugador 1
    int row=0;
    int col=0;
    boolean check=true;
    while(check){
    System.out.print("\n [Jugador 1] Ingresa la posision: ");
    int pos1=s.nextInt();

    check=false;
    switch(pos1){
        case 1: row=0;col=0; break;
        case 2: row=0;col=1; break;
        case 3: row=0;col=2; break;
        case 4: row=1;col=0; break;
        case 5: row=1;col=1; break;
        case 6: row=1;col=2; break;
        case 7: row=2;col=0; break;
        case 8: row=2;col=1; break;
        case 9: row=2;col=2; break;
        
        default: 
            System.out.println("[ DEBES INGRESAR UNA OPCIÓN VÁLIDA ]"); 
            check=true;
        break;
    }
    
    if(n[row][col]!=1 && n[row][col]!=2){
        n[row][col]=1;
    } else {
        System.out.println("[ DEBES INGRESAR UNA OPCIÓN VÁLIDA ]");
        check=true;
    }
       
    }

    
    
    // Se comprueba si hay algun ganador
    int check_fila=-1;
    if((n[0][0]==1 && n[0][1]==1 && n[0][2]==1) || (n[0][0]==2 && n[0][1]==2 && n[0][2]==2)){
        check_fila=0;
        win=true;
    }
    if((n[1][0]==1 && n[1][1]==1 && n[1][2]==1) || (n[1][0]==2 && n[1][1]==2 && n[1][2]==2)){
        check_fila=1;
        win=true;
    }
    if((n[2][0]==1 && n[2][1]==1 && n[2][2]==1) || (n[2][0]==2 && n[2][1]==2 && n[2][2]==2)){
        check_fila=2;
        win=true;
    }
    
    int check_col=-1;
    if((n[0][0]==1 && n[1][0]==1 && n[2][0]==1) || (n[0][0]==2 && n[1][0]==2 && n[2][0]==2)){
        check_col=0;
        win=true;
    }
    if((n[0][1]==1 && n[1][1]==1 && n[2][1]==1) || (n[0][1]==2 && n[1][1]==2 && n[2][1]==2)){
        check_col=1;
        win=true;
    }
    if((n[0][2]==1 && n[1][2]==1 && n[2][2]==1) || (n[0][2]==2 && n[1][2]==2 && n[2][2]==2)){
        check_col=2;
        win=true;
    }
    
    int check_dia=0;
    if((n[0][0]==1 && n[1][1]==1 && n[2][2]==1) || (n[0][0]==2 && n[1][1]==2 && n[2][2]==2)){
        check_dia=1;
        win=true;
    }
    if((n[0][2]==1 && n[1][1]==1 && n[2][0]==1) || (n[0][2]==2 && n[1][1]==2 && n[2][0]==2)){
        check_dia=2;
        win=true;
    }
    
    // Se comprueba si el tablero está lleno
    int seguir=0;
    for(int i=0;i<3;i++){
        for(int x=0;x<3;x++){
            if(n[i][x]!=2 && n[i][x]!=1){
                seguir++;
            }
        }
    }
    
    
    
    // Pinta el tablero
    if(win!=true && seguir!=0){
    cont=1;
    System.out.print("\n");
    for(int i=0;i<3;i++){
        System.out.print("       +-----+-----+-----+\n");
        System.out.print("       ");
        for(int x=0;x<3;x++){
            if(n[i][x]==0){
                System.out.print("|  "+(cont)+"  ");
            } else {
            if(n[i][x]==1){
                System.out.print("|  \u001B[36mX  ");
                System.out.print("\u001B[0m");
            }
            if(n[i][x]==2){
                System.out.print("|  \u001B[31mO  ");
                System.out.print("\u001B[0m");
            }
            }
            cont++;
            
        }
        System.out.print("|\n");
    }
    System.out.print("       +-----+-----+-----+\n");
    
    
    // Elegir posición jugador 2
    row=0;
    col=0;
    check=true;
    while(check){
    System.out.print("\n [Jugador 2] Ingresa la posision: ");
    int pos2=s.nextInt();

    check=false;
    switch(pos2){
        case 1: row=0;col=0; break;
        case 2: row=0;col=1; break;
        case 3: row=0;col=2; break;
        case 4: row=1;col=0; break;
        case 5: row=1;col=1; break;
        case 6: row=1;col=2; break;
        case 7: row=2;col=0; break;
        case 8: row=2;col=1; break;
        case 9: row=2;col=2; break;
        
        default: 
            System.out.println("[ DEBES INGRESAR UNA OPCIÓN VÁLIDA ]"); 
            check=true;
        break;
    }
    
    if(n[row][col]!=1 && n[row][col]!=2){
        n[row][col]=2;
    } else {
        System.out.println("[ DEBES INGRESAR UNA OPCIÓN VÁLIDA ]");
        check=true;
    }
       
    }
    }
    
    
    // Se comprueba si hay algun ganador
    check_fila=-1;
    if((n[0][0]==1 && n[0][1]==1 && n[0][2]==1) || (n[0][0]==2 && n[0][1]==2 && n[0][2]==2)){
        check_fila=0;
        win=true;
    }
    if((n[1][0]==1 && n[1][1]==1 && n[1][2]==1) || (n[1][0]==2 && n[1][1]==2 && n[1][2]==2)){
        check_fila=1;
        win=true;
    }
    if((n[2][0]==1 && n[2][1]==1 && n[2][2]==1) || (n[2][0]==2 && n[2][1]==2 && n[2][2]==2)){
        check_fila=2;
        win=true;
    }
    
    check_col=-1;
    if((n[0][0]==1 && n[1][0]==1 && n[2][0]==1) || (n[0][0]==2 && n[1][0]==2 && n[2][0]==2)){
        check_col=0;
        win=true;
    }
    if((n[0][1]==1 && n[1][1]==1 && n[2][1]==1) || (n[0][1]==2 && n[1][1]==2 && n[2][1]==2)){
        check_col=1;
        win=true;
    }
    if((n[0][2]==1 && n[1][2]==1 && n[2][2]==1) || (n[0][2]==2 && n[1][2]==2 && n[2][2]==2)){
        check_col=2;
        win=true;
    }
    
    check_dia=0;
    if((n[0][0]==1 && n[1][1]==1 && n[2][2]==1) || (n[0][0]==2 && n[1][1]==2 && n[2][2]==2)){
        check_dia=1;
        win=true;
    }
    if((n[0][2]==1 && n[1][1]==1 && n[2][0]==1) || (n[0][2]==2 && n[1][1]==2 && n[2][0]==2)){
        check_dia=2;
        win=true;
    }
    
    // Se comprueba si el tablero está lleno
    seguir=0;
    for(int i=0;i<3;i++){
        for(int x=0;x<3;x++){
            if(n[i][x]!=2 && n[i][x]!=1){
                seguir++;
            }
        }
    }
    
    
    // Pinta el ganador
    if(win || seguir==0){
    cont=1;
    System.out.print("\n\n");
    for(int i=0;i<3;i++){
        System.out.print("   +-----+-----+-----+\n");
        System.out.print("   ");
        for(int x=0;x<3;x++){
            if(n[i][x]==0){
                System.out.print("|  "+(cont)+"  ");
            } else {
            if(n[i][x]==1){
                System.out.print("|  \u001B[36mX  ");
                System.out.print("\u001B[0m");
            }
            if(n[i][x]==2){
                System.out.print("|  \u001B[31mO  ");
                System.out.print("\u001B[0m");
            }
            }
            cont++;
            
        }
        System.out.print("|\n");
    }
    System.out.print("   +-----+-----+-----+\n");
    }
    
    if(check_fila!=-1){
        if(n[check_fila][0]==1){
            System.out.println("\n ------------------------");
            System.out.println("  EL JUGADOR 1 HA GANADO"); 
            System.out.println(" ------------------------");
            System.exit(0);
        } else {
            System.out.println("\n ------------------------");
            System.out.println("  EL JUGADOR 2 HA GANADO");
            System.out.println(" ------------------------");
            System.exit(0);
        }
    }
    
    if(check_col!=-1){
        if(n[0][check_col]==1){
            System.out.println("\n ------------------------");
            System.out.println("  EL JUGADOR 1 HA GANADO"); 
            System.out.println(" ------------------------");
            System.exit(0);
        } else {
            System.out.println("\n ------------------------");
            System.out.println("  EL JUGADOR 2 HA GANADO");
            System.out.println(" ------------------------");
            System.exit(0);
        }
    }
    
    if(check_dia!=0){
        if(n[1][1]==1){
            System.out.println("\n ------------------------");
            System.out.println("  EL JUGADOR 1 HA GANADO"); 
            System.out.println(" ------------------------");
            System.exit(0);
        } else {
            System.out.println("\n ------------------------");
            System.out.println("  EL JUGADOR 2 HA GANADO");
            System.out.println(" ------------------------");
            System.exit(0);
        }
    }
    
    if(seguir==0){
        System.out.println("\n ------------------------");
        System.out.println("   HA HABIDO UN EMPATE");
        System.out.println(" ------------------------");
        System.exit(0);
    }
    
    
    System.out.print("\n\n");
    }
    }
}
