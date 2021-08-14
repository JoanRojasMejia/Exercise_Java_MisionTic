
package pacman;

public class Pacman {
    
    String color = "Amarillo";
    Integer puntuacion = 0;
    Integer vidasRestantes = 3;
    
    public Pacman(String color, Integer puntuacion, Integer vidasRestantes){
        this.color = color;
        this.puntuacion = puntuacion;
        this.vidasRestantes = vidasRestantes;
    }
 
    public Integer sumarPuntuacion(){
        this.puntuacion++;
        return this.puntuacion;
    }

    public Integer obtenerPuntuacion() {
        return this.puntuacion;
    }
    
    public Integer restarVida(){
        this.vidasRestantes--;
        return this.vidasRestantes;
    }
    
    public boolean sigueVivo(){
        return this.vidasRestantes > 0;
    }
    
}
