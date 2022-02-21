package ejercicio5;

/**
 * Class that inherits vehicle methods and attributes and implements the
 * MetVehicle interface, it is the template of a truck that has specific
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
public class Camion extends Vehiculo implements MetVehiculo {

    private boolean esArticulado;
    private Double altura;
    private String tipoCarga;

    /**
     * constructor with the main elements to create an object of type truck,
     * simplifies the creation of the object since it asks for the key elements
     * as arguments.
     *
     *
     * @param esArticulado Data type boolean that indicates if the object has a
     * specific characteristic.
     * @param altura Data type double indicating a dimension of an object.
     * @param tipoCarga Data type String type data indicating what the object
     * can carry.
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
    public Camion(boolean esArticulado, Double altura, String tipoCarga, String numMatricula) {
        super(numMatricula);
        this.esArticulado = esArticulado;
        this.altura = altura;
        this.tipoCarga = tipoCarga;
    }

    /**
     * secondary constructor which receives more specific attributes of the
     * object, constructor which stores elements with which to perform more
     * specific methods.
     *
     * @param esArticulado Data type boolean that indicates if the object has a
     * specific characteristic.
     * @param altura Data type double indicating a dimension of an object.
     * @param tipoCarga String data type indicates if they are people, vehicles
     * or other type of cargo.
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
    public Camion(boolean esArticulado, Double altura, String tipoCarga, String marca, String modelo, Integer numPasajeros,
            boolean precensiaTripulacion, boolean existeRuedas, String fechaMatricula, String medioDeDesplazamiento,
            String tipoDeFrenos, Double velocidadMax, String numMatricula, Double valorAceleracion) {
        super(marca, modelo, numPasajeros, precensiaTripulacion, existeRuedas, fechaMatricula, medioDeDesplazamiento,
                tipoDeFrenos, velocidadMax, numMatricula, valorAceleracion);
        this.esArticulado = esArticulado;
        this.altura = altura;
        this.tipoCarga = tipoCarga;
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
        return "Camion{" + "esArticulado=" + esArticulado + ", altura=" + altura + ", tipoCarga=" + tipoCarga + '}';
    }

    public boolean isEsArticulado() {
        return esArticulado;
    }

    public void setEsArticulado(boolean esArticulado) {
        this.esArticulado = esArticulado;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

}
