/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg30.leccionmatriz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author deber
 */
public class Practica30LeccionMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int f;
        int c;
        int n;
        System.out.println("SUMA DE MATRICES");
        System.out.println("Cuantas filas va a tener su Matriz ?");
        f=leer.nextInt();
        System.out.println("Cuantas columnas va a tener su Matriz ?");
        c=leer.nextInt();
        int filas=f;
        int columnas=c;
        int matrizA[][]=new int[filas][columnas];
        int matrizB[][]=new int[filas][columnas];
        int matrizRes1[][]=new int[filas][columnas];
        int matrizRes2[][]=new int[filas][columnas];
        int matrizRes3[][]=new int[filas][columnas];
        
        System.out.println("Datos de la Matriz A:");
        for(int i=0;i<filas;i++){
                for(int j=0;j<columnas;j++){
                        System.out.print("Ingrese un valor para la posicion A["+i+"]["+j+"]: ");
			matrizA[i][j]=leer.nextInt();
                        System.out.print(matrizA[i][j]+" ");
                }
                System.out.println();
            }
            for (int i=0; i < matrizA.length; i++) {
            System.out.print("|");
            for (int j=0; j < matrizA[i].length; j++) {
              System.out.print (matrizA[i][j]);
              if (j!=matrizA[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
            }
        
        System.out.println("Datos de la Matriz B:");
        for(int i=0;i<filas;i++){
                for(int j=0;j<columnas;j++){
                        System.out.print("Ingrese un valor para la posicion A["+i+"]["+j+"]: ");
			matrizB[i][j]=leer.nextInt();
                        System.out.print(matrizB[i][j]+" ");
                }
                System.out.println();
            }
            for (int i=0; i < matrizB.length; i++) {    
            System.out.print("|");
            for (int j=0; j < matrizB[i].length; j++) {
              System.out.print (matrizB[i][j]);
              if (j!=matrizB[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
            }
        
        System.out.println("Suma de las dos matrices:");
        for(int i=0;i<filas;i++){
            System.out.print("|");
                for(int j=0;j<columnas;j++){
                        matrizRes1[i][j]=matrizA[i][j]+matrizB[i][j];                            
                        System.out.print(matrizRes1[i][j]+" ");
                }
                System.out.println("|");
        }
        System.out.println("----------------------------------------------------");
        
        System.out.println("Transformar a Matriz Inversa");
        
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        do { //lectura de las filas
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
            if (filas < 2) {
                System.out.println("Valor no válido");
            }
        } while (filas < 2);
        int[][] A = new int[filas][];

        for (int i = 0; i < A.length; i++) {
            do {
                System.out.print("Número de columnas para la fila " + i + ": ");                                  
                columnas = sc.nextInt();
                if (columnas < 1) {
                    System.out.println("Valor no válido");
                }
            } while (columnas < 1);
            A[i] = new int[columnas];
        }
                           
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
               A[i][j] = rnd.nextInt(5) + 1;
            }
        }

        System.out.println("La matriz Iversa es:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}