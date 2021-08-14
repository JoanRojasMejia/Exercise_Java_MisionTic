package ZapatosXD;

public class ZapatoArtesanal extends Zapatos{
    
    final static int TAMANO = 40;
    int tamano;

    public ZapatoArtesanal(int tamano, String marca, String tipo_material, double precioBase) {
        super(marca, tipo_material, precioBase);
        this.tamano = tamano;
    }

    public ZapatoArtesanal(int tamano) {
        this.tamano = tamano;
        this.marca = MARCA;
        this.tipo_material = TIPO_MATERIAL;
        this.precioBase = PRECIO_BASE;
    }

    public ZapatoArtesanal() {
        this.tamano = TAMANO;
        this.marca = MARCA;
        this.tipo_material = TIPO_MATERIAL;
        this.precioBase = PRECIO_BASE;
    }

    @Override
    public double calcularPrecio() {
        double auxiliar = super.calcularPrecio();
        if (this.tamano < 40) {
           auxiliar += 10000;
        } else {
           auxiliar += 4500;
        }
        return auxiliar;
    }
    
}
