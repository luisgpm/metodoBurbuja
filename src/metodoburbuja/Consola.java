/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodoburbuja;

import javax.swing.JOptionPane;

/**
 *
 * @author luisg
 */
public class Consola {
    
    
    public static void main(String[] args) {
        int cantidad ;
        MetodoBurbuja burbuja = new MetodoBurbuja();
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("dame la cantidad de numeros"));
        int arr[] = new int[cantidad];
        int numeros[]= burbuja.pedirNumeros( arr, cantidad);
        burbuja.desplegarDatos(numeros);
        
        
        int ordenados [] = new int[numeros.length];
        ordenados = burbuja.OrdenarMayorMenorConsola(numeros);
        
        
        
        
    }
    
}
