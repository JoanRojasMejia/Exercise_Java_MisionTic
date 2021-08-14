
package figuras;

import java.util.Objects;

public class Cuadraro extends FiguraAbs{
    
    public Cuadraro(Double lado1, Double lado2, String caracter){
        super(lado1, lado2, caracter);
    }
    
    @Override
    public Double Obtener_Area() {
        if(Objects.equals(this.lado1, this.lado2)){
            return this.lado1 * this.lado2;
        }
        else{
            System.out.print("Un cuadrado debe tener sus lados iguales = ");
            return null;
        }  
    }

    @Override
    public Double Obtener_perimetro() {
        if(Objects.equals(this.lado1, this.lado2)){
            return this.lado1 * 4;
        }
        else{
            System.out.print("Un cuadrado debe tener sus lados iguales = ");
            return null;
        } 
    }

    @Override
    public void Dibujar_figura() {
        if(Objects.equals(this.lado1, this.lado2)){
            if(this.lado1 >= 2 && this.lado1 <= 50) {
                for (int i = 1; i <= this.lado1; i++) {
                    for (int j = 1; j <= this.lado1; j++) {
                        System.out.print(" " + this.Caracter_delimitante);
                    }
                    System.out.println("");
                }
            }else{
                System.out.println("Solo se puede imprimir un cuadrado menor a 50.0");
            }
        }
        else{
            System.out.print("Un cuadrado debe tener sus lados iguales.");
        }

    }
    
}
