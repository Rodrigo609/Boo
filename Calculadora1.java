/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.pkg1;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Asencio Santamaria
 */
public class Calculadora1 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); 
        double numero1 = 0;
        numero1 = primerNumero();
        double numero2 = 0;
        numero2 = segundoNumero();
        int opciones = 0;
        do{
        menu();
        System.out.println("Elija una opcion");
        opciones = teclado.nextInt();
        switch (opciones) {
            case 1:
                double suma;
                suma = suma(numero1, numero2);
                System.out.println("la suma es :" + suma);
                break;
            case 2:
                double resta;
                resta = resta(numero1, numero2);
                System.out.println("la resta es:" + resta);
                break;
            case 3:
                double multiplicacion;
                multiplicacion = multiplicacion(numero1, numero2);
                System.out.println("la multiplicacion es:" + multiplicacion);
                break;
            case 4:
                 double division;
        division = division(numero1, numero2);
        System.out.println("la division es:" + division);
        break;
            case 5:
               double resto;
        resto = resto(numero1, numero2);
        System.out.println("el  resto es:" + resto);
        break;
            default:
                throw new AssertionError();
        }

       
        }while(opciones >=1 && opciones <=5);
        
    }

    public static void menu() {
        System.out.println("1 suma");
        System.out.println("2 resta");
        System.out.println("3 multiplicar");
        System.out.println("4 division");
        System.out.println("5 resto de la division");
    }

    public static double primerNumero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el primer numero ");
        double numero1 = 0;
        numero1 = teclado.nextDouble();
        return numero1;

    }

    public static double segundoNumero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el segundo numero ");
        double numero2 = 0;
        numero2 = teclado.nextDouble();
        return numero2;
    }

    public static double suma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        return resultado;

    }

    public static double resta(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        return resultado;

    }

    public static double multiplicacion(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        return resultado;
    }

    public static double division(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        return resultado;
    }

    public static double resto(double numero1, double numero2) {
        double resultado = numero1 % numero2;
        return resultado;
    }
}
