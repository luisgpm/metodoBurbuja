/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoburbuja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author luisg
 */
public class Consola {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int op = 0;
        int cantidad;
        MetodoBurbuja burbuja = new MetodoBurbuja();

        do {
            System.out.println("*********************************");
            System.out.println("que desea hacer?");
            System.out.println("1.- Ordenar numeros de mayor a menor");
            System.out.println("2.- Ordenar numeros de menor a mayor");
            System.out.println("3.- Salir");
            op = Integer.parseInt(r.readLine());

            switch (op) {
                case 1:
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("dame la cantidad de numeros"));
                    int arr[] = new int[cantidad];
                    int numeros[] = burbuja.pedirNumeros(arr, cantidad);
                    burbuja.desplegarDatos(numeros);
                    int ordenados[] = new int[numeros.length];
                    ordenados = burbuja.OrdenarMayorMenorConsola(numeros);
                    break;
                case 2:
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("dame la cantidad de numeros"));
                    int arr2[] = new int[cantidad];
                    int numeros2[] = burbuja.pedirNumeros(arr2, cantidad);
                    burbuja.desplegarDatos(numeros2);
                    int ordenados2[] = new int[numeros2.length];
                    ordenados2 = burbuja.OrdenarMenorMayorConsola(numeros2);
                    break;
            }

        } while (op < 3);

    }

}
