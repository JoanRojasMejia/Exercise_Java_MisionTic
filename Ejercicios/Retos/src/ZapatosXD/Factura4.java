package ZapatosXD;

public class Factura4 {
    
    double totalZapatos;
    double totalZapatosNacional;
    double totalZapatosArtesanal;
    Zapatos[] lista;

    public Factura4(Zapatos[] lista) {
        this.lista = lista;
    }

    public void mostrarTotales() {
        for (Zapatos zapato : this.lista) {
            this.totalZapatos += zapato.calcularPrecio();
//            if(zapato.getClass().getName().equals("ZapatosXD.ZapatoArtesanal")){
//                this.totalZapatosArtesanal += zapato.calcularPrecio();
//            }
//            if(zapato.getClass().getName().equals("ZapatosXD.ZapatoNacional")){
//                this.totalZapatosNacional += zapato.calcularPrecio();
//            }
            if(zapato instanceof ZapatoArtesanal){
                this.totalZapatosArtesanal += zapato.calcularPrecio();
            }
            if(zapato instanceof ZapatoNacional){
                this.totalZapatosNacional += zapato.calcularPrecio();
            }
        }
        
        System.out.println("El precio total de los zapatos es de: " + totalZapatos);
        System.out.println("La suma del precio de los ZapatosNacional es de: " + totalZapatosNacional);
        System.out.println("La suma del precio de los ZapatosArtensal es de: " + totalZapatosArtesanal);

    }
    
}
