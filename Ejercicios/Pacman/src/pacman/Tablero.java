
package pacman;

public class Tablero {
   
    Pacman pacmini;
    Integer nivel;
    
    public Tablero(Pacman pacmini, Integer nivel){
        this.pacmini = pacmini;
        this.nivel = nivel;
    }
    
    public Integer comprobarNivelActual(){
        Integer niv = this.pacmini.puntuacion;
        Integer cont = 0;
        while (niv >= 25){
            cont++;
            niv -= 25;
        }
        return cont;
    }
    
     
}
