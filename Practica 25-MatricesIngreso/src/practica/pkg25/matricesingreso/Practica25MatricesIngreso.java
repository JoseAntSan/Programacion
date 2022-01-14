/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg25.matricesingreso;

import java.util.Scanner;

/**
 *
 * @author deber
 */
public class Practica25MatricesIngreso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        final int FILAS= 5, COLUMNAS= 4;
        Scanner sc = new Scanner (System.in);
        int i,j;
        
        int [] [] A = new int [FILAS] [COLUMNAS];
        System.out.println("Lectura numero de elemtos de matriz: ");
        for ( i = 0; i < FILAS; i++) {
            for ( j = 0; j < COLUMNAS; j++) {
                System.out.println("A[ + i + ][ + j + ]-");
                A[i][j] =sc.nextInt();
                System.out.print (A[i][j]);
            }
            
        }
        
    }
    
}
