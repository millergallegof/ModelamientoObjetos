package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class in which there is a menu to make the interaction with the user
 * more optimal, according to this menu the user can perform different actions
 * with the objects created by the program.
 *
 * @version 1.01.00 2022-02-17
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since Available from version 1
 *
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        /* Initialization of required variables */
        Integer op1;
        Integer op2;
        Integer cantidadNumeros;

        /* identification of objects required by the program */
        ArrayList<Double> listaOrdenada = new ArrayList<Double>();
        ListaNumeros listanumeros = new ListaNumeros();
        Scanner scanner = new Scanner(System.in);

        /* Beginning of the user function menu */
        do {

            System.out.println("---------------------------------------");
            System.out.println("Menu Numeros Aleatorios");
            System.out.println("---------------------------------------");
            System.out.println("1. Crear Lista de numeros Aleatorios");
            System.out.println("2. Mostrar Lista de numeros Aleatorios");
            System.out.println("3. Ordenar Lista de Numeros aleatorios");
            System.out.println("4. Eliminar Lista de Numeros aleatorios");
            System.out.println("Precione 0 para salir del programa");
            op1 = scanner.nextInt();

            /* start of the program enclosed by a trycath */
            try {

                switch (op1) {
                    case 1:
                        System.out.println("---------------------------------------");
                        System.out.println("Creacion de numeros Aleatorios");
                        System.out.println("---------------------------------------");
                        System.out.println("Ingrese la cantidad de numeros que desea almacenar en al lista");
                        cantidadNumeros = scanner.nextInt();

                        /* use of the method to create random numbers */
                        listanumeros.agregarNumerosAletorios(cantidadNumeros);

                        System.out.println("Sus Numeros Fueron generados");
                        break;
                    case 2:
                        System.out.println("---------------------------------------");
                        System.out.println("Numeros Aleatorios");
                        System.out.println("---------------------------------------");

                        /* Use of the get method which obtains the array of numbers. */
                        System.out.println(listanumeros.getListaNumeros());

                        break;
                    case 3:
                        System.out.println("---------------------------------------");
                        System.out.println("Ordenar Numeros Aleatorios");
                        System.out.println("---------------------------------------");
                        System.out.println("1. Ordenar por algoritmo de burbuja");
                        System.out.println("2. Ordenar con quick Sort");
                        op2 = scanner.nextInt();
                        switch (op2) {
                            case 1:
                                System.out.println("Numeros Aletorios Ordenados");
                                System.out.println("---------------------------------------");

                                /* Use of the bubble sort algorithm method */
                                listanumeros.ordenarListaPorBurbuja();
                                System.out.println(listanumeros.getListaNumeros());
                                break;
                            case 2:
                                System.out.println("Numeros Aletorios Ordenados");
                                System.out.println("---------------------------------------");

                                /* use of the Quick Sort method of ordering */
                                listaOrdenada = listanumeros.ordenarListaPorQuickSort(listanumeros, 0, listanumeros.getListaNumeros().size());
                                listanumeros.setListaNumeros(listaOrdenada);
                                System.out.println(listanumeros.getListaNumeros());
                                break;
                            default:
                                System.out.println("Ingrese una opcion correcta");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("los elementos de la lista han sido eliminados");
                        
                        /* Method to remove elements from the object */
                        listanumeros.limpiarLista();
                        break;
                    default:
                        System.out.println("Ingrese una opcion correcta");
                        break;

                }
            } catch (Exception e) {
                e.getMessage();
            }

        } while (op1 != 0);

    }

}
