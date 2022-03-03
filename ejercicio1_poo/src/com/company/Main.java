package com.company;
/**
 * Programa para calcular la fuerza gravitacional entre 2 objetos
 * @Autor Jair Rincon - jairesrival2@gmail.com
 */

import java.text.ParseException;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Main {
    /**
     * constructor programa principal
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        Scanner input= new Scanner(System.in);
        System.out.println("////CALCULAR FUERZA ATRACCION GRAVITATORIA////");
        System.out.print("Ingrese los datos del cuerpo1\n"+"ingrese el Nombre: ");
        String m1=input.next();

        System.out.print("Ingrese la masa:");
        double mass1= parseDouble(input.next());

        System.out.print("Ingrese la densidad:");
        double density1= parseDouble(input.next());

        System.out.print("Ingrese la diametro:");
        double diameter1= parseDouble(input.next());

        System.out.print("Ingrese la distancia hacia el sol:");
        double dtsun1= parseDouble(input.next());

        System.out.print("""
                \nIngrese los datos del cuerpo2
                ingrese el Nombre:\s""");
        String m2=input.next();

        System.out.print("Ingrese la masa:");
        double mass2= parseDouble(input.next());

        System.out.print("Ingrese la densidad:");
        double density2= parseDouble(input.next());

        System.out.print("Ingrese la diametro:");
        double diameter2= parseDouble(input.next());

        System.out.print("Ingrese la distancia hacia el sol:");
        double dtsun2= parseDouble(input.next());

        System.out.print("\nIngrese la distancia entre las 2 masas:");
        double radio= parseDouble(input.next());


        planetary_system planet1 = new planetary_system(m1,mass1,density1,diameter1,dtsun1);
        planetary_system planet2 = new planetary_system(m2,mass2,density2,diameter2,dtsun2);

        /**
         * formula para obtener la fuerza gravitacional
         */
        final double G= ((6.67)*(Math.pow(10,11)));

        double Gf = (((planet1.getMass() * planet2.getMass()) * G) / Math.pow(radio,2));

        System.out.print("La fuerza gravitatoria es: "+Gf);

    }
}
