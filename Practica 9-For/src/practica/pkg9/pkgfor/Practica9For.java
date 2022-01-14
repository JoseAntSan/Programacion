/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg9.pkgfor;

import java.util.*;

/**
 *
 * @author deber
 */
public class Practica9For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de numeros a clasificar:");
    int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        if(num%2 == 0){
            System.out.println("Su número es par");
        }else
            System.out.println("Su número es impar");
        }
        }     
}