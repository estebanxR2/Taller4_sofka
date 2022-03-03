package com.company;

import javax.swing.*;
import java.util.Scanner;

/**
 * @Autor Jair Esteban - jairesrival2@gmail.com
 */
public class Main {
    /**
     * principal
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /**
         * limites, libreria y otras variables
         */
        int max = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros aleatorios"));
        int min = 1;
        int range = max - min + 1;
        //int[] arr = new int[];
        int aux;
        int[] nrand = new int[max];
        /* genera un numeros radom segun al gusto del usuario utilizando math.radom */
        for (int i = 0; i < max-1; i++) {
            nrand[i]= (int) (Math.random() * range + min);
            System.out.println("Numero aleatorio " + i + ": " + nrand[i]);
        }
        //metodo burbuja
        for(int i=0;i<(max-1);i++){
            for(int j = 0;j<(max-1); j++) {
                if(nrand[j]> nrand[j+1]){
                    aux = nrand[j];
                    nrand[j]=nrand[j+1];
                    nrand[j+1]= aux;
                }
            }
        }
        System.out.println("////////arreglo ascendente/////////");
        for(int i=0;i<max;i++){
            System.out.println("-"+nrand[i]);
        }
    }
}