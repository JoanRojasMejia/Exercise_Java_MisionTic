package ZapatosXD;

public class Zapatos {
    
    final static String MARCA = "Arturo";
    final static String TIPO_MATERIAL = "Cuero";
    final static double PRECIO_BASE = 10000;
    String marca;
    String tipo_material;
    double precioBase;

    public Zapatos(String marca, String tipo_material, double precioBase) {
        this.marca = marca;
        this.tipo_material = tipo_material;
        this.precioBase = precioBase;
    }

    public Zapatos(String marca) {
        this.marca = marca;
        this.tipo_material = TIPO_MATERIAL;
        this.precioBase = PRECIO_BASE;
    }

    public Zapatos() {
        this.marca = MARCA;
        this.tipo_material = TIPO_MATERIAL;
        this.precioBase = PRECIO_BASE;
    }

    public double calcularPrecio() {
        double auxiliar = this.precioBase;
        if (this.marca.equals("Arturo")) {
           auxiliar = auxiliar + (auxiliar * 0.75);
        } else {
           auxiliar = auxiliar + (auxiliar * 0.2);
        }
        if (this.tipo_material.equals("Cuero")) {
           auxiliar -= 5000;
        } else {
           auxiliar -= 500;
        }
        return auxiliar;
    }
    
}
