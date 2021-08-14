
package calculadora;

public class Main {
    
    public static void main(String[] args) {
        Calculadora joan = new Calculadora(4.5, 5.6);
        System.out.println(joan.suma());
        System.out.println(joan.resta());
        System.out.println(joan.multi());
        System.out.println(joan.division());
        System.out.println(joan.multiplicarPorE());
        System.out.println(joan.multiplicarPorPi());
    }
}
