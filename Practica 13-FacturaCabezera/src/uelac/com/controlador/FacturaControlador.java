/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uelac.com.controlador;

import java.util.ArrayList;
import java.util.List;
import uelac.com.modelo.DetallesFactura;

/**
 *
 * @author deber
 */
public class FacturaControlador {
    private List<DetallesFactura> listaPersona;

    public FacturaControlador() {
        listaPersona = new ArrayList();
    }
     public void crear(DetallesFactura df){
        listaPersona.add(df);
    }
}
