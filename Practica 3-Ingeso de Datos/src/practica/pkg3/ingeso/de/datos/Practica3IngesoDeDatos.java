/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3.ingeso.de.datos;

import java.util.Scanner;

/**
 *
 * @author deber
 */
public class Practica3IngesoDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Formulario");
        System.out.println("-------------------");
        System.out.println("Ingrese elnombre del usuario:");
        Scanner leer = new Scanner(System.in);
        String usuario = leer.nextLine();
        System.out.println("Su usuario es: " + usuario);

        System.out.println("Ingrese ingrese sus 2 Nombres:");
        String nombre = leer.nextLine();
        System.out.println("Nombres: " + nombre);
        
        System.out.println("Ingrese ingrese sus 2 Apellidos:");
        String apellido = leer.nextLine();
        System.out.println("Apellido: " + apellido);
        
        System.out.println("Ingrese ingrese su Direccion:");
        String direccion = leer.nextLine();
        System.out.println("Su Direccion es : " + direccion);
        
        System.out.println("Ingrese ingrese su Genero:");
        String genero = leer.nextLine();
        System.out.println("Su Genero es: " + genero);
        
        System.out.println("Ingrese ingrese su Numero:");
        String numero = leer.nextLine();
        System.out.println("Su numero es : " + numero);
        
        System.out.println("Ingrese ingrese su Correo:");
        String correo = leer.nextLine();
        System.out.println("Su correo es: " + correo);
        
        System.out.println("Ingrese ingrese su Fecha de Nacimiento:");
        String fecha = leer.nextLine();
        System.out.println("Su Fecha de Nacimiento es : " + fecha);
        
        System.out.println("Ingrese ingrese su Edad:");
        String edad = leer.nextLine();
        System.out.println("Su edad: " + edad);
    }
}