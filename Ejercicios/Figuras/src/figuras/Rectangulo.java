
package figuras;

public class Rectangulo extends FiguraAbs{
    
    public Rectangulo(Double lado1, Double lado2, String caracter){
        super(lado1, lado2, caracter);
    }
    
    @Override
    public Double Obtener_Area() {
        return this.lado1 * this.lado2;
    }

    @Override
    public Double Obtener_perimetro() {
        return (this.lado1 * 2) + (this.lado2 * 2);
    }

    @Override
    public void Dibujar_figura() {
        Double i = 0.0;
        Double j = 0.0;
        
        while(i < this.lado1){
            while (j < this.lado2) {                
                System.out.print(" " + this.Caracter_delimitante);
                j++;
            }
            System.out.println();
            j=0.0;
            i++;
        }
        
    }
    
}
