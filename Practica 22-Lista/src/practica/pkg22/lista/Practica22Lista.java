/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg22.lista;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author deber
 */
public class Practica22Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> ejemploLista = new ArrayList<String>();
        ejemploLista.add("Juan");
        ejemploLista.add("Pedro");
        ejemploLista.add("José");
        ejemploLista.add("María");
        ejemploLista.add("Sofía");
        for (int i = 0; i <= ejemploLista.size() - 1; i++) {
        System.out.println(ejemploLista.get(i));
        }
    }
}
