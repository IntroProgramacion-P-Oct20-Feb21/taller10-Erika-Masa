/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Smart
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        
        String cadenaFinal = "";

        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columna = 0; columna < 2; columna++) {
                if(estudiantes[fila][columna].length() ==11);{
                    cadenaFinal= String.format("%s%s\n", cadenaFinal,
                            estudiantes[fila][columna]);

                }

            }
        }
        System.out.printf("%s", cadenaFinal);

    }
}

