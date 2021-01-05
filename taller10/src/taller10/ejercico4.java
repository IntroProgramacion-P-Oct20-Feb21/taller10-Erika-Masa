/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10;
import java.util.Scanner; 
/**
 *
 * @author Smart
 */
public class ejercico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada= new Scanner(System.in);
        double[][] datos = new double[2][2];
        double dato;
        String cadena = "";
        for (int fila = 0; fila < datos.length; fila++){
            for (int columna = 0; columna < datos[fila].length; columna++){
                System.out.println("Ingresar los valores: ");
                dato = entrada.nextDouble();
               
                datos[fila][columna] = dato;
                cadena = String.format("%s%.2f\n",
                        cadena,
                        datos[fila][columna]);
            }
        }
        System.out.printf("%s", cadena);
    }

}                 
                        
