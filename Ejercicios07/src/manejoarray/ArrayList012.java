/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList012 {

    public static void main(String[] args) {
        // creación de un ArrayList
        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.printf("%s\n", cadenaFinal);
    }

    public static ArrayList<String> obtenerDatos() {
        ArrayList<String> arreglo2 = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String pais;
        String opcion;

        while (bandera) {
            System.out.println("Ingrese pais: ");
            pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("Si desea salir del programa escriba (s)");
            opcion = entrada.nextLine();
            if (opcion.equals("s")) {
                bandera = false;
            }
        }
        return arreglo2;
    }

    public static String obtenerCadenaFinal(ArrayList<String> lista) {
        String cadenaFinal = "";
        for (int i = 0; i < lista.size(); i++) {
            cadenaFinal = String.format("%s%s\n", cadenaFinal, lista.get(i));
        }
        return cadenaFinal;
    }
}
