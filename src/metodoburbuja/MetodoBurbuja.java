/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoburbuja;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisg
 */
public class MetodoBurbuja extends Thread {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    static int aux;
    static int cantidad;

    static int checador = 0;
    static boolean bandera = false;
    static int numeros[];
    
    static public int[] pedirNumeros(int numeros[],int cantidad) {

        numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("dame un numero:"));
        }

        return numeros;
    }

    static public int[] OrdenarMayorMenorConsola(int[] arr) {
        int contador = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                    aux = 0;
                    contador++;
                    //System.err.print(arr[j] + "<" + arr[j + 1]);
                    System.out.println(ANSI_GREEN + "proceso "+contador+":  " +arr[j] + "<" + arr[j + 1]);
                    for (int k = 0; k < arr.length; k++) {
                        System.out.print(ANSI_RESET + arr[k]);
                    }
                    System.out.println("");
                } else {
                    contador++;
                    System.out.print(ANSI_RED + "proceso "+contador+":  " +arr[j] + "<" + arr[j + 1]);
                    System.out.println("");
                    for (int k = 0; k < arr.length; k++) {
                        System.out.print(arr[k]);
                    }
                    System.out.println("");
                }
            }
        }
        return arr;
    }

    static public int[] OrdenarMenorMayorConsola(int arr[]) {
        int contador = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                    aux = 0;
                    contador++;
                    //System.err.print(arr[j] + "<" + arr[j + 1]);
                    System.out.println(ANSI_GREEN + "proceso "+contador+":  " +arr[j] + ">" + arr[j + 1]);
                    for (int k = 0; k < arr.length; k++) {
                        System.out.print(ANSI_RESET + arr[k]);
                    }

                    System.out.println("");
                } else {
                    contador++;
                    System.out.print(ANSI_RED + "proceso "+contador+":  " +arr[j] + ">" + arr[j + 1]);
                    System.out.println("");
                    for (int k = 0; k < arr.length; k++) {
                        System.out.print(arr[k]);
                    }
                    System.out.println("");
                }

                for (int k = 0; k < arr.length - 1; k++) {
                    if (arr[k + 1] > arr[k]) {

                    }
                }
            }
        }
        return arr;
    }

    static public void OrdenaMayorMenor(int arr[], JTable t) throws InterruptedException {
        int contador = 1;
        numeros= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numeros[i]=arr[i];
        }
        Object datos[] = new Object[arr.length + 1];
        DefaultTableModel modelo = (DefaultTableModel) t.getModel();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    contador++;
                    aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                    datos[0] = contador;
                    for (int k = 0; k < arr.length; k++) {
                        datos[k + 1] = numeros[k];
                    }
                    modelo.addRow(datos);
                }

            }

        }
    }

    static public void OrdenaMenorMayor(int arr[], JTable t) throws InterruptedException {
        int contador = 1;
        numeros = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numeros[i]=arr[i];
        }
        Object datos[] = new Object[arr.length+1];
        DefaultTableModel modelo = (DefaultTableModel) t.getModel();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    contador++;
                    aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                    datos[0]= contador;
                    
                    for (int k = 0; k < arr.length; k++) {
                        datos[k+1] = numeros[k];

                    }
                    modelo.addRow(datos);
                }

            }

        }
    }

    static public void desplegarDatos(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }

}
