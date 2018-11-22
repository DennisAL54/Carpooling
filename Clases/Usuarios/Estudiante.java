package Usuarios;

import Estructuras.*;

/**
 * Representa a un Estudiante
 *
 * @author Ruben Salas
 * @version 1.0
 */
public class Estudiante {

    private String nombre;
    private String carnet;
    private String localizacion;

    private int cantViajes;
    private double calificacion;
    private Lista listaAmigos;
    private Estudiante next;

    /**
     * Constructor de Estudiante
     */
    public Estudiante(String nombre, String carnet, String localizacion){
        this.nombre = nombre;
        this.carnet = carnet;
        this.localizacion = localizacion;

        this.cantViajes = 0;
        this.calificacion = 0.0;
        this.listaAmigos = null;
        this.next = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getCantViajes() {
        return cantViajes;
    }

    public void setCantViajes(int cantViajes) {
        this.cantViajes = cantViajes;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Lista getListaAmigos() {
        return listaAmigos;
    }

    public void setListaAmigos(Lista listaAmigos) {
        this.listaAmigos = listaAmigos;
    }

    public Estudiante getNext() {
        return next;
    }

    public void setNext(Estudiante next) {
        this.next = next;
    }


    /**
     * Calcula la calificacion del usuario luego de haber sido calificado por ultima vez
     */
    public void calificar(int calificacion){
        if (this.calificacion == 0.0) {
            this.calificacion = calificacion;
        }
        else {
            this.calificacion = ( (this.calificacion * (this.cantViajes - 1) ) + calificacion) / this.cantViajes;
        }
    }

}
