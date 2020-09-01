/////////////////////////////////////////
//  Ejercicio10_IA - Christian Ramos  //
///////////////////////////////////////

package Boletin7.Parte2;
import java.util.Scanner;

public class Ejercicio10_IA {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[][]n=new int[3][3];
    boolean fin=true;
    boolean win=false;
    
    while(fin){
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
    
    int row=0;
    int col=0;
    boolean check=true;
    while(check){
    System.out.print("\n Ingresa la posision: ");
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
    
    
    if(win!=true){
    // ------------------[ CÓDIGO DE LA IA ]----------------  //
    boolean ia=false; // Chequea si la IA a movido ya
    

    
    //---------------[ Para las Diagonales ]---------------
    // |X| | |
    // | |X| |
    // | | |O|
    if(ia==false){
        if(n[0][0]==1 && n[1][1]==1){
            if(n[2][2]!=2 && n[2][2]!=1){
                n[2][2]=2;
                ia=true;
            }
        }
    }
    
    // | | |X|
    // | |X| |
    // |O| | |
    if(ia==false){
        if(n[0][2]==1 && n[1][1]==1){
            if(n[2][0]!=2 && n[2][0]!=1){
                n[2][0]=2;
                ia=true;
            }
        }
    }
    
    // | | |O|
    // | |X| |
    // |X| | |
    if(ia==false){
        if(n[2][0]==1 && n[1][1]==1){
            if(n[0][2]!=2 && n[0][2]!=1){
                n[0][2]=2;
                ia=true;
            }
        }
    }
        
    // |O| | |
    // | |X| |
    // | | |X|
    if(ia==false){
        if(n[2][2]==1 && n[1][1]==1){
            if(n[0][0]!=2 && n[0][0]!=1){
                n[0][0]=2;
                ia=true;
            }
        }
    }
    
    
    
    // ---------------[ Para las Horizontales ]---------------
    for(int i=0;i<3;i++){
        
    // |X|X|O|
    // | | | |
    // | | | |
    if(ia==false){
        if(n[i][0]==1 && n[i][1]==1){
            if(n[i][2]!=2 && n[i][2]!=1){
                n[i][2]=2;
                ia=true;
            }
        }
    }
    
    // |O|X|X|
    // | | | |
    // | | | |
    if(ia==false){
        if(n[i][1]==1 && n[i][2]==1){
            if(n[i][0]!=2 && n[i][0]!=1){
                n[i][0]=2;
                ia=true;
            }
        }
    }
    
    // |X|O|X|
    // | | | |
    // | | | |
    if(ia==false){
        if(n[i][0]==1 && n[i][2]==1){
            if(n[i][1]!=2 && n[i][1]!=1){
                n[i][1]=2;
                ia=true;
            }
        }
    }
    
    }
    
    
    
    // ---------------[ Para las Verticales ]---------------
    for(int i=0;i<3;i++){
        
    // |X| | |
    // |X| | |
    // |O| | |
    if(ia==false){
        if(n[0][i]==1 && n[1][i]==1){
            if(n[2][i]!=2 && n[2][i]!=1){
                n[2][i]=2;
                ia=true;
            }
        }
    }
    
    // |O| | |
    // |X| | |
    // |X| | |
    if(ia==false){
        if(n[1][i]==1 && n[2][i]==1){
            if(n[0][i]!=2 && n[0][i]!=1){
                n[0][i]=2;
                ia=true;
            }
        }
    }
    
    // |X| | |
    // |O| | |
    // |X| | |
    if(ia==false){
        if(n[0][i]==1 && n[2][i]==1){
            if(n[1][i]!=2 && n[1][i]!=1){
                n[1][i]=2;
                ia=true;
            }
        }
    }
    
    }
    
    
    
    //---------------[ Para el centro ]---------------
    // |O| |O|
    // | |X| |
    // |O| |O|
    if(ia==false){
    if(n[1][1]==1 && n[0][0]!=1  && n[0][2]!=1 && n[2][0]!=1 && n[2][2]!=1){ 
        // Selecciona una posición random en una de las 4 esquinas
        int rand=(int)(Math.random()*4);
        switch(rand){
            case 0: n[0][0]=2;ia=true; break;
            case 1: n[0][2]=2;ia=true; break;
            case 2: n[2][0]=2;ia=true; break;
            case 3: n[2][2]=2;ia=true; break;
        }
    } else {
        // Si el jugador no la coloca en el centro la coloca la IA
        if(n[1][1]!=1 && n[1][1]!=2){
            n[1][1]=2;
            ia=true;
        }
    }
    }
    
    
    // ---------------[ Si no puede bloquear poner aleatoriamente ]---------------
    // Se comprueba si el tablero está lleno
    seguir=0;
    for(int i=0;i<3;i++){
        for(int x=0;x<3;x++){
            if(n[i][x]!=2 && n[i][x]!=1){
                seguir++;
            }
        }
    }
    
    // Si el tablero está lleno acabar con el bucle random
    if(seguir==0){
       ia=true;
    }
    
    while(ia==false){ 
        // Selecciona una posición random libre del tablero
        int rand=(int)(Math.random()*9);
        int fila=0;
        int colum=0;
        switch(rand){
            case 0: fila=0;colum=0; break;
            case 1: fila=0;colum=1; break;
            case 2: fila=0;colum=2; break;
            case 3: fila=1;colum=0; break;
            case 4: fila=1;colum=1; break;
            case 5: fila=1;colum=2; break;
            case 6: fila=2;colum=0; break;
            case 7: fila=2;colum=1; break;
            case 8: fila=2;colum=2; break;
        }
        
        if(n[fila][colum]!=2 && n[fila][colum]!=1){
            n[fila][colum]=2;
            ia=true;
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

