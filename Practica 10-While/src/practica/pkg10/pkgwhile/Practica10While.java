/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg10.pkgwhile;

import java.util.*;

/**
 *
 * @author deber
 */
public class Practica10While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner (System.in);
    int i=1;
    int x;
        System.out.println("Hasta que número desea llegar?");
        x = leer.nextInt();
        System.out.println("---------");
        while (i<=x) { 
            System.out.println(i);
            i++;
        }           
            
        }
}
