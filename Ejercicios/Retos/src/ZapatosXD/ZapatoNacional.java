package ZapatosXD;

public class ZapatoNacional extends Zapatos {
    
    final static String REGION = "Cundinamarca";
    String region;

    public ZapatoNacional(String marca, String tipo_material, double precioBase, String region) {
        super(marca, tipo_material, precioBase);
        this.region = region;
    }

    public ZapatoNacional(String region) {
        this.region = region;
        this.marca = MARCA;
        this.tipo_material = TIPO_MATERIAL;
        this.precioBase = PRECIO_BASE;
    }

    public ZapatoNacional() {
        this.region = REGION;
        this.marca = MARCA;
        this.tipo_material = TIPO_MATERIAL;
        this.precioBase = PRECIO_BASE;
    }

    @Override
    public double calcularPrecio() {
        double auxiliar = super.calcularPrecio();
        if (this.region.equals("Cundinamarca")) {
           auxiliar += 10000;
        }
        return auxiliar;
    }
    
}
