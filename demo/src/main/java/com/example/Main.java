package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
Scanner scanner = new Scanner(System.in);
System.out.println("Ingrese el valor de tu compra en COP");
double valorCompra = scanner.nextDouble();
int puntosAcomulados = (int) (valorCompra/10);
System.out.println("puntos acomulados: " + puntosAcomulados);
String nivelFidelizacion;
if (puntosAcomulados <= 100) 
{nivelFidelizacion = "Bronce";}
else if (puntosAcomulados <= 500) {
    nivelFidelizacion= "Plata";
} 
else if (puntosAcomulados <= 1000) {
    nivelFidelizacion= "Oro";
} else  {
    nivelFidelizacion = "Platino";
}
System.out.println("Nivel de fidelizacion: " + nivelFidelizacion);

if (nivelFidelizacion.equals("Bronce") ) {
    double descuento = valorCompra * 0.02;
    System.out.println("----Ganaste un descuento del 2% en esta compra--- ("+ descuento +"COP)");
}
if (nivelFidelizacion.equals("Plata") ) {
    double descuento = valorCompra *0.05;
    System.out.println("----Ganaste un descuento del 5% en esta compra----("+ descuento +"COP)");
}
if (nivelFidelizacion.equals("Oro") || nivelFidelizacion.equals ("platino")) {
    double descuento = valorCompra * 0.10;
    System.out.println("----Ganaste un descuento del 10% en esta compra----(" + descuento + "COP)");
}
if (nivelFidelizacion.equals ( "Platino")) {
    System.out.println(" ----Ganaste cuatro entradas gratis a cine----");
}   
scanner.close(); 
}



}