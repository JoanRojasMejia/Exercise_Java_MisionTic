package ZapatosXD;

public class Main {
    public static void main(String[] args) {

        Zapatos zapatos[] = new Zapatos[5];
        zapatos[0] = new Zapatos("Arturo", "Cuero", 5000);
        zapatos[1] = new ZapatoNacional("Valle");
        zapatos[2] = new ZapatoArtesanal(42);
        zapatos[3] = new Zapatos();
        zapatos[4] = new ZapatoNacional("Cundinamarca");

        Factura4 solucion = new Factura4(zapatos);
        solucion.mostrarTotales();
        
    }
}
