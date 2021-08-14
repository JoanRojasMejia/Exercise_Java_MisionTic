
package calculadora;

public class Calculadora implements Operaciones, Constantes{
    
    Double a, b;

    public Calculadora(Double a, Double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public Double suma() {
        return this.a+this.b;
    }

    @Override
    public Double resta() {
        return this.a-this.b;

    }

    @Override
    public Double multi() {
        return this.a*this.b;
    }

    @Override
    public Double division() {
        return this.a/this.b;
    }
    
    public Double multiplicarPorE() {
        return this.a * e;
    }
    
    public Double multiplicarPorPi() {
        return this.a * pi;
    }
    

    
}
