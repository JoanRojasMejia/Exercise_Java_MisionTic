
package retos;
import java.util.Scanner;

public class Retos {

    public static void main(String[] args) {
        
        int cantcaballos;
        try ( // TODO code application logic here
            Scanner entrada = new Scanner (System.in)) {
            cantcaballos = entrada.nextInt();
        }
        int cantburros = (cantcaballos * 2) + 4;
        int cantcabras = (cantcaballos + cantburros) / 5;

        if(0 < cantcabras && cantcabras <= 20){
            System.out.println(cantcaballos + " " + cantburros + " " + cantcabras);
            System.out.print("\nuno");
        } else if(20 < cantcabras && cantcabras <= 30){
            System.out.println(cantcaballos + " " + cantburros + " " + cantcabras);
            System.out.print("\ndos");
        } else if(30 < cantcabras && cantcabras <= 50){
            System.out.println(cantcaballos + " " + cantburros + " " + cantcabras);
            System.out.print("\ntres");
        } else if(cantcabras > 50){
            System.out.println(cantcaballos + " " + cantburros + " " + cantcabras);
            System.out.print("\ncuatro");
        }
    }
    
}
