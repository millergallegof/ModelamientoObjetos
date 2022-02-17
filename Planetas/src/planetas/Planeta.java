package planetas;

import java.util.UUID;

/**
 * in this class is the planet object which contains the most important
 * attributes of a planet, on the other hand it calculates the gravitational
 * force between celestial objects..
 *
 * @version 1.01.00 2022-02-17
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since Available from version 1
 *
 */
public class Planeta {

    private final Double G = 6.67 * Math.pow(10, -11);
    private final Double masaSol = 1.989 * Math.pow(10, 30);
    private final UUID identificacion;
    private final String nombrePlaneta;
    private final Double masa;
    private final Double densidad;
    private final Double diametro;
    private final Double distanciaSol;

    /**
     * Constructor which has the main characteristics and relevant data to
     * obtain its gravitational force.
     *
     * @param nombrePlaneta String data type which corresponds to the unique
     * name of a space object.
     * @param masa Data type Double is the mass in kg of the planet.
     * @param densidad Data type Double
     * @param diametro Data type Double is the diameter in km of the planet.
     * @param distanciaSolKm Data type Double is the distance from the planet to
     * the sun in km from the planet.
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1
     *
     *
     */
    public Planeta(String nombrePlaneta, Double masa, Double densidad, Double diametro, Double distanciaSolKm) {
        this.identificacion = UUID.randomUUID();
        this.nombrePlaneta = nombrePlaneta;
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaSol = distanciaSolKm * 1000;
    }

    /**
     * Method to find the gravitational force between a given planet and
     * another, depending on the distance between the bodies and the mass of
     * each one.
     *
     * @param planeta Data type Planet is the object for which the gravitational
     * force is being calculated.
     * @return fuerzaGravitacional value of type Double which is the force between the two objects named
     * @throws Exception Division by 0
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1
     *
     *
     */
    public Double atraccionGravitatoriaPlanetas(Planeta planeta) {
        Double dividendo = 0.0;
        Double fuerzagravitatoria = 0.0;
        Double divisor = 0.0;
        dividendo = G * (planeta.getMasa() * this.masa);
        divisor = Math.pow((planeta.getDistanciaSol() - this.distanciaSol), 2);
        if (divisor == 0) {
            throw new IllegalArgumentException("Revise los datos del objeto ya que estan incorrectos");
        }
        fuerzagravitatoria = dividendo / divisor;
        return fuerzagravitatoria;
    }

    /**
     * Method to obtain the gravitational force between any planet and the sun,
     * using the physical formula of the universal gravitational force.
     *
     * @return fuerzaGravitacional value of type Double which is the gravitational force between the sun and a space body.
     * @throws Exception Division by 0
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1
     *
     *
     */
    public Double atraccionGravitatoriaSol() {

        Double dividendo = 0.0;
        Double fuerzagravitatoria = 0.0;
        Double divisor = 0.0;
        dividendo = G * (masaSol * this.masa);
        divisor = Math.pow(this.distanciaSol, 2);
        if (divisor == 0) {
            throw new IllegalArgumentException("Revise los datos del objeto ya que estan incorrectos");
        }
        fuerzagravitatoria = dividendo / divisor;
        return fuerzagravitatoria;
    }

    public UUID getIdentificacion() {
        return identificacion;
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public Double getG() {
        return G;
    }

    public Double getMasaSol() {
        return masaSol;
    }

    public Double getMasa() {
        return masa;
    }

    public Double getDensidad() {
        return densidad;
    }

    public Double getDiametro() {
        return diametro;
    }

    public Double getDistanciaSol() {
        return distanciaSol;
    }

    /**
     * Method by which information about the object to which it is applied is
     * printed, indicating the type of data measurements.
     *
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since Available from version 1
     *
     *
     */
    public String mostrarInformacion() {
        return "Planeta{" + "identificacion=" + identificacion + ", nombrePlaneta=" + nombrePlaneta + "\n"
                + ", masa=" + masa + "Kg" + ", densidad=" + densidad + "g/cm3" + ", diametro=" + diametro + "Km" + "\n"
                + ", distanciaSol=" + distanciaSol + "Km" + '}';

    }

}
