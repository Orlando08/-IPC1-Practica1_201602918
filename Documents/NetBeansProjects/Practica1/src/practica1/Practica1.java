/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author EMILY_COYOY
 */
public class Practica1 /*implements Runnable */{
    char[][] tablero;
    int tamañox;
    int tamañoy;
    int fila;
    int columna;
    int c;
    int f;
    int po;
    int po1;
    char fruto='%';
    Random r = new Random();
    int aux;
    String mov;
    int tamañosnake;
    int contador;
    String snak;
    String nick;
    String[] usuario = new String[5];
    Scanner entrada = new Scanner(System.in);
     
    public void menu(){
        // TODO code application logic here
                       
        //int tamañox;
        //int tamañoy=0;
        int opcion;
        
        boolean salir = false; 
               
       // while(!salir){
            System.out.println("1. Inicio del juego:");
            System.out.println("2. Datos del estudiante:");
            System.out.println("3. Historial de partidas jugadas:");
            System.out.println("4. Salir:");
            
            try{
                System.out.println("Seleccione una opcion");
                opcion = entrada.nextInt();
                
                switch (opcion){
                    case 1:
                        
                        System.out.println("Ingrese nombre de usuario:");
                        nick = entrada.next();  
                        
                        
                        System.out.println("Ingrese el numero de filas del tablero: ");                        
                        tamañox = entrada.nextInt();
                       
                        System.out.println("Ingrese el numero de columnas del tablero: ");
                        tamañoy = entrada.nextInt();
                        
                        System.out.println("Ingrese el tamaño inicial del Snake: ");
                        tamañosnake = entrada.nextInt(); 
                        
                        System.out.println("Ingrese fila de inicio del snake");
                        fila = entrada.nextInt();
                        
                        System.out.println("Ingrese columna de inicio del snake");
                        columna = entrada.nextInt();
                        
                    break;
                    case 2:
                        System.out.println("Datos del estudiante");
                        
                    case 4:
                        salir = true;
                }
                
            }
            catch(InputMismatchException e){
                System.out.println("Inserta un numero");
                entrada.next();
                
             }
              
    //}
        
 }
    public void initablero(){
        tablero = new char[tamañox][tamañoy];
        
        }
    public void tablero(){
        if(fila>=tamañox && fila>=tamañoy || columna>=tamañox && columna>=tamañoy){
            System.out.println("coordenadas fuera del tablero");
        }        
        else{
            if(tamañosnake>tamañox&&tamañosnake>tamañoy){
                System.out.println("tamaño de snake muy grande");
            }else{
                while(contador<=tamañosnake-1){
                    snak = snak+"@";
                    contador++;
                }
                
            }
        }
        
                
        for (f=0;f<tablero.length;f++) {
            for (c=0;c<tablero[f].length;c++) {
                System.out.print(tablero[f][c]+" . ");
                
                }           
              System.out.println();
            }
              /*po = r.nextInt(f);
                po1 = r.nextInt(f);
                tablero[po][po1]='*';*/
    }
    
    
    
