package com.mycompany.mavenproject1;
 import java.util.Scanner;

public class Mavenproject1{
//ejercicio 2
    public static void main(String[] args) {
        
        //se crean los atributos o variables
        double horastrabajadas; 
        double valorhora;
        double retencion;
        double salbruto;
        double salneto;
        
        Scanner leersal = new Scanner (System.in); //se crea el objeto scanner
        
        System.out.println("Ingrese horas trabajadas"); //se muestra lo que se le pide al usuario
        horastrabajadas = leersal.nextDouble();
        
        System.out.println("Ingrese valor hora"); //se muestra lo que se le pide al usuario
        valorhora = leersal.nextDouble();
        
        retencion = 0.125;
        salbruto =  valorhora * horastrabajadas;
        salneto = salbruto * (1-retencion);
        System.out.println("El salario bruto es " + salbruto);
         System.out.println("El salario neto es " + salneto);
        
    }
         
}
