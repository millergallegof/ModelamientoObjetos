package ejercicio4;

/**
 * Class which is inheriting the abstract class Ferry and is implementing the
 * MetVehicle interface, it is the template for a ferry which has specific
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
public class Ferry extends Vehiculo implements MetVehiculo {

    private String tipoCarga;
    private String color;

    public Ferry(String numMatricula) {
        super(numMatricula);
    }

    /**
     * constructor with the main elements to create an object of type ferry,
     * simplifies the creation of the object since it asks for key elements as
     * arguments.
     *
     * @param tipoCarga String data type indicates if they are people, vehicles
     * or other type of cargo.
     * @param color object color
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
    public Ferry(String tipoCarga, String color, String numMatricula) {
        super(numMatricula);
        this.tipoCarga = tipoCarga;
        this.color = color;
    }

    /**
     * secondary constructor which receives more specific attributes of the
     * object, constructor which stores elements with which to perform more
     * specific methods.
     *
     * @param tipoCarga String data type indicates if they are people, vehicles
     * or other type of cargo.
     * @param color object color.
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
    public Ferry(String tipoCarga, String color, String marca, String modelo, Integer numPasajeros, boolean precensiaTripulacion,
            boolean existeRuedas, String fechaMatricula, String medioDeDesplazamiento, String tipoDeFrenos, Double velocidadMax,
            String numMatricula, Double valorAceleracion) {
        super(marca, modelo, numPasajeros, precensiaTripulacion, existeRuedas, fechaMatricula, medioDeDesplazamiento, tipoDeFrenos,
                velocidadMax, numMatricula, valorAceleracion);
        this.tipoCarga = tipoCarga;
        this.color = color;
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
        return "Ferry{" + "Numero de matricula: " + getNumMatricula() + "con tipoCarga: " + tipoCarga + ", de color: " + color + '}';
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
