package Usuarios;

/**
 * Representa a un Estudiante - Chofer.
 *
 * @author Ruben Salas
 * @version 1.0
 */
public class Chofer extends Estudiante {

    private int espacios;
    private boolean sinDesvios = false;
    private boolean soloAmigos = false;

    /**
     * Constructor Chofer
     * @param nombre - Nombre completo
     * @param carnet - Numero de carnet
     */
    public Chofer(String nombre, String carnet, String localizacion){
        super(nombre,carnet,localizacion);
    }

    //Setters & Getters

    public int getEspacios() {
        return espacios;
    }

    public void setEspacios(int espacios) {
        this.espacios = espacios;
    }
}
