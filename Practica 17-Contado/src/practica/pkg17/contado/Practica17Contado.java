/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg17.contado;

import java.util.*;

/**
 *
 * @author pc-10
 */
public class Practica17Contado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    int a=0;
    int num= leer.nextInt();
        for (int i = 0; i < 100; i++) {
        a=a+num;
        System.out.println(+a);
        }
    }
}