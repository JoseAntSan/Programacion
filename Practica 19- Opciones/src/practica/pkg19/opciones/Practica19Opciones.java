/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg19.opciones;

import java.util.*;

/**
 *
 * @author deber
 */
public class Practica19Opciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    Scanner l = new Scanner(System.in);

        int a;

        do {

            System.out.println("1.  Hola");
            System.out.println("2.  Como estas");
            System.out.println("3.  Como estuvo tu dia");
            System.out.println("4.  Jajajaja");
            System.out.println("5.  Si");
            System.out.println("6.  No");

            System.out.println(" ");
            System.out.println("Ingrese la opcion que desee ");
            a = l.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Hola");
                    break;

                case 2:
                    System.out.println("Como estas");
                    break;
                case 3:
                    System.out.println("Como estuvo tu dia");
                    break;
                case 4:
                    System.out.println("ajajaja");
                    break;
                case 5:
                    System.out.println("Si");
                    break;
                case 6:
                    System.out.println("No");
                    break;
                case 7:
                    System.exit(op);
                    break;
                default:;
            }
            System.out.println("Presione e para regresar a las Opciones");
            o = l.next();
        } while (o.equals("e"));
    }
}
