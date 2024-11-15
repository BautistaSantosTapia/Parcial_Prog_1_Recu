
package santostapia_recuperatorio;

public abstract class Nave {
    private String nombre;
    private int capacidadTripulacion;
    private int anioLanzamiento;
    
    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public boolean puedeExplorar() {
        return false;
    }

    
    @Override
    public String toString() {
        return "Nave {nombre=" + nombre + ", capacidadTripulacion=" + capacidadTripulacion + ", anioLanzamiento=" + anioLanzamiento + '}';
    }
}
