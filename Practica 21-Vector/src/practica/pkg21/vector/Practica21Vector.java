/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg21.vector;

/**
 *
 * @author deber
 */
public class Practica21Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    final int TAMANO = 26;
    char[] listaLetras = new char[TAMANO];
    char letra = 'A';
 
    //Asignación de letras a cada elemento del vector
    for(int i=0; i<TAMANO; i++) {
        listaLetras[i] = letra;
        letra++;
    }
 
    //Mostrar en pantalla el vector
    for(int i=0; i<TAMANO; i++) {
        System.out.print(listaLetras[i]+" ");
    }
    }
}
