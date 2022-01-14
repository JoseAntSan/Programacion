/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg12.mayor.menor.q;

import java.util.*;

/**
 *
 * @author deber
 */
public class Practica12MayorMenorQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    int num;
    int edad;
    
    public void ingresarDatos(){
    System.out.println("Ingrese su edad:");           
    int edad = leer.nextInt();
    }
    
    public void mostrarDatos(){
    if (edad<=18) {
       System.out.println("Es mayor de edad");
    }  
    else{
       System.out.println("Es menor de edad");
    }
    }
}
}
