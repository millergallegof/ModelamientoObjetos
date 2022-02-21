package ejercicio5;

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
public class Ejercicio5 {

    public static void main(String[] args) {

        /* Initialization of required variables */
        int op1, op2;
        int buscador;
        String tipoCarga, color, numMatricula;
        Double alturaCamion, cilindraje;
        Integer numPuertas, numMotores, tieneCapota, tieneCojineria;
        String tipoTransmision;
        Integer esScotter, esEnDuro, tieneCambios, esDeMontana, esArticulado;
        boolean booleanPrin, booleanDos, booleanTres;
        Iterator<Ferry> iterator;
        Iterator<Bicicleta> iteratorBic;
        Iterator<Camion> iteratorCam;
        Iterator<Coche> iteratorCoch;
        Iterator<Lancha> iteratorLan;
        Iterator<Moto> iteratorMot;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ferry> listaFerrys = new ArrayList<>();
        ArrayList<Bicicleta> listaBicicletas = new ArrayList<>();
        ArrayList<Camion> listaCamiones = new ArrayList<>();
        ArrayList<Coche> listaCoches = new ArrayList<>();
        ArrayList<Lancha> listaLanchas = new ArrayList<>();
        ArrayList<Moto> listaMotos = new ArrayList<>();
        Camion camion;
        Bicicleta bicicleta;
        Lancha lancha;
        Moto moto;
        Coche coche;
        Ferry ferry;
        /* start of the program enclosed by a trycath */
        try {

            /* Beginning of the user function menu */
            do {
                System.out.println("----------------------------------------");
                System.out.println("Almacenamiento de Vehiculos");
                System.out.println("----------------------------------------");
                System.out.println("1. Agregar Vehiculo al listado");
                System.out.println("2. Mostrar Listado de Vehiculos");
                System.out.println("Precione 0 para salir del programa");
                op1 = scanner.nextInt();

                switch (op1) {
                    case 1:
                        do {
                            System.out.println("----------------------------------------");
                            System.out.println("Agregar Vehiculos");
                            System.out.println("----------------------------------------");
                            System.out.println("1. Ferry");
                            System.out.println("2. Bicicleta");
                            System.out.println("3. Camion");
                            System.out.println("4. Coche");
                            System.out.println("5. Lancha");
                            System.out.println("6. Moto");
                            System.out.println("Ingrese 0 para dejar de agregar vehiculos");
                            op2 = scanner.nextInt();
                            switch (op2) {
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
                                    System.out.println("Cuenta con cambios (1-> SI 0-> NO)");
                                    tieneCambios = scanner.nextInt();
                                    if (tieneCambios == 1) {
                                        booleanPrin = true;
                                    } else {
                                        booleanPrin = false;
                                    }
                                    System.out.println("Es de Montaña (1-> SI 0-> NO)");
                                    esDeMontana = scanner.nextInt();
                                    if (esDeMontana == 1) {
                                        booleanDos = true;
                                    } else {
                                        booleanDos = false;
                                    }
                                    System.out.println("Ingrese numero de matricula del Vehiculo");
                                    numMatricula = scanner.next();
                                    /* Creates an object using the main data builder */
                                    bicicleta = new Bicicleta(booleanPrin, booleanDos, numMatricula);
                                    /* The created object is added to a list */
                                    listaBicicletas.add(bicicleta);
                                    break;
                                case 3:
                                    System.out.println("El Camion es Articulado (1-> SI 0-> NO)");
                                    esArticulado = scanner.nextInt();
                                    if (esArticulado == 1) {
                                        booleanPrin = true;
                                    } else {
                                        booleanPrin = false;
                                    }
                                    System.out.println("Indique la altura del camion");
                                    alturaCamion = scanner.nextDouble();
                                    System.out.println("Indique el tipo de carga del camion");
                                    tipoCarga = scanner.next();
                                    System.out.println("Ingrese numero de matricula del Vehiculo");
                                    numMatricula = scanner.next();
                                    /* Creates an object using the main data builder */
                                    camion = new Camion(booleanPrin, alturaCamion, tipoCarga, numMatricula);
                                    /* The created object is added to a list */
                                    listaCamiones.add(camion);
                                    break;
                                case 4:
                                    System.out.println("Ingrese Numero de puertas");
                                    numPuertas = scanner.nextInt();
                                    System.out.println("Ingrese tipo de transmision");
                                    tipoTransmision = scanner.next();
                                    System.out.println("Ingrese numero de matricula del Vehiculo");
                                    numMatricula = scanner.next();
                                    /* Creates an object using the main data builder */
                                    coche = new Coche(numPuertas, tipoTransmision, numMatricula);
                                    /* The created object is added to a list */
                                    listaCoches.add(coche);
                                    break;
                                case 5:
                                    System.out.println("La lancha cuenta con capota (1-> SI 0-> NO)");
                                    tieneCapota = scanner.nextInt();
                                    if (tieneCapota == 1) {
                                        booleanPrin = true;
                                    } else {
                                        booleanPrin = false;
                                    }
                                    System.out.println("La lancha tiene cojineria (1-> SI 0-> NO)");
                                    tieneCojineria = scanner.nextInt();
                                    if (tieneCojineria == 1) {
                                        booleanDos = true;
                                    } else {
                                        booleanDos = false;
                                    }
                                    System.out.println("indique cuantos motores tiene la lacnha");
                                    numMotores = scanner.nextInt();
                                    System.out.println("Ingrese numero de matricula del Vehiculo");
                                    numMatricula = scanner.next();
                                    /* Creates an object using the main data builder */
                                    lancha = new Lancha(booleanPrin, booleanDos, numMotores, numMatricula);
                                    /* The created object is added to a list */
                                    listaLanchas.add(lancha);
                                    break;
                                case 6:
                                    System.out.println("Indique tipo de transmision de la moto");
                                    tipoTransmision = scanner.next();
                                    //tipoTransmision = Boolean(tipoTransmision);
                                    System.out.println("Ingrese valor del cilindraje de la moto");
                                    cilindraje = scanner.nextDouble();
                                    System.out.println("Es una Scotter (1-> SI 0-> NO)");
                                    esScotter = scanner.nextInt();
                                    if (esScotter == 1) {
                                        booleanPrin = true;
                                    } else {
                                        booleanPrin = false;
                                    }
                                    System.out.println("Es en duro(1-> SI 0-> NO)");
                                    esEnDuro = scanner.nextInt();
                                    if (esEnDuro == 1) {
                                        booleanDos = true;
                                    } else {
                                        booleanDos = false;
                                    }
                                    System.out.println("Ingrese numero de matricula del Vehiculo");
                                    numMatricula = scanner.next();
                                    /* Creates an object using the main data builder */
                                    moto = new Moto(tipoTransmision, cilindraje, booleanPrin, booleanDos, numMatricula);
                                    /* The created object is added to a list */
                                    listaMotos.add(moto);
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion correcta");
                                    break;
                            }

                        } while (op2 != 0);
                        break;
                    case 2:
                        System.out.println("----------------------------------------");
                        System.out.println("Ingrese que listado desea observar: ");
                        System.out.println("----------------------------------------");
                        System.out.println("1. Ferry");
                        System.out.println("2. Bicicleta");
                        System.out.println("3. Camion");
                        System.out.println("4. Coche");
                        System.out.println("5. Lancha");
                        System.out.println("6. Moto");
                        buscador = scanner.nextInt();
                        switch (buscador) {
                            case 1:
                                iterator = listaFerrys.iterator();
                                while (iterator.hasNext()) {

                                    System.out.println(iterator.next().mostrarDatos());

                                }
                                break;
                            case 2:
                                iteratorBic = listaBicicletas.iterator();
                                while (iteratorBic.hasNext()) {

                                    System.out.println(iteratorBic.next().mostrarDatos());

                                }
                                break;
                            case 3:
                                iteratorCam = listaCamiones.iterator();
                                while (iteratorCam.hasNext()) {

                                    System.out.println(iteratorCam.next().mostrarDatos());

                                }
                                break;
                            case 4:
                                iteratorCoch = listaCoches.iterator();
                                while (iteratorCoch.hasNext()) {

                                    System.out.println(iteratorCoch.next().mostrarDatos());

                                }
                                break;
                            case 5:
                                iteratorLan = listaLanchas.iterator();
                                while (iteratorLan.hasNext()) {

                                    System.out.println(iteratorLan.next().mostrarDatos());

                                }
                                break;
                            case 6:
                                iteratorMot = listaMotos.iterator();
                                while (iteratorMot.hasNext()) {

                                    System.out.println(iteratorMot.next().mostrarDatos());

                                }
                                break;
                            default:
                                System.out.println("Ingrese una opcion correcta");

                        }

                    default:
                        System.out.println("Seleccione una opcion correcta");
                }

            } while (op1 != 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
