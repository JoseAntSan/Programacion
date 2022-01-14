/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg11.pkgswitch;

import java.util.Scanner;

/**
 *
 * @author deber
 */
public class Practica11Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    int num;
    System.out.println("Ingrese cualquier numero entre 1 al 9:");           
    int num = leer.nextInt();
    
    switch (num) {
        case 1:{
            System.out.println("Su número es el 1");
            break;
            }
        case 2:{
            System.out.println("Su número es el 2");
            break;
            }
        case 3:{
            System.out.println("Su número es el 3");
            break;
            }
        case 4:{
            System.out.println("Su número es el 4");
            break;
            }
        case 5:{
            System.out.println("Su número es el 5");
            break;
            }
        case 6:{
            System.out.println("Su número es el 6");
            break;
            }
        case 7:{
            System.out.println("Su número es el 7");
            break;
            }
        case 8:{
            System.out.println("Su número es el 8");
            break;
            }
        case 9:{
            System.out.println("Su número es el 9");
            break;
            }
        default:{
            System.out.println("Esta opcion no se encuentra entre los numerios 1-9");
            break;
            }
    }
}
}