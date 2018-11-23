package ca.server.Model;
import java.util.ArrayList;
import java.util.List;

public class Registro {
    private long id;
    private String Name;
    private long Localizacion;
    private int cantidadDeViajes;
    private float calificacion;
    private int espacios;

    public long getLocalizacion() {
        return Localizacion;
    }

    public void setLocalizacion(long localizacion) {
        Localizacion = localizacion;
    }

    public int getCantidadDeViajes() {
        return cantidadDeViajes;
    }

    public void setCantidadDeViajes(int cantidadDeViajes) {
        this.cantidadDeViajes = cantidadDeViajes;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public int getEspacios() {
        return espacios;
    }

    public void setEspacios(int espacios) {
        this.espacios = espacios;
    }

    public Registro(long localizacion, int cantidadDeViajes, float calificacion, int espacios) {
        Localizacion = localizacion;
        this.cantidadDeViajes = cantidadDeViajes;
        this.calificacion = calificacion;
        this.espacios = espacios;
    }
    

    public Registro() {
    }
    public Registro(long id, String name) {
        this.id = id;
        Name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
