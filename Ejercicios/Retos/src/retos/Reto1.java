package retos;
import java.util.Scanner;

public class Reto1 {

    public static void main(String[] args) {
        
//        Scanner entrada = new Scanner (System.in);
//        int cantcaballos = entrada.nextInt();
//        entrada.close();
//        int cantburros = (cantcaballos * 2) + 4;
//        int cantcabras = (cantcaballos + cantburros) / 5;
//
//        if(0 < cantcabras && cantcabras <= 20){
//            System.out.println(cantcaballos + " " + cantburros + " " + cantcabras);
//            System.out.print("\nuno");
//        } else if(20 < cantcabras && cantcabras <= 30){
//            System.out.println(cantcaballos + " " + cantburros + " " + cantcabras);
//            System.out.print("\ndos");
//        } else if(30 < cantcabras && cantcabras <= 50){
//            System.out.println(cantcaballos + " " + cantburros + " " + cantcabras);
//            System.out.print("tres");
//        } else if(cantcabras > 50){
//            System.out.println(cantcaballos + " " + cantburros + " " + cantcabras);
//            System.out.print("cuatro");
//        }
        System.out.println(invertir(123456789));
           
    }
    public static int invertir(int n) {
        int num = 0;
        while(n > 0) {
            num = num * 10 + n % 10;
            n /= 10;
        }
        return num;
    }
}
