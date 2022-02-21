package ejercicio6;

import java.util.Scanner;
import java.util.Vector;

/**
 * Main class in which there is a program that creates a vector and adds numbers
 * in it until a repeated number is detected.
 *
 *
 *
 * @version 1.001.00
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since Available from version 1.
 *
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        
        /* Variable initialization */
        double dato;
        boolean encontrado = true;
        Vector vector = new Vector();
        Scanner scanner = new Scanner(System.in);
        
        /* the exceptions that can occur in the program are captured */
        try {
            do {
                System.out.println("ingrese valor");
                dato = scanner.nextDouble();
                
                /* The vector is iterated to search for repeated elements. */
                for (int i = 0; i < vector.size(); i++) {
                    //System.out.println(vector.elementAt(i));
                    if (dato == (double) vector.elementAt(i)) {
                        System.out.println("Ingreso un dato repetido");
                        System.out.println("---------------------------------------------");
                        System.out.println("Su vector es el siguiente:");
                        System.out.println("---------------------------------------------");
                        for (int j = 0; j < vector.size(); j++) {
                            System.out.println(vector.elementAt(j));
                        }
                        encontrado = false;
                        break;
                    }
                }
                vector.addElement(dato);
            } while (encontrado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
