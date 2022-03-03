package com.company;
/**
 *@Autor Jair Esteban Rincon Varela - jairesrival2@gmail.com
 */
import javax.swing.JOptionPane;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        int n = 100;
        int nnumber = 0;
        //creacion del vector
        Vector<Integer> v = new Vector<Integer>(n);

        //ciclo for permitira pedirle al usuario ingresar hasta 100 numeros
        for (int i = 0; i <= n; i++){
            try {
                nnumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null , e, "error", 1);
            }
            //ciclo if si se ingresa 2 veces el mismo numero para la secuencia sino seguira agregando otro numero al vector
            if(v.size() != 0) {
                try {
                    if (nnumber == v.get(i-1)) {
                        JOptionPane.showMessageDialog(null, """
                                Error!
                                Se ha ingresado 2 veces seguidas el mismo numero por lo tanto
                                se mostrara en pantalla lo que ingreso:\s""");
                        break;
                    }else {
                        v.add(nnumber);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null , e, "error", 1);
                }
            } else {
                v.add(nnumber);
            }
        }
        //ciclo for que se encarga de mostrar todos los valores que se ingreso anteriormente al vector
        for (int i = 0; i < v.size(); i++) {
            JOptionPane.showMessageDialog(null,v.get(i) + " ");
        }

    }
}
