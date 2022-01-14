/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg6.objetocarro;

import java.util.Scanner;

/**
 *
 * @author deber
 */
    public class Carro {
    Scanner leer = new Scanner(System.in);
    
    private int placaCarro;
    private String colorCarro;
    private String modeloCarro;
    private int añoCarro;
    private int numChasisCarros;
    
    
    public void ingresarDatos(){
        System.out.println("Ingrese la placa del carro:");
        int placaCarro = leer.nextInt();
        System.out.println("Ingrese el color del carro:");           
        String colorCarro = leer.nextLine();
        System.out.println("Ingrese el modelo del carro:");
        String modeloCarro = leer.nextLine();
        System.out.println("Ingrese el año del carro:");
        int añoCarro = leer.nextInt();
        System.out.println("Ingrese el npumero del chasis del carro:");
        int numChasisCarros = leer.nextInt();
        }
    
        public void mostrarplacaCarro(){
        System.out.println("Su placa es:" + placaCarro);
        }

        public void mostrarcolorCarro(){
        System.out.println("Su color del carro es:" + colorCarro);
        }   
        
        public void mostrarmodeloCarro(){  
        System.out.println("Su modelo del carro es:" + modeloCarro);
        }
        
        public void mostrarañoCarro(){
        System.out.println("Su año del carro es:" + añoCarro);
        }
        
        public void mostrarnumchasisCarros(){
        System.out.println("Su número del chasis es:" + numChasisCarros);
        }  
}
