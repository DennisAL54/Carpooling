package ca.server.Model;

public class Registro {
    private long id;
    private String Name;

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
