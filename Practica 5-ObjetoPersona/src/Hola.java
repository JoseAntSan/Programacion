
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deber
 */
public class Hola {
    Scanner leer = new Scanner(System.in);
    
    private int id;
    private String nombre;
    private String apellido;
    private String cedula;

public void ingresoDatos() {
    System.out.println("Ingrese su id:");
        int id = leer.nextInt();
    System.out.println("Ingrese su nombre:");           
        String nombre = leer.nextLine();
    System.out.println("Ingrese su cedula:");
        String cedula = leer.nextLine();
    
}

public void buscarCedula(String cedula) {
}

public void buscarCedula(int cedula) {
}

}