/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;


//import Practica1.*;

/**
 *
 * @author EMILY_COYOY
 */
public class tablero{
    
    
    public static void main(String[] args){
        Practica1 p = new Practica1();
        p.menu();
        new Thread(new Practica1()).start();
        p.initablero();
        p.tablero();
        p.limpiar();
        p.movimiento();
        p.datos();
        //p.snake();
        //p.imprimir();
        
    }
}
