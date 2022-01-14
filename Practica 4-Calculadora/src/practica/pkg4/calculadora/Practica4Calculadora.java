/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg4.calculadora;

import java.util.Scanner;

/**
 *
 * @author deber
 */
public class Practica4Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Calculadora");
        System.out.println("-------------------");
        sumaOperacion();
        restaOperacion();
        multiplicacionOperacion();
        divicionOperacion();
        potenciaOperacion();
        raizOperacion();
        
    }
    public static void sumaOperacion () {
        System.out.println("Suma:");
        System.out.println("Ingrese los numeros a sumar:");
        Scanner leer = new Scanner(System.in);
        int Num1 = leer.nextInt();
        int Num2 = leer.nextInt();
        int resp = Num1 + Num2;
        System.out.println("El resultado de la suma es:" + resp);
        System.out.println("----------------------------------------");
    }
    public static void restaOperacion () {
        System.out.println("Resta:");
        System.out.println("Ingrese los numeros a restar:");
        Scanner leer = new Scanner(System.in);
        int Num1 = leer.nextInt();
        int Num2 = leer.nextInt();
        int resp = Num1 - Num2;
        System.out.println("El resultado de la resta es:" + resp);
        System.out.println("----------------------------------------");
    }
    
    public static void multiplicacionOperacion () {
        System.out.println("Multiplicacion:");
        System.out.println("Ingrese los numeros a multiplicar:");
        Scanner leer = new Scanner(System.in);
        int Num1 = leer.nextInt();
        int Num2 = leer.nextInt();
        int resp = Num1 * Num2;
        System.out.println("El resultado de la multiplicacion es:" + resp);
        System.out.println("----------------------------------------");
    }
    
    public static void divicionOperacion () {
        System.out.println("Divicion:");
        System.out.println("Ingrese los numeros a dividir:");
        Scanner leer = new Scanner(System.in);
        int Num1 = leer.nextInt();
        int Num2 = leer.nextInt();
        int resp = Num1 / Num2;
        System.out.println("El resultado de la divicion es:" + resp);
        System.out.println("----------------------------------------");
    }
    
    public static void potenciaOperacion () {
        System.out.println("Potencia:");
        System.out.println("Ingrese el numero a potenciar:");
        Scanner leer = new Scanner(System.in);
        int Num1 = leer.nextInt();
        int resp = Num1 * Num1;
        System.out.println("El resultado de la potencia es:" + resp);
        System.out.println("----------------------------------------");
    }
    
    public static void raizOperacion () {
        System.out.println("Raiz:");
        System.out.println("Ingrese los numeros a raizar:");
        Scanner leer = new Scanner(System.in);
        int Num1 = leer.nextInt();
        double resp = Math.sqrt(Num1);
        System.out.println("El resultado de la raiz es:" + resp);
                
        System.out.println("----------------------------------------");
    }
    
}
