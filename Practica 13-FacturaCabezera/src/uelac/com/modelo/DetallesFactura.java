/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uelac.com.modelo;

/**
 *
 * @author deber
 */
public class DetallesFactura { 
    private int numF;
    private String nombreC;
    private String direccion;
    private int cedula; 
    private int ruc;
    private int fecha;   
    private int total; 
    private int subTotal;

    public DetallesFactura() {
    }

    public int getNumF() {
        return numF;
    }

    public void setNumF(int numF) {
        this.numF = numF;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "DetallesFactura{" + "numF=" + numF + ", nombreC=" + nombreC + ", direccion=" + direccion + ", cedula=" + cedula + ", ruc=" + ruc + ", fecha=" + fecha + ", total=" + total + ", subTotal=" + subTotal + '}';
    }

}
