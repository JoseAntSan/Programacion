/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2.operaciones.basicas;

/**
 *
 * @author deber
 */
public class Practica2OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Operaciones Basicas");
        System.out.println("-------------------");
        sumaOperacion();
        restaOperacion();
        multiplicacionOperacion();
        divicionOperacion();
        potenciaOperacion();
        raizOperacion();
        
    }
    public static void sumaOperacion () {
        System.out.println("Esta es mi suma:");
        int Num1 = 5;
        int Num2 = 5;
        int resp = Num1 + Num2;
        System.out.println(resp);
        System.out.println("El resultado de la suma es:" + resp);
        System.out.println("----------------------------------------");
    }
    
    public static void restaOperacion () {
        System.out.println("Esta es mi resta:");
        int Num1 = 5;
        int Num2 = 5;
        int resp = Num1 - Num2;
        System.out.println(resp);
        System.out.println("El resultado de la resta es:" + resp);
        System.out.println("----------------------------------------");
    }
    
    public static void multiplicacionOperacion () {
        System.out.println("Esta es mi multiplicación:");
        int Num1 = 5;
        int Num2 = 5;
        int resp = Num1 * Num2;
        System.out.println(resp);
        System.out.println("El resultado de la multiplicación es:" + resp);
        System.out.println("----------------------------------------");
    }
    
    public static void divicionOperacion () {
        System.out.println("Esta es mi divición:");
        int Num1 = 5;
        int Num2 = 5;
        int resp = Num1 / Num2;
        System.out.println(resp);
        System.out.println("El resultado de la divición es:" + resp);
        System.out.println("----------------------------------------");
    }
    
    public static void potenciaOperacion () {
        System.out.println("Esta es mi potencia:");
        int Num1 = 5;
        int Num2 = Num1;
        int resp = Num1 * Num2;
        System.out.println(resp);
        System.out.println("El resultado de la potencia es:" + resp);
        System.out.println("----------------------------------------");
    }
    
    public static void raizOperacion () {
        System.out.println("Esta es mi raiz:");
        int Num1 = 5;
        double resp;
        resp = Math.sqrt(Num1);
        System.out.println(resp);
        System.out.println("El resultado de la raiz es:" + resp);
        System.out.println("----------------------------------------");
    }
}
