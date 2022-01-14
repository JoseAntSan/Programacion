/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg8.pkgif;

import java.util.Scanner;

/**
 *
 * @author deber
 */
class edad {
    Scanner leer = new Scanner(System.in);
    int edad=20;
    
    public void mostrarDatos(){
    if (edad>=0 & edad<=11) {
       System.out.println("Es un niño ");
    }
    else if (edad>=12 & edad<=18) {
       System.out.println("Es un Adolecente");
        }
        else if (edad>=19 & edad<=30) {
            System.out.println("Es un Joven");
         }  
            else if (edad>=31 & edad<=65) {
                   System.out.println("Es un Adulto");
                }  
                else{
                       System.out.println("Es de la Terecra Edad");
                    }
    }
}
