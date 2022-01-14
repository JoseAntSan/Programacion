/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg15.diassemana;

import java.util.*;

/**
 *
 * @author deber
 */
public class dias {
    Scanner leer = new Scanner(System.in);
    int edad =leer.nextInt();
    
    public void mostrarDatos(){
    if (edad==1) {
       System.out.println("Es Lunes");
    }
        else if (edad==2) {
           System.out.println("Es Martes");
        }
            else if (edad==3) {
                
                System.out.println("Es Miercoles");
            }  
                else if (edad==4) {
                    System.out.println("Es Jueves");
                }  
                    else if (edad==5) {
                       System.out.println("Es Viernes");
                    }  
                        else if (edad==6) {
                            System.out.println("Es Sabado");
                        }  
                            else if (edad==7) {
                                System.out.println("Es Domingo");
                            }  
                                else{
                                       System.out.println("No es ningun dia de la Semana");
                                    }
    }
}