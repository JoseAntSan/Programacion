/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg26matrizimprimir;

/**
 *
 * @author deber
 */
public class Practica26MatrizImprimir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][] = new int[3][3];		
        matriz[0][0] = 3;
        matriz[0][1] = 0;
        matriz[0][2] = 0;
        matriz[1][0] = 0;
        matriz[1][1] = 3;
        matriz[1][2] = 0;
        matriz[2][0] = 0;
        matriz[2][1] = 0;
        matriz[2][2] = 3;
        for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
              System.out.print (matriz[x][y]);
              if (y!=matriz[x].length-1) System.out.print("\t");
            }
        System.out.println("|");
        }
    }
    
}
