/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uelac.com.controlador;

import java.util.ArrayList;
import java.util.List;
import uelac.com.modelo.PersonaModelo;
/**
 *
 * @author deber
 */
public class PersonaControlador { 

    private List<PersonaModelo> listaPersona;

    public PersonaControlador() {
        listaPersona = new ArrayList();
    }
     public void crear(PersonaModelo pm){
        listaPersona.add(pm);
    } 
}