    public void limpiar(){
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[i].length;j++){
                tablero[i][j] = ' ';
            }
        }
    }
    public void movimiento(){
        while(true){
           limpiar();
           System.out.println("Utilice teclas a, s, d, w; para mover el snake");
           aux=0;
           mov=entrada.next();
           
           switch(mov){
               
               case "w":
                   
                   if(fila>=0&&fila<tamañox){
                       tablero[fila][columna]='@';
                       
                       //aux++;
                       fila--;
                       
                       tablero();
                       
                   }else{
                       System.out.println("ingrese otra coordenada");
                   }
                   
                break;
               case "d":
                    
                   if(columna>=0&&columna<tamañoy){
                       tablero[fila][columna]='@';
                       //aux++;
                       columna++;
                       
                       tablero();
                       
                   }else{
                       System.out.println("ingrese otra coordenada");
                   
                   }
                break;
               case "s":
                    if(fila>=0&&fila<tamañox){
                       tablero[fila][columna]= '@';
                       //aux++;
                       fila++;
                       
                       tablero();
                   }else{
                       System.out.println("ingrese otra coordenada");
                   }
                break;
                case "a":
                    if(columna>=0&&columna<tamañoy){
                       tablero[fila][columna]= '@';
                       //aux++;
                       columna--;
                       
                       tablero();
                   }else{
                       System.out.println("ingrese otra coordenada");
                   }
                break;
           }
           
           /*if(mov=="w"){
               fila = fila++;
           }
           if(mov=="s"){
               fila=fila--;
           }*/
        }
    }
    public void datos(){
        for (int g = 0; g < usuario.length; g++) {
            System.out.print("usuario " + (g + 1));
            usuario[g] = nick;
        }
        System.out.println(usuario);
    }
    /*public void run() {
		Scanner sc = new Scanner(System.in);
		int n;
		char[][] data={
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58},
    {32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
    {58,58,58,32,32,58,58,58,58,58,32,58,58,58,58,58,32,58,32,32,32,58,32,58,32,32,32,58,32,58,58,58,58,58,32,58,32,32,32,58,32,58,58,58,58,58,32,58,58,58,58,32,32,32,58,58,58,32,32,32,32,58,58,58},
	{58,32,32,58,32,32,32,58,32,32,32,58,32,32,32,32,32,58,58,32,32,58,32,58,32,32,32,58,32,58,32,32,32,32,32,58,58,32,32,58,32,32,32,58,32,32,32,58,32,32,32,58,32,58,32,32,32,58,32,32,32,58,58,58  },
	{58,32,32,58,32,32,32,58,32,32,32,58,32,32,32,32,32,58,58,32,32,58,32,58,32,32,32,58,32,58,32,32,32,32,32,58,58,32,32,58,32,32,32,58,32,32,32,58,32,32,32,58,32,58,32,32,32,58,32,32,32,58,58,58 },
	{58,32,32,58,32,32,32,58,32,32,32,58,32,32,32,32,32,58,32,58,32,58,32,32,58,32,58,32,32,58,32,32,32,32,32,58,32,58,32,58,32,32,32,58,32,32,32,58,32,32,32,58,32,58,32,32,32,58,32,32,32,58,58,58 },
	{58,58,58,32,32,32,32,58,32,32,32,58,58,58,58,58,32,58,32,58,32,58,32,32,58,32,58,32,32,58,58,58,58,58,32,58,32,58,32,58,32,32,32,58,32,32,32,58,32,32,32,58,32,58,32,32,32,58,32,32,32,58,58,58 },
	{58,32,32,58,32,32,32,58,32,32,32,58,32,32,32,32,32,58,32,32,58,58,32,32,58,32,58,32,32,58,32,32,32,32,32,58,32,32,58,58,32,32,32,58,32,32,32,58,32,32,32,58,32,58,32,32,32,58,32,32,32,58,58,58  },
	{58,32,32,58,32,32,32,58,32,32,32,58,32,32,32,32,32,58,32,32,58,58,32,32,32,58,32,32,32,58,32,32,32,32,32,58,32,32,58,58,32,32,32,58,32,32,32,58,32,32,32,58,32,58,32,32,32,58,32,32,32,32,32,32},
	{58,58,58,32,32,58,58,58,58,58,32,58,58,58,58,58,32,58,32,32,32,58,32,32,32,58,32,32,32,58,58,58,58,58,32,58,32,32,32,58,32,58,58,58,58,58,32,58,58,58,58,32,32,32,58,58,58,32,58,58,58,58,58,58},
	{32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
    {58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58}
 };
       for(int m=0;m<data.length;m++){
           try {
               
             for(int l=0;l<data[m].length;l++){               
                     Thread.sleep(10);
                     System.out.print(data[m][l]);
             }
               System.out.println();
            
           } catch (InterruptedException ex) {
               ex.printStackTrace();
           }
       }
	   System.out.println(usuario);
	   System.out.println("201603150");
	   System.out.println();
	   System.out.println("Desea Regresar");
    }*/
}

    
   
