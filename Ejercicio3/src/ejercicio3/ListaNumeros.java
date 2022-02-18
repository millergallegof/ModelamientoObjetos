package ejercicio3;

import java.util.ArrayList;

/**
 * Class which has as template a list of random numbers, initially the object
 * starts empty and has different methods to add numbers, sort and delete them.
 *
 *
 * @version 1.01.000 2022-02-17
 *
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 *
 * @since Se Implemented since version 1
 *
 */
public class ListaNumeros {

    private ArrayList<Double> listaNumeros;

    /**
     * object constructor in which an empty array is incorporated.
     *
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1
     *
     *
     */
    public ListaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    /**
     * Method by which a number of random numbers determined by the parameters
     * are added and stored one by one in the object.
     *
     * @param cantidad Data type integer indicating the number of random
     * numbers.
     *
     *
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1
     *
     *
     */
    public void agregarNumerosAletorios(Integer cantidad) {

        for (int i = 0; i < cantidad; i++) {
            Double numero = Math.random() * 100 - 100;

            this.listaNumeros.add(numero);
        }
    }

    /**
     * Method with which all the elements of the list belonging to the object
     * are eliminated.
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1
     *
     *
     */
    public void limpiarLista() {
        this.listaNumeros.clear();
    }

    /**
     * Method which uses the bubble algorithm to order from smallest to largest
     * all the elements that are contained in the object.
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1
     *
     *
     */
    public void ordenarListaPorBurbuja() {

        Double aux;
        for (int i = 0; i < this.listaNumeros.size() - 1; i++) {
            for (int j = 0; j < this.listaNumeros.size() - i - 1; j++) {
                if (this.listaNumeros.get(j + 1) < this.listaNumeros.get(j)) {
                    aux = this.listaNumeros.get(j + 1);
                    this.listaNumeros.set(j + 1, this.listaNumeros.get(j));
                    this.listaNumeros.set(j, aux);
                }
            }
        }

    }

    /**
     * Method which sorts the numbers contained in the object using the Quick Sort method which handles sorting by pivot.
     *
     * @param lista Data of type ListNumber where the object with the array will be stored.
     * @param izq indicates the left index from which the array will begin to be parsed.
     * @param der indicates the right index where the array will be parsed.
     * 
     * @return an array with the sorted elements
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1
     *
     *
     */
    public ArrayList<Double> ordenarListaPorQuickSort(ListaNumeros lista, int izq, int der) {
        Double aux;
        int pivote;
        int i = izq;
        int d = der;
        der = lista.getListaNumeros().size() - 1;

        if (izq >= der) {
            return lista.getListaNumeros();
        } else {
            pivote = izq;
            while (izq != der) {
                while (lista.getListaNumeros().get(der) >= lista.getListaNumeros().get(pivote) && izq < der) {
                    der--;
                }
                while (lista.getListaNumeros().get(izq) < lista.getListaNumeros().get(pivote) && izq < der) {
                    izq--;
                }

                if (der != izq) {
                    aux = lista.getListaNumeros().get(der);
                    lista.getListaNumeros().set(der, lista.getListaNumeros().get(izq));
                    lista.getListaNumeros().set(izq, aux);
                }
            }
            if (izq < izq - 1) {
                ordenarListaPorQuickSort(lista, i, izq - 1);

            }
            if (izq + 1 < der) {
                ordenarListaPorQuickSort(lista, izq + 1, d);
            }
        }

        return lista.getListaNumeros();
    }

    public ArrayList<Double> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Double> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

}
