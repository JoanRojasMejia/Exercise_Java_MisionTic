package maletinesxd;

public class Trabajo extends Maleta {

    String color;
    String claseMaleta;
    
    public Trabajo(String nombre, int capacidad, int bolsillos,String color) {
            super(nombre, capacidad, bolsillos);
            this.color = color;
            this.claseMaleta = "Trabajo";
        }

    @Override
    public String[] enviarCosa() {
        String[] aux = new String[3];
        aux[0] = this.claseMaleta;
        aux[1] = this.color;
        aux[2] = "color";
        return aux;
    }

}