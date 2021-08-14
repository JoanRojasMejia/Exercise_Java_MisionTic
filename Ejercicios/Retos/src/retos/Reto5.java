
package retos;
import java.util.ArrayList;

public class Reto5 {
    public static void main(String[] args) {

        Reto5 lista = new Reto5();
        
        // String eti[] = {"verde", "verde", "amarillo", "rojo", "verde", "amarillo", "rojo", 
        // "amarillo", "rojo", "verde"};

        // lista.parti = new ArrayList<String>();

        ArrayList<String> colors = new ArrayList<>();
            colors.add("verde");
            colors.add("verde");
            colors.add("amarillo");
            colors.add("rojo");
            colors.add("verde");
            colors.add("amarillo");
            colors.add("rojo");
            colors.add("amarillo");
            colors.add("rojo");
            colors.add("verde");
        
        ArrayList<Integer> posici = new ArrayList<>();
            posici.add(0);
            posici.add(3);
            posici.add(4);
            posici.add(2);
            posici.add(1);
            posici.add(5);
            posici.add(6);
            posici.add(8);
            posici.add(11);
        
        ArrayList<String> merca = new ArrayList<>();
            merca.add("arroz");
            merca.add("sal");
            merca.add("miel");
            merca.add("lentejas");
            merca.add("frijol");
            merca.add("leche");
            merca.add("lentejas");
            merca.add("arroz");
            merca.add("miel");
            merca.add("sal");
            merca.add("banano");
            merca.add("arroz");

        String ele = "arroz";

        ArrayList<String> merca_1 = new ArrayList<>();
            merca_1.add("arroz");
            merca_1.add("sal");
            merca_1.add("miel");
            merca_1.add("lentejas");
            merca_1.add("banano");
            merca_1.add("frijol");

        ArrayList<String> merca_2 = new ArrayList<>();
            merca_2.add("sal");
            merca_2.add("miel");
            merca_2.add("ajo");
            merca_2.add("frijol");
            merca_2.add("leche");

        ArrayList<String> merca_3 = new ArrayList<>();
            merca_3.add("arroz");
            merca_3.add("sal");
            merca_3.add("miel");
            merca_3.add("lentejas");
            merca_3.add("banano");
            merca_3.add("frijol");
            merca_3.add("papa");
            merca_3.add("cebolla");
            merca_3.add("aceite");

        ArrayList<String> merca_4 = new ArrayList<>();
            merca_4.add("sal");
            merca_4.add("miel");
            merca_4.add("ajo");
            merca_4.add("frijol");
            merca_4.add("leche");
            merca_4.add("garbanzo");
            merca_4.add("lechuga");
            merca_4.add("papa");
        
        lista.mostrar(lista.eliminarduplicados(colors));
        System.out.print("\n");
        lista.mostrar_int(lista.posiciones_faltantes(posici, merca, ele));
        System.out.print("\n");
        lista.mostrar(lista.encontrar_faltantes(merca_1, merca_2));
        System.out.print("\n");
        System.out.print(lista.obtener_intercambiables(merca_3, merca_4));
        // lista.etiquetas(eti);

    }

    public ArrayList<String> eliminarduplicados(ArrayList<String> colores){

        ArrayList<String> newList = new ArrayList<>();
            
        for (String color : colores) {
            if (!newList.contains(color)) {
                newList.add(color);
            }
        }
        return newList;
        
        //* Esta puede ser una solucion del metodo 
        // for (int i=0; i < arr.length; i++){
        //     for (int j=0; j < (arr.length - 1); j++){
        //         if(i != j){
        //             if ( arr[i].equals( arr[j] )){
        //                 arr[j] = "";
        //             }
        //         }
        //     }
        // }

        // for (int i = 0; i < arr.length; i++){
        //     if (arr[i] != ""){
        //         System.out.print(arr[i]+" ");
        //     }
        // }
    }

    public void mostrar(ArrayList<String> lista){
        lista.forEach(elemento -> {
            System.out.print(elemento + " ");
        });
    }

    public void mostrar_int(ArrayList<Integer> lista){ 
        lista.forEach(elemento -> {
            System.out.print(elemento + " ");
        });
    }

    public ArrayList<Integer> posiciones_faltantes(ArrayList<Integer> posiciones, ArrayList<String> faltantes, String elemento){
        
        ArrayList<Integer> pos = new ArrayList<>();

        for (int posi : posiciones){
            if(elemento.equals(faltantes.get(posi))){
                pos.add(posi);
            }
        }

        return pos;
    }

    public ArrayList<String> encontrar_faltantes(ArrayList<String> sobrantes, ArrayList<String> mios){

        ArrayList<String> listfalta = new ArrayList<>();

        for(String producto: sobrantes){
            if(!mios.contains(producto)){
                listfalta.add(producto);
            }
        }

        return listfalta;
    }

    public int obtener_intercambiables(ArrayList<String> l_sobrantes, ArrayList<String> l_mios){

        ArrayList<String> listaO= new ArrayList<>();
        ArrayList<String> listM= new ArrayList<>();

        listaO = encontrar_faltantes(l_sobrantes, l_mios);
        listM = encontrar_faltantes(l_mios, l_sobrantes);

        return listaO.size() > listM.size() ? listM.size():listaO.size();
    }
}
