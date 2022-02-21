package ejercicio5;

/**
 * Class that inherits vehicle methods and attributes and implements the
 * MetVehicle interface, it is the template of a motorboat that has specific
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
public class Lancha extends Vehiculo implements MetVehiculo {

    private boolean tieneCapota;
    private boolean tieneCojineria;
    private Integer numMotores;

    /**
     * constructor with the main elements to create an object of type boat, it
     * simplifies the creation of the object since it asks for the key elements
     * as arguments.
     *
     * @param tieneCapota boolean data type that specifies if it has a hood.
     * @param tieneCojineria boolean type data indicating whether it has
     * cushioned accents.
     * @param numMotores integer type data indicating the number of motors of
     * the object.
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
    public Lancha(boolean tieneCapota, boolean tieneCojineria, Integer numMotores, String numMatricula) {
        super(numMatricula);
        this.tieneCapota = tieneCapota;
        this.tieneCojineria = tieneCojineria;
        this.numMotores = numMotores;
    }

    /**
     * secondary constructor which receives more specific attributes of the
     * object, constructor which stores elements with which to perform more
     * specific methods.
     *
     * @param tieneCapota boolean data type that specifies if it has a hood.
     * @param tieneCojineria boolean type data indicating whether it has
     * cushioned accents.
     * @param numMotores integer type data indicating the number of motors of
     * the object.
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
    public Lancha(boolean tieneCapota, boolean tieneCojineria, Integer numMotores, String marca, String modelo, Integer numPasajeros, boolean precensiaTripulacion, boolean existeRuedas, String fechaMatricula, String medioDeDesplazamiento, String tipoDeFrenos, Double velocidadMax, String numMatricula, Double valorAceleracion) {
        super(marca, modelo, numPasajeros, precensiaTripulacion, existeRuedas, fechaMatricula, medioDeDesplazamiento, tipoDeFrenos, velocidadMax, numMatricula, valorAceleracion);
        this.tieneCapota = tieneCapota;
        this.tieneCojineria = tieneCojineria;
        this.numMotores = numMotores;
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
        return "Lancha{" + "tieneCapota=" + tieneCapota + ", tieneCojineria=" + tieneCojineria + ", numMotores=" + numMotores + '}';
    }

    public boolean isTieneCapota() {
        return tieneCapota;
    }

    public void setTieneCapota(boolean tieneCapota) {
        this.tieneCapota = tieneCapota;
    }

    public boolean isTieneCojineria() {
        return tieneCojineria;
    }

    public void setTieneCojineria(boolean tieneCojineria) {
        this.tieneCojineria = tieneCojineria;
    }

    public Integer getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(Integer numMotores) {
        this.numMotores = numMotores;
    }

}
