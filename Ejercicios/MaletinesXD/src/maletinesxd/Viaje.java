package maletinesxd;

public class Viaje extends Maleta {

    int vidaUtil;
    String claseMaleta;
    
    public Viaje(String nombre, int capacidad, int bolsillos,int vidaUtil) {
        super(nombre, capacidad, bolsillos);
        this.vidaUtil = vidaUtil;
        this.claseMaleta = "Viaje";
    }

    @Override
    public String[] enviarCosa() {
        String[] aux = new String[3];
        aux[0] = this.claseMaleta;
        aux[1] = Integer.toString(this.vidaUtil);
        aux[2] = "vida útil";
        return aux;
    }

}