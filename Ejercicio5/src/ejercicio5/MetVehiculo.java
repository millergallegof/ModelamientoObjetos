package ejercicio5;

/**
 * interface that implements the main methods for a vehicle, which are the
 * movement of the vehicles and the actions that can be performed by each one.
 *
 *
 *
 * @version 1.001.00
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since Available from version 1.
 *
 */
public interface MetVehiculo {
    
    public abstract void acelerar();

    public abstract void frenar();

    public abstract void moverDerecha();

    public abstract void moverIzquierda();

    public abstract void moverArriba();

    public abstract void moverAbajo();

    public abstract void subirPsajero();

    public abstract void bajarPasajeros();

}