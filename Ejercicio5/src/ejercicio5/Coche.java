package ejercicio5;

/**
 * Class that inherits vehicle methods and attributes and implements the
 * MetVehicle interface, it is the template of a car that has specific
 * attributes of this vehicle.
 *
 *
 *
 * @version 1.001.00
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since Available from version 1.
 *
 */
public class Coche extends Vehiculo implements MetVehiculo {

    private Integer numPuertas;
    private String tipoTransmision;

    /**
     * constructor with the main elements to create an object of type car,
     * simplifies the creation of the object since it asks for the key elements
     * as arguments.
     *
     * @param numPuertas specifies the number of gates the object has.
     * @param tipoTransmision string data type that specifies a specific
     * behavior.
     * @param numMatricula single string data as object
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     *
     * @since Available from version 1.
     *
     *
     *
     */
    public Coche(Integer numPuertas, String tipoTransmision, String numMatricula) {
        super(numMatricula);
        this.numPuertas = numPuertas;
        this.tipoTransmision = tipoTransmision;
    }

    /**
     * secondary constructor which receives more specific attributes of the
     * object, constructor which stores elements with which to perform more
     * specific methods.
     *
     * @param numPuertas specifies the number of gates the object has.
     * @param tipoTransmision string data type that specifies a specific
     * behavior.
     * @param marca given string type ferry brand
     * @param modelo given string type or modelo of ferry
     * @param numPasajeros data type integer number of passengers currently in
     * the company's fleet
     * @param precensiaTripulacion data type boolean specifies whether crew is
     * required for operation
     * @param existeRuedas boolean data type boolean specifies existence of
     * wheels
     * @param fechaMatricula string type data vehicle registration date
     * @param medioDeDesplazamiento data type string by which means of
     * transportation air land sea
     * @param tipoDeFrenos data type string type of brakes mechanical hydraulic
     * brakes
     * @param velocidadMax data type Double maximum speed that the vehicle can
     * reach
     * @param numMatricula datos de cadena única como objeto
     * @param valorAceleracion data type Double value by which the speed is to
     * be increased
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     *
     * @since Available from version 1.
     *
     *
     *
     */
    public Coche(Integer numPuertas, String tipoTransmision, String marca, String modelo, Integer numPasajeros,
            boolean precensiaTripulacion, boolean existeRuedas, String fechaMatricula, String medioDeDesplazamiento,
            String tipoDeFrenos, Double velocidadMax, String numMatricula, Double valorAceleracion) {
        super(marca, modelo, numPasajeros, precensiaTripulacion, existeRuedas, fechaMatricula, medioDeDesplazamiento,
                tipoDeFrenos, velocidadMax, numMatricula, valorAceleracion);
        this.numPuertas = numPuertas;
        this.tipoTransmision = tipoTransmision;
    }

    /**
     * Method by which the main data of the object is displayed.
     * 
     * 
     * 
     * @return elemento string el cual muestra lso datos principales del objeto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1.
     *
     *
     */
    @Override
    public String mostrarDatos() {
        return "Coche{" + "numPuertas=" + numPuertas + ", tipoTransmision=" + tipoTransmision + '}';
    }

    public Integer getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(Integer numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

}
