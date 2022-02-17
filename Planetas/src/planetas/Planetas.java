package planetas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class in which the main program is executed, where a menu is created which
 * allows the user to calculate gravitational force between celestial bodies or
 * directly with the sun.
 *
 * @version 1.01.00 2022-02-17
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since Available from version 1
 *
 */
public class Planetas {

    public static void main(String[] args) {

        /* Initialization of required variables */
        int op = 0;
        int planeta1 = 0;
        int planeta2 = 0;
        int planeta3 = 0;
        Double fuerzaG;
        ArrayList<Planeta> listadoPlanetas = new ArrayList<Planeta>();
        Scanner scanner = new Scanner(System.in);

        /* Creation of objects which correspond to the different planets used. */
        Planeta tierra = new Planeta("tierra", 5.972 * Math.pow(10, 24),
                5.51, 12742.0, 1.49 * Math.pow(10, 8));
        listadoPlanetas.add(tierra);
        Planeta mercurio = new Planeta("mercurio", 3.285 * Math.pow(10, 23),
                5.43, 4789.4, 67.267 * Math.pow(10, 6));
        listadoPlanetas.add(mercurio);
        Planeta venus = new Planeta("venus", 4.867 * Math.pow(10, 24),
                5.24, 12104.0, 107.66 * Math.pow(10, 6));
        listadoPlanetas.add(venus);
        Planeta marte = new Planeta("marte", 6.39 * Math.pow(10, 23),
                3.93, 6779.0, 221.89 * Math.pow(10, 6));
        listadoPlanetas.add(marte);
        Planeta jupiter = new Planeta("jupiter", 1.898 * Math.pow(10, 27),
                1.33, 139820.0, 745.79 * Math.pow(10, 6));
        listadoPlanetas.add(jupiter);
        Planeta urano = new Planeta("urano", 8.681 * Math.pow(10, 25),
                1.27, 50724.0, 2.9488 * Math.pow(10, 9));
        listadoPlanetas.add(urano);

        /* Beginning of the user function menu */
        do {

            System.out.println("Menu Calculo de Fuerza Gravitacional Planetas");
            System.out.println("1. Calcular Fuerza Gravitacional entre planetas");
            System.out.println("2. Calcular Fuerza Gravitacional con el sol");
            System.out.println("Precione 0 para salir del programa");
            op = scanner.nextInt();
            
            /* start of the program enclosed by a trycath */
            try {
                switch (op) {
                    case 1:
                        fuerzaG = 0.0;
                        System.out.println("------------------------------------------------");
                        System.out.println("Seleccione el planeta numero 1");
                        System.out.println("------------------------------------------------");
                        System.out.println("Nombre Planeta");
                        System.out.println(" 1 " + tierra.getNombrePlaneta());
                        System.out.println(" 2 " + mercurio.getNombrePlaneta());
                        System.out.println(" 3 " + venus.getNombrePlaneta());
                        System.out.println(" 4 " + marte.getNombrePlaneta());
                        System.out.println(" 5 " + jupiter.getNombrePlaneta());
                        System.out.println(" 6 " + urano.getNombrePlaneta());

                        planeta1 = scanner.nextInt() - 1;
                        System.out.println("------------------------------------------------");
                        System.out.println("Seleccione el planeta numero 2");
                        System.out.println("------------------------------------------------");
                        planeta2 = scanner.nextInt() - 1;
                        
                        /* Use of the different methods of the Planet class to obtain the results. */
                        fuerzaG = listadoPlanetas.get(planeta1).atraccionGravitatoriaPlanetas(listadoPlanetas.get(planeta2));
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("La fuerza Gravitacional entre " + listadoPlanetas.get(planeta1).getNombrePlaneta()
                                + " y " + listadoPlanetas.get(planeta2).getNombrePlaneta() + " es de: " + fuerzaG + " [N]");
                        System.out.println("-------------------------------------------------------------------------------------");
                        break;
                    case 2:
                        fuerzaG = 0.0;
                        System.out.println("------------------------------------------------");
                        System.out.println("Seleccione el planeta");
                        System.out.println("------------------------------------------------");
                        System.out.println("Nombre Planeta");
                        System.out.println(" 1 " + tierra.getNombrePlaneta());
                        System.out.println(" 2 " + mercurio.getNombrePlaneta());
                        System.out.println(" 3 " + venus.getNombrePlaneta());
                        System.out.println(" 4 " + marte.getNombrePlaneta());
                        System.out.println(" 5 " + jupiter.getNombrePlaneta());
                        System.out.println(" 6 " + urano.getNombrePlaneta());

                        planeta3 = scanner.nextInt() - 1;
                        
                        /* Use of the different methods of the Planet class to obtain the results. */
                        fuerzaG = listadoPlanetas.get(planeta3).atraccionGravitatoriaSol();
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("La fuerza Gravitacional entre " + listadoPlanetas.get(planeta3).getNombrePlaneta()
                                + " y " + "el sol es de: " + fuerzaG + " [N]");
                        System.out.println("-------------------------------------------------------------------------------------");
                        
                        break;
                    default:
                        System.out.println("Ingrese una opcion correcta");
                }
            } catch (Exception e) {
                e.getMessage();
            }

        } while (op != 0);

    }
}
