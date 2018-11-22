package Usuarios;

/**
 * Representa a un Estudiante - Pasajero.
 *
 * @author Ruben Salas
 * @version 1.0
 */
public class Pasajero extends Estudiante {

    private boolean recogerAmigo = false;
    private boolean recogerCualquiera = false;

    /**
     * Constructor Pasajero
     * @param nombre - Nombre completo
     * @param carnet - Numero de carnet
     * @param localizacion - Punto de referencia en grafo
     */
    public Pasajero(String nombre, String carnet, String localizacion){
        super(nombre,carnet,localizacion);
    }

    //Getters & Setters

    public boolean isRecogerAmigo() {
        return recogerAmigo;
    }

    public void setRecogerAmigo(boolean recogerAmigo) {
        this.recogerAmigo = recogerAmigo;
    }

    public boolean isRecogerCualquiera() {
        return recogerCualquiera;
    }

    public void setRecogerCualquiera(boolean recogerCualquiera) {
        this.recogerCualquiera = recogerCualquiera;
    }

    /**
     * Cambia la opcion escogida por el estudiante para saber quien lo puede recoger.
     * @param chofer - amigo o culaquiera
     */
    public void serRecogido(String chofer){
        //Puede recogerlo cualquiera
        if (chofer == "cualquiera"){
            this.recogerAmigo = true;
            this.recogerCualquiera = true;
        } //Puede recogerlo un amigo
        else if (chofer == "amigo"){
            this.recogerAmigo = true;
            this.recogerCualquiera = false;
        } //Desabilitado
        else {
            this.recogerAmigo = false;
            this.recogerCualquiera = false;
        }
    }
}
