package com.company;
import java.util.Scanner;

/**
 * @Autor Jair Esteban Rincon Varela - jairesrival2@gmail.com
 */

public class Main {
    public static void main(String[] args) {
        //declaracion de variables agregadas a una libreria
        Scanner input= new Scanner(System.in);
        int npass[]= new int[10];
        String nmodel[]=new String[10];
        Boolean nbool[]=new Boolean[10];
        int nwheels[]= new int[10];
        String ndate[]= new String[10];
        String nscrolling[]=new String[10];

        System.out.println("""
                ///////// Bienvenidos al ferri /////////\s
                   Ingrese los datos de los 10 vehiculos
                 \s""");

        Vehicle mysvehicles[]=new Vehicle[10];
        //ciclo for se crea la inscripcion de los 10 vehiculos
        for(int i=0;i<10;i++) {
            System.out.println("Ingrese el modelo del vehiculo: ");
            nmodel[i] = input.next();
            System.out.println("Ingrese la cantidad de pasajeros: ");
            npass[i] = input.nextInt();
            System.out.println("estan presentes o ausentes los tripulantes? (y/n): ");
            char option2 = input.next().charAt(0);
            switch (option2) {
                case 'y' -> nbool[i] = true;
                case 'n' -> nbool[i] = false;
                default -> System.out.print("Ha introducido una opción incorrecta\n");
            }
            System.out.println("Ingrese el numero de ruedas: ");
            nwheels[i] = input.nextInt();
            System.out.println("Ingrese la fecha de la matricula: ");
            ndate[i] = input.next();
            System.out.println("Ingrese el medio de desplazamiento: ");
            nscrolling[i] = input.next();

            mysvehicles[i]= new Vehicle (nmodel[i],npass[i],nbool[i],nwheels[i],ndate[i],nscrolling[i]);
            //mysvehicles[0]= new Vehicle (nmodel[0],npass[0],nbool[0],nwheels[0],ndate[0],nscrolling[0]);

        }
        //muestra por lectura los 10 vehiculos registrados
        for(Vehicle vehicles:mysvehicles){
            System.out.println(vehicles.show());
            System.out.println("");
        }
    }
}
