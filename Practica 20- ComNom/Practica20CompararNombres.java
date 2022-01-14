/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg20.compararnombres;

import java.util.*;

/**
 *
 * @author pc-10
 */
public class Practica20CompararNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    String nom1= leer.nextLine();
    String nom2= leer.nextLine();
    String nom3= leer.nextLine();
    if (nom1 == nom2 || nom2 != nom3) {
    System.out.println("Los nombres son iguales");
    }
    else{
    System.out.println("Los nombres son diferentes");
    }
    }
}