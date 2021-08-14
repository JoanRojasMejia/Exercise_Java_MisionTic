package figuras;

public abstract class FiguraAbs {
    
    Double lado1;
    Double lado2;
    String Caracter_delimitante;
    
    public FiguraAbs(Double lado1, Double lado2, String caracter){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.Caracter_delimitante = caracter;
    }
    
    public abstract Double Obtener_Area();
    public abstract Double Obtener_perimetro();
    public abstract void Dibujar_figura();
    
}
