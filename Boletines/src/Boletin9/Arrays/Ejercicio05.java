/////////////////////////////////////
//  Ejercicio05 - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Arrays;
import Boletin9.Clases.Articulo;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    
    ArrayList<Articulo> almacen = new ArrayList<>();
    
    for(;;){
    System.out.println("\n+-------------------------+");
    System.out.println("|       GESTISIMAL        |");
    System.out.println("+-------------------------+");
    System.out.println("1. Listado\n" +
                       "2. Alta\n" +
                       "3. Baja\n" +
                       "4. Modificación\n" +
                       "5. Entrada de mercancía\n" +
                       "6. Salida de mercancía\n" +
                       "7. Salir");
    System.out.println("+-------------------------+");
    System.out.print("Selecciona una opción: ");
    int opcion=s.nextInt();
    
    switch(opcion){
        case 1:
            System.out.println("\n[ LISTADO ]");
            if(almacen.isEmpty()){
                System.out.println("Aún no hay articulos en el almacén");
                esperar();
            } else {
                for(int i=0;i<almacen.size();i++){
                    System.out.println(almacen.get(i)+"\n");
                }
                esperar();
            }
        break;
        
        case 2:
            System.out.println("\n[ FORMULARIO DE ALTA ]");
            Articulo nuevo=new Articulo();
            
            System.out.print("Codigo: ");
            String codigo=s.next();
            boolean existe_codigo=false;
            for(int i=0;i<almacen.size();i++){
                if(codigo.equals(almacen.get(i).getCodigo())){
                    existe_codigo=true;
                }
            }
            if(existe_codigo){
                System.err.println("[ EL CÓDIGO INTRODUCIDO YA EXISTE ]");
                esperar();
            } else {
            nuevo.setCodigo(codigo);
            
            System.out.print("Descripción: ");
            String desc=s.nextLine();
            nuevo.setDescripcion(desc);
            
            s.nextLine();
            
            System.out.print("Precio de compra: ");
            double p_compra=s.nextDouble();
            nuevo.setPrecio_compra(p_compra);
            
            System.out.print("Precio de venta: ");
            double p_venta=s.nextDouble();
            nuevo.setPrecio_venta(p_venta);
            
            System.out.print("Stock: ");
            int stock=s.nextInt();
            nuevo.setStock(stock);
            
            almacen.add(nuevo);
            System.out.println("[ SE HA AÑADIDO EL ARTICULO CORRECTAMENTE ]");
            esperar();
            }
        break;
        
        case 3:
            System.out.println("\n[ FORMULARIO DE BAJA ]");
            System.out.println("Introduce el código del articulo que quieras dar de baja");
            System.out.print("Codigo del articulo: ");
            String codigo_baja=s.next();
            
            for(int i=0;i<almacen.size();i++){
                if(codigo_baja.equals(almacen.get(i).getCodigo())){
                    System.out.println("[ SE BORRARÁ EL ARTICULO '"+almacen.get(i).getDescripcion()+"' ]");
                    System.out.print("Desea continuar (S/N): ");
                    String continuar=s.next();
                        if(continuar.toUpperCase().equals("S")){
                            almacen.remove(i);
                            System.out.println("[ SE HA AÑADIDO EL ARTICULO CORRECTAMENTE ]");
                            esperar();
                        } else {
                            System.out.println("[ SE HA CANCELADO LA OPERACIÓN DE BAJA ]");
                            esperar();
                        }
                }
            }
            
        break;
        
        case 4:
            System.out.print("Introduce el codigo del articulo a modificar: ");
            String mod_cod=s.next();

            int posicion=-1;
            for(int i=0;i<almacen.size();i++){
                if(mod_cod.equals(almacen.get(i).getCodigo())){
                    posicion=i;
                }
            }
            
            if(posicion==-1){
                System.err.println("[ EL CODIGO INTRODUCIDO NO COINCIDE CON NINGÚN ARTICULO ]");
                esperar();
            } else {
            System.out.println("+-------------------------+");
            System.out.println("1. Modificar Código\n" +
                       "2. Modificar Descripción\n" +
                       "3. Modificar Precio de compra\n" +
                       "4. Modificar Precio de venta\n" +
                       "5. Modificar Stock\n" +
                       "6. Atras");
            System.out.println("+-------------------------+");
            System.out.print("Selecciona una opción: ");
            int opcion_mod=s.nextInt();
            
            switch(opcion_mod){
                case 1:
                    System.out.print("Nuevo código: ");
                    String mod=s.next();
                    almacen.get(posicion).setCodigo(mod);
                    
                    System.out.println("[ SE HA REALIZADO LA MODIFICACIÓN CON EXITO ]");
                    esperar();
                break;
                
                case 2:
                    System.out.print("Nueva descripción: ");
                    String mod_desc=s.nextLine();
                    almacen.get(posicion).setDescripcion(mod_desc);
                    
                    System.out.println("[ SE HA REALIZADO LA MODIFICACIÓN CON EXITO ]");
                    esperar();
                break;
                
                case 3:
                    System.out.print("Nuevo precio de compra: ");
                    double mod_pcompra=s.nextDouble();
                    almacen.get(posicion).setPrecio_compra(mod_pcompra);
                    
                    System.out.println("[ SE HA REALIZADO LA MODIFICACIÓN CON EXITO ]");
                    esperar();
                break;
                
                case 4:
                    System.out.print("Nuevo precio de compra: ");
                    double mod_pventa=s.nextDouble();
                    almacen.get(posicion).setPrecio_venta(mod_pventa);
                    
                    System.out.println("[ SE HA REALIZADO LA MODIFICACIÓN CON EXITO ]");
                    esperar();
                break;
                
                case 5:
                    System.out.print("Nuevo Stock: ");
                    int mod_stock=s.nextInt();
                    almacen.get(posicion).setStock(mod_stock);

                    System.out.println("[ SE HA REALIZADO LA MODIFICACIÓN CON EXITO ]");
                    esperar();
                break;
            }
            }
            
        break;
        
        case 5:
            System.out.println("\n[ ENTRADA DE MERCANCIA ]");
            System.out.print("Introduce el codigo del articulo: ");
            String e_cod=s.next();

            int posicion_e=-1;
            for(int i=0;i<almacen.size();i++){
                if(e_cod.equals(almacen.get(i).getCodigo())){
                    posicion_e=i;
                }
            }
            
            if(posicion_e==-1){
                System.err.println("[ EL CÓDIGO INTRODUCIDO NO COINCIDE CON NINGÚN ARTICULO ]");
                esperar();
            } else {
                System.out.print("Introduce la cantidad de entrada: ");
                int cant_e=s.nextInt();
                
                int stock_actual=almacen.get(posicion_e).getStock();
                almacen.get(posicion_e).setStock(stock_actual);
                
                System.out.println("[ SE HA EFECTUADO LA ENTRADA DE MERCANCIA EXITOSAMENTE ]");
                esperar();
            }
        break;
        
        case 6:
            System.out.println("\n[ SALIDA DE MERCANCIA ]");
                        System.out.print("Introduce el codigo del articulo: ");
            String s_cod=s.next();

            int posicion_s=-1;
            for(int i=0;i<almacen.size();i++){
                if(s_cod.equals(almacen.get(i).getCodigo())){
                    posicion_s=i;
                }
            }
            
            if(posicion_s==-1){
                System.err.println("[ EL CODIGO INTRODUCIDO NO COINCIDE CON NINGÚN ARTICULO ]");
                esperar();
            } else {
                System.out.print("Introduce la cantidad de salida: ");
                int cant_s=s.nextInt();
                
                if(cant_s>almacen.get(posicion_s).getStock()){
                    System.err.println("[ FALTA ARTICULOS EN STOCK PARA UNA SALIDA DE "+cant_s+" ]");
                } else {
                    int stock_actual=almacen.get(posicion_s).getStock();
                    almacen.get(posicion_s).setStock(stock_actual-cant_s);
                    System.out.println("[ SE HA EFECTUADO LA SALIDA DE MERCANCIA EXITOSAMENTE ]");
                    esperar();
                }
            }
        break;
        
        case 7:
            System.exit(0);
        break;
        
        default:
            System.err.println("\n[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]\n");
        break;
    }
    }
    
    }
    
public static void esperar(){
    Scanner h=new Scanner(System.in);
    System.out.println("\n\nPresiona cualquier tecla para continuar..");
    h.nextLine();
}
}