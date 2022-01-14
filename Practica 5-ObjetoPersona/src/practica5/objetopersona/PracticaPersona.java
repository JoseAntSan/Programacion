/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.objetopersona;

import java.util.Scanner;

/**
 *
 * @author deber
 */
public class PracticaPersona {
    Scanner leer = new Scanner(System.in);
    
    private int idPersona;
    private String nombrePersona;
    private String apellidoPersona;
    private String cedulaPersona;
    private int edadPersona;
    
    public void ingresarDatos(){
        System.out.println("Ingrese su id:");
        int idPersona = leer.nextInt();
        System.out.println("Ingrese  su nombre:");           
        String nombrePersona = leer.nextLine();
        System.out.println("Ingrese su apellido:");
        String apellidoPersona = leer.nextLine();
        System.out.println("Ingrese su cedula:");
        String cedulaPersona = leer.nextLine();
        System.out.println("Ingrese su edad:");
        int edadPersona = leer.nextInt();
        }
    
        public void mostrarId(){
        System.out.println("Su id es:" + idPersona);
        }

        public void mostrarNombre(){
        System.out.println("Su nombre es:" + nombrePersona);
        }
        
        public void mostrarApellido(){  
        System.out.println("Su apellido es:" + apellidoPersona);
        }
        
        public void mostrarCedula(){
        System.out.println("Su cedula es:" + cedulaPersona);
        }
        
        public void mostrarEdad(){
        System.out.println("Su edad es:" + edadPersona);
        }  
}