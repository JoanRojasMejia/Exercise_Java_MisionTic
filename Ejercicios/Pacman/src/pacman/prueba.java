
package pacman;

public class prueba {
    
    public static void main(String[] args) {
        Pacman joan = new Pacman("Azul", 75, 3);
        Tablero mio = new Tablero(joan, 0);
        
        System.out.println(mio.comprobarNivelActual());
    
    }
    

}
