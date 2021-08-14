
package figuras;

import java.util.Scanner;

public class Figuras {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¡¡¡Bienvenido a Figuras!!!");
        System.out.println("1. Opcion de Cuadrado.");
        System.out.println("2. Opcion de Rectangulo.");
        System.out.println("3. Opcion de Rombo.");
        System.out.println("Escoge una opcion: ");
        int opcion = sc.nextInt();

        switch(opcion){
            case 1 -> {
                
                System.out.println("¡¡¡Bienvenido a Cuadrados!!!");
                System.out.println("Ingresa la longitud de un lado del cuadrado: ");
                Double largo = sc.nextDouble();
                System.out.println("Ingresa el caracter para dibujar el cuadrardo: ");
                Cuadraro jony = new Cuadraro(largo, largo, sc.next());
                
                System.out.println("1. Hallar el Area del cuadrado.");
                System.out.println("2. Hallar el Perimetro del cuadrado.");
                System.out.println("3. Dibujar cuadrado.");
                System.out.println("Escoge una opcion: ");
                int opcion1 = sc.nextInt();
                
                switch(opcion1){
                    case 1 -> {
                        System.out.println(jony.Obtener_Area());
                        break;
                    }
                    case 2 -> {
                        System.out.println(jony.Obtener_perimetro());
                        break;
                    }
                    case 3 -> {
                        jony.Dibujar_figura();
                        break;
                    }
                    default -> {
                        System.out.println("Esta no es una opcion.");
                    }
                }
            break;}
            case 2 -> {
                System.out.println("¡¡¡Bienvenido a Rectangulos!!!");
                System.out.println("Ingresa el alto del rectangulo: ");
                Double alto = sc.nextDouble();
                System.out.println("Ingresa el largo del rectangulo: ");
                Double larg = sc.nextDouble();
                System.out.println("Ingresa el caracter para dibujar el rectangulo: ");
                Rectangulo ale = new Rectangulo(alto, larg, sc.next());
           
                System.out.println("1. Hallar el Area del Rectangulo.");
                System.out.println("2. Hallar el Perimetro del Rectangulo.");
                System.out.println("3. Dibujar Rectangulo.");
                System.out.println("Escoge una opcion: ");
                int opcion1 = sc.nextInt();
                
                switch(opcion1){
                    case 1 -> {
                        System.out.println(ale.Obtener_Area());
                        break;
                    }
                    case 2 -> {
                        System.out.println(ale.Obtener_perimetro());
                        break;
                    }
                    case 3 -> {
                        ale.Dibujar_figura();
                        break;
                    }
                    default -> {
                        System.out.println("Esta no es una opcion.");
                    }
                }
            break;}
            case 3 -> {
                System.out.println("¡¡¡Bienvenido a Rombos!!!");
            break;}
            default -> {
                System.out.println("Esta no es una opcion.");
            }
        }
  
    }
    
}
