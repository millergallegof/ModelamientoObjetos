package ejercicio5;

/**
 * Class that inherits vehicle methods and attributes and implements the
 * MetVehicle interface, it is the template of a motorcycle that has specific
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
public class Moto extends Vehiculo implements MetVehiculo {

    private String tipoTransmision;
    private Double cilindraje;
    private boolean esScotter;
    private boolean esEnDuro;

    /**
     * constructor with the main elements to create an object of type moto,
     * simplifies the creation of the object since it asks for the key elements
     * as arguments.
     *
     * @param tipoTransmision data type string indicates the functionality of
     * the object.
     * @param cilindraje data type double indicates a characteristic of the
     * object.
     * @param esScotter boolean data type indicating the object type.
     * @param esEnDuro boolean data type indicating the object type.
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
    public Moto(String tipoTransmision, Double cilindraje, boolean esScotter, boolean esEnDuro, String numMatricula) {
        super(numMatricula);
        this.tipoTransmision = tipoTransmision;
        this.cilindraje = cilindraje;
        this.esScotter = esScotter;
        this.esEnDuro = esEnDuro;
    }

    /**
     * secondary constructor which receives more specific attributes of the
     * object, constructor which stores elements with which to perform more
     * specific methods.
     *
     * @param tipoTransmision data type string indicates the functionality of
     * the object.
     * @param cilindraje data type double indicates a characteristic of the
     * object.
     * @param esScotter boolean data type indicating the object type.
     * @param esEnDuro boolean data type indicating the object type.
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
    public Moto(String tipoTransmision, Double cilindraje, boolean esScotter, boolean esEnDuro, String marca, String modelo,
            Integer numPasajeros, boolean precensiaTripulacion, boolean existeRuedas, String fechaMatricula, String medioDeDesplazamiento,
            String tipoDeFrenos, Double velocidadMax, String numMatricula, Double valorAceleracion) {
        super(marca, modelo, numPasajeros, precensiaTripulacion, existeRuedas, fechaMatricula, medioDeDesplazamiento, tipoDeFrenos,
                velocidadMax, numMatricula, valorAceleracion);
        this.tipoTransmision = tipoTransmision;
        this.cilindraje = cilindraje;
        this.esScotter = esScotter;
        this.esEnDuro = esEnDuro;
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
        return "Moto{" + "tipoTransmision=" + tipoTransmision + ", cilindraje=" + cilindraje + ", esScotter=" + esScotter + ", esEnDuro=" + esEnDuro + '}';
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public Double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public boolean isEsScotter() {
        return esScotter;
    }

    public void setEsScotter(boolean esScotter) {
        this.esScotter = esScotter;
    }

    public boolean isEsEnDuro() {
        return esEnDuro;
    }

    public void setEsEnDuro(boolean esEnDuro) {
        this.esEnDuro = esEnDuro;
    }

}
