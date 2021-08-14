package maletinesxd;

public abstract class Maleta {

    String nombre;
    int capacidad;
    int bolsillos;

    public Maleta(String nombre, int capacidad, int bolsillos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.bolsillos = bolsillos;
    }

    public abstract String[] enviarCosa();

}