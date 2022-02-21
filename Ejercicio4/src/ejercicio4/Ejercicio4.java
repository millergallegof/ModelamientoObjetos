package ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Main class which presents a menu where the user can interact directly for the
 * creation of objects and the different actions that can be performed.
 *
 *
 *
 * @version 1.001.00
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since Available from version 1.
 *
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        /* Initialization of required variables */
        int op1, op2, contador;
        String buscador;
        boolean encontro;
        String tipoCarga, color, numMatricula;
        String marca, modelo, fechaMatricula, medioDeDesplazamiento, tipoDeFrenos;
        boolean existeRuedas, precensiaTripulacion;
        Integer numPasajeros;
        Double velocidadMax, valorAceleracion;
        Iterator<Ferry> iterator;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ferry> listaFerrys = new ArrayList<Ferry>();
        Ferry encontrado;
        Ferry ferry;
        /* start of the program enclosed by a trycath */
        try {

            /* Beginning of the user function menu */
            do {
                System.out.println("----------------------------------------");
                System.out.println("Almacenamiento de Ferrys");
                System.out.println("----------------------------------------");
                System.out.println("1. Agregar Ferry al listado");
                System.out.println("2. Agregar Caracteristicas al Ferry");
                System.out.println("3. Mostrar Listado de Ferrys");
                System.out.println("4. Mostrar Datos especificos de un Ferry");
                System.out.println("5. Mover el Ferrary");
                System.out.println("Precione 0 para salir del programa");
                op1 = scanner.nextInt();

                switch (op1) {
                    case 1:
                        System.out.println("Ingrese tipo de carga del Ferry");
                        tipoCarga = scanner.next();
                        System.out.println("Ingrese color del Ferry");
                        color = scanner.next();
                        System.out.println("Ingrese numero de matricula del Ferry");
                        numMatricula = scanner.next();
                        /* Creates an object using the main data builder */
                        ferry = new Ferry(tipoCarga, color, numMatricula);
                        /* The created object is added to a list */
                        listaFerrys.add(ferry);
                        break;
                    case 2:
                        System.out.println("Ingrese numero de Matricula del ferry: ");
                        buscador = scanner.next();
                        contador = 0;
                        encontro = false;
                        encontrado = new Ferry(buscador);
                        /* iterates the array to find the object which is specified by the user */
                        for (Ferry listaFerry : listaFerrys) {
                            contador += 1;
                            if (listaFerry.getNumMatricula() == buscador) {
                                encontro = true;
                                encontrado = listaFerry;
                                break;
                            }
                        }
                        if (encontro == true) {
                            System.out.println("Ingrese marca del Ferry");
                            marca = scanner.next();
                            System.out.println("Ingrese modelo del Ferry");
                            modelo = scanner.next();
                            System.out.println("Ingrese numero de pasajeros actual del Ferry");
                            numPasajeros = scanner.nextInt();
                            System.out.println("Ingrese fecha de matricula del Ferry");
                            fechaMatricula = scanner.next();
                            System.out.println("Ingrese medio por el que se desplaza del Ferry");
                            medioDeDesplazamiento = scanner.next();
                            System.out.println("Ingrese tipo de frenos del Ferry");
                            tipoDeFrenos = scanner.next();
                            System.out.println("Existen ruedas en el Vehiculo (1.Si) (0. No)");
                            existeRuedas = scanner.nextBoolean();
                            System.out.println("Es necesario tener tripulacion Vehiculo (1.Si) (0. No)");
                            precensiaTripulacion = scanner.nextBoolean();
                            System.out.println("Ingrese velocidad maxima del Ferry");
                            velocidadMax = scanner.nextDouble();
                            System.out.println("Cual es la aceleracion media del Ferry");
                            valorAceleracion = scanner.nextDouble();

                            /* A new ferry object is created to replace the elements of the previous object. */
                            tipoCarga = encontrado.getTipoCarga();
                            color = encontrado.getColor();
                            numMatricula = encontrado.getNumMatricula();

                            ferry = new Ferry(tipoCarga, color, marca, modelo, numPasajeros, precensiaTripulacion, existeRuedas,
                                    fechaMatricula, medioDeDesplazamiento, tipoDeFrenos, velocidadMax, numMatricula, valorAceleracion);
                            
                            /* the set method is used to replace the object in the array */
                            listaFerrys.set(contador - 1, ferry);
                            break;
                        } else {
                            System.out.println("El ferry no se encontro");
                            break;
                        }

                    case 3:
                        iterator = listaFerrys.iterator();
                        while (iterator.hasNext()) {

                            System.out.println(iterator.next().mostrarDatos());

                        }
                        break;
                    case 4:
                        contador = 0;
                        iterator = listaFerrys.iterator();
                        encontro = false;
                        
                        System.out.println("ingrese el numero de matricula del ferry que desea ver informacion");
                        buscador = scanner.next();
                        encontrado = new Ferry(buscador);
                        /* iterates the array to find the object which is specified by the user */
                        while (iterator.hasNext()) {
                            contador += 1;
                            if (iterator.next().getNumMatricula() == buscador) {
                                encontro = true;
                                encontrado = iterator.next();
                                break;
                            }
                        }
                        System.out.println("--------------------------------");
                        System.out.println(encontrado.toString());
                        System.out.println("--------------------------------");
                        break;
                    case 5:
                                                contador = 0;
                        iterator = listaFerrys.iterator();
                        encontro = false;

                        System.out.println("ingrese el numero de matricula del ferry que desea ver informacion");
                        buscador = scanner.next();
                        encontrado = new Ferry(buscador);
                        /* iterates the array to find the object which is specified by the user */
                        while (iterator.hasNext()) {
                            contador += 1;
                            if (iterator.next().getNumMatricula() == buscador) {
                                encontro = true;
                                encontrado = iterator.next();
                                break;
                            }
                        }
                        do {

                            System.out.println("--------------------------------");
                            System.out.println("Mover Ferry de lugar");
                            System.out.println("--------------------------------");
                            System.out.println("1. Acelerar ferry");
                            System.out.println("2. Mover a la derecha");
                            System.out.println("3. Mover a la izquierda");
                            System.out.println("4. Mover abajo");
                            System.out.println("5. Mover arriba");
                            System.out.println("6. cacular distancia");
                            System.out.println("Precione 0 para salir del programa");
                            op2 = scanner.nextInt();
                            /* The different methods of the object are used to allow the user to interact with the object. */
                            try {

                                switch (op2) {
                                    case 1:
                                        encontrado.acelerar();
                                        break;
                                    case 2:
                                        encontrado.moverDerecha();
                                        break;
                                    case 3:
                                        encontrado.moverIzquierda();
                                        break;
                                    case 4:
                                        encontrado.moverAbajo();
                                        break;
                                    case 5:
                                        encontrado.moverArriba();
                                        break;
                                    case 6:
                                        System.out.println("-----------------------------------------------------------------");
                                        System.out.println("la distancia recorrida es: " + encontrado.calcularDistancia());
                                        System.out.println("-----------------------------------------------------------------");
                                        break;
                                    default:
                                        System.out.println("Seleccione una opcion correcta");
                                        break;

                                }
                            } catch (Exception e) {
                                System.out.println("-------------------------------------------------------------");
                                System.out.println("                             ALERT");
                                System.out.println("-------------------------------------------------------------");
                                System.out.println("                           " + e.getMessage());

                                break;
                            }
                        } while (op2 != 0);
                        break;
                    default:
                        System.out.println("Seleccione una opcion correcta");
                }

            } while (op1 != 0);
        } catch (Exception e) {
            e.getMessage();
        }

    }

}
