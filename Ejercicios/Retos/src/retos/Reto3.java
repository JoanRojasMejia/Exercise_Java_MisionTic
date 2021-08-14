package retos;
import java.util.ArrayList;
import java.util.Scanner;

public class Reto3 {
        ArrayList<String> letras;
        ArrayList<Integer> contadores;
        public static void main(String[] args) {
        Reto3 listwor = new Reto3();
        listwor.letras = new ArrayList<>();
        listwor.contadores = new ArrayList<>();
        listwor.mostrarlista();
    }

    public void mostrarlista(){
        
        Scanner entrada = new Scanner (System.in);
        String[] ent1 = entrada.nextLine().split(" ");
        int cont = 1;
        entrada.close();
        
        for(int i = 0; i < ent1.length; i++){
            if(letras.isEmpty()) {
                letras.add(ent1[i]);
            } else if (letras.get(letras.size()-1).equals(ent1[i])){
                cont++;
            } else if (!letras.get(letras.size()-1).equals(ent1[i])){
                letras.add(ent1[i]);
                contadores.add(cont);
                cont = 1;
            }
        }

        contadores.add(cont);

        for(int i=0; i < letras.size(); i++) {
            System.out.print(letras.get(i) + " ");
        }
        System.out.print("\n");
        for(int i=0; i < contadores.size(); i++) {
            System.out.print(contadores.get(i) + " ");
        }
        
        // * letras.forEach(System.out::print);
        // * System.out.print("\n");
        // * contadores.forEach(System.out::print);
    }
}
