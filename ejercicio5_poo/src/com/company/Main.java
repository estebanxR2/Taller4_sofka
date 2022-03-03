package com.company;
/**
 * @Autor Jair Esteban Rincon Varela - jairesrival2@gmail.com
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //declaracion de variables agregadas a una libreria
        Scanner input= new Scanner(System.in);
        int npass[]= new int[5];
        String nmodel[]=new String[5];
        Boolean nbool[]=new Boolean[5];
        int nwheels[]= new int[5];
        String ndate[]= new String[5];
        String nscrolling[]=new String[5];

        System.out.println("""
                ///////// Bienvenidos al ferri /////////\s
                   Ingrese los datos de los 5 vehiculos diferentes
                 \s""");

        Vehicle mysvehicles[]=new Vehicle[5];
        //ciclo for se crea la inscripcion de los 5 vehiculos distintos
        for(int i=0;i<5;i++) {
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
        }
        //creacion de vehiculos 1 carro, 1 moto , 1 bicicleta, 1 camion, 1 bote todos con la extgension de la clase vehiculo
            mysvehicles[0]= new Car(nmodel[0],npass[0],nbool[0],nwheels[0],ndate[0],nscrolling[0]);
            mysvehicles[1]= new Motorcycle (nmodel[1],npass[1],nbool[1],nwheels[1],ndate[1],nscrolling[1]);
            mysvehicles[2]= new Bicycle (nmodel[2],npass[2],nbool[2],nwheels[2],ndate[2],nscrolling[2]);
            mysvehicles[3]= new Truck (nmodel[3],npass[3],nbool[3],nwheels[3],ndate[3],nscrolling[3]);
            mysvehicles[4]= new Boat (nmodel[4],npass[4],nbool[4],nwheels[4],ndate[4],nscrolling[4]);
            //mysvehicles[0]= new Vehicle (nmodel[0],npass[0],nbool[0],nwheels[0],ndate[0],nscrolling[0]);


        //muestra por lectura los 10 vehiculos registrados
        for(Vehicle vehicles:mysvehicles){
            System.out.println(vehicles.show());
            System.out.println("");
        }

    }
}
