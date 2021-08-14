package retos;
import java.util.Scanner;

public class Reto2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        char[] PR1 = entrada.nextLine().toCharArray();
        char[] PR2 = entrada.nextLine().toCharArray();
        char[] ent1 = entrada.nextLine().toCharArray();
        int cont = 0, cont2 = 0;
        entrada.close();
        
        for(int i = 0; i < ent1.length; i++){
            for (int j = 0; j < PR1.length; j++){
                if (ent1[i] == PR1[j]){
                    cont++;
                }
                if (ent1[i] == PR2[j]){
                    cont2++;
                }
            }
            if (cont > cont2){
                System.out.print("J");
            } else if (cont < cont2){
                System.out.print("K");
            } else if (cont == cont2){
                System.out.print("L");
            }
        }
    }
}
