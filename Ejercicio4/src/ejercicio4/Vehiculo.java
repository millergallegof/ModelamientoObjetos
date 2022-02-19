package ejercicio4;

/**
 * Abstract class which is a template for any vehicle that currently exists, it
 * has attributes such as means of transport, make, model and registration date,
 * it has primary methods for a vehicle.
 *
 *
 *
 * @version 1.001.00
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since Available from version 1.
 *
 */
public abstract class Vehiculo implements MetVehiculo {

    private String marca;
    private String modelo;
    private Integer numPasajeros;
    private boolean precensiaTripulacion;
    private boolean existeRuedas;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private String fechaMatricula;
    private String medioDeDesplazamiento;
    private String tipoDeFrenos;
    private Double velocidadMax;
    private Double velocidadActual = 0.0;
    private final String numMatricula;
    private Double valorAceleracion;

    /**
     * constructor with the vehicle identifier data
     *
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
    public Vehiculo(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    /**
     * constructor with specific attributes of vehicle object
     *
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
    public Vehiculo(String marca, String modelo, Integer numPasajeros, boolean precensiaTripulacion, boolean existeRuedas,
            String fechaMatricula, String medioDeDesplazamiento, String tipoDeFrenos, Double velocidadMax, String numMatricula,
            Double valorAceleracion) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPasajeros = numPasajeros;
        this.precensiaTripulacion = precensiaTripulacion;
        this.existeRuedas = existeRuedas;
        this.fechaMatricula = fechaMatricula;
        this.medioDeDesplazamiento = medioDeDesplazamiento;
        this.tipoDeFrenos = tipoDeFrenos;
        this.velocidadMax = velocidadMax;
        this.numMatricula = numMatricula;
        this.valorAceleracion = valorAceleracion;
    }

    /**
     * Method by which the current vehicle speed is increased respectively to
     * the acceleration value of the object.
     *
     *
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1.
     *
     *
     */
    @Override
    public void acelerar() {
        if (getVelocidadActual() >= getVelocidadMax()) {
            System.out.println("El ferry no puede aumentar mas de velocidad");
        } else {
            this.velocidadActual = +this.valorAceleracion;
        }
    }

    /**
     * Method by which the current velocity becomes 0, has exceptions when the velocity is 0
     *
     *
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1.
     *
     *
     */
    @Override
    public void frenar() {
        if (getVelocidadActual() == 0) {
            System.out.println("El ferry se encuentra quieto");
        } else {
            this.velocidadActual = 0.0;
        }
    }

    /**
     * Method by which the object is moved to the right, using the Cartesian plane as an example where the movement to the right is movement towards the x-axis positive part.
     *
     *
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1.
     *
     *
     */
    @Override
    public void moverDerecha() {
        if (getVelocidadActual() == 0) {
            System.out.println("El ferry no se encuentra en marcha");
        } else {
            this.localizacionX += this.velocidadActual;
        }
    }

    /**
     * Method with which the object is displaced to the left, we take as an example the Cartesian plane where the movement to the left is movement towards the x-axis negative part.
     *
     *
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1.
     *
     *
     */
    @Override
    public void moverIzquierda() {
        if (getVelocidadActual() == 0) {
            System.out.println("El ferry no se encuentra en marcha");
        } else {
            this.localizacionX -= this.velocidadActual;
        }

    }

    /**
     * Method with which the object is moved upwards, the Cartesian plane is taken as an example where the movement upwards is movement towards the axis and positive part.
     *
     *
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1.
     *
     *
     */
    @Override
    public void moverArriba() {
        if (getVelocidadActual() == 0) {
            System.out.println("El ferry no se encuentra en marcha");
        } else {
            this.localizacionY += this.velocidadActual;
        }
    }

    /**
     * Method with which the object is moved down, the Cartesian plane is taken as an example where the movement down is movement towards the axis and negative part.
     *
     *
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1.
     *
     *
     */
    @Override
    public void moverAbajo() {
        if (getVelocidadActual() == 0) {
            System.out.println("El ferry no se encuentra en marcha");
        } else {
            this.localizacionY -= this.velocidadActual;
        }
    }

    /**
     * Method for calculating the distance traveled by the vehicle using the
     * Pythagorean theorem
     *
     * @return the value of the total distance traveled
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1.
     *
     *
     */
    public Double calcularDistancia() {
        return Math.sqrt((this.localizacionX * this.localizacionX) + (this.localizacionY * this.localizacionY));
    }

    /**
     * Method by which passengers are loaded into the vehicle.
     *
     *
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1.
     *
     *
     */
    @Override
    public void subirPsajero() {
        if (this.velocidadActual != 0) {
            System.out.println("El vehiculo se encuentra en marcha");
        } else {
            this.numPasajeros += numPasajeros + 1;
        }
    }

    /**
     * Method by which passengers are alighting from the vehicle
     *
     *
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1.
     *
     *
     */
    @Override
    public void bajarPasajeros() {
        if (this.velocidadActual != 0) {
            System.out.println("El vehiculo se encuentra en movimiento");
        } else if (this.numPasajeros == 0) {
            System.out.println("El vehiculo no tiene pasajeros");
        } else {
            this.numPasajeros -= 1;
        }
    }

    /**
     * Abstract method which indicates to show the main data of the vehicle.
     *
     *
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1.
     *
     *
     */
    public abstract String mostrarDatos();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public Integer getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(Integer numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public boolean isPrecensiaTripulacion() {
        return precensiaTripulacion;
    }

    public void setPrecensiaTripulacion(boolean precensiaTripulacion) {
        this.precensiaTripulacion = precensiaTripulacion;
    }

    public boolean isExisteRuedas() {
        return existeRuedas;
    }

    public void setExisteRuedas(boolean ExisteRuedas) {
        this.existeRuedas = ExisteRuedas;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getMedioDeDesplazamiento() {
        return medioDeDesplazamiento;
    }

    public void setMedioDeDesplazamiento(String medioDeDesplazamiento) {
        this.medioDeDesplazamiento = medioDeDesplazamiento;
    }

    public String getTipoDeFrenos() {
        return tipoDeFrenos;
    }

    public void setTipoDeFrenos(String tipoDeFrenos) {
        this.tipoDeFrenos = tipoDeFrenos;
    }

    public Double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(Double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public Double getValorAceleracion() {
        return valorAceleracion;
    }

    public void setValorAceleracion(Double valorAceleracion) {
        this.valorAceleracion = valorAceleracion;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", Modelo=" + modelo + ", numPasajeros=" + numPasajeros + ", precensiaTripulacion=" + precensiaTripulacion + "\n"
                + ", ExisteRuedas=" + existeRuedas + ", localizacionX=" + localizacionX + ", localizacionY=" + localizacionY + ", fechaMatricula=" + fechaMatricula + "\n"
                + ", medioDeDesplazamiento=" + medioDeDesplazamiento + ", tipoDeFrenos=" + tipoDeFrenos + ", velocidadMax=" + velocidadMax + ", velocidadActual=" + velocidadActual + "\n"
                + ", numMatricula=" + numMatricula + ", valorAceleracion=" + valorAceleracion + '}';
    }

}
