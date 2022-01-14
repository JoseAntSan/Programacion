/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg16.diasswitchs;

import java.util.Scanner;

/**
 *
 * @author deber
 */
public class Practica16DiasSwitchs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    dias d = new dias ();
    }
        do{
            Scanner leer = new Scanner(System.in);
            System.out.println("Quiere Ingresar otro Dato?");
            int d =leer.nextInt();
            String e;
            switch (d) {
                case 1:
                    d.mostrarDatos ();
                break;
                case 2:
                    System.exit(d);
                    System.out.println("Precione e para salir");
                break;
                default;
            }
        } while (e.equals ("e"));
    
}