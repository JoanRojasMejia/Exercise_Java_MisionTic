package maletinesxd;
import java.util.Scanner;
import java.util.ArrayList;

public class Inventario {
    
    static ArrayList<Maleta> maletaGeneral = new ArrayList();
    
    public static void procesarComandos(String[] entradas){
        int opcion = Integer.parseInt(entradas[0]);

        switch(opcion){
            case 1 -> {  
                if (entradas[1].equals("Viaje")){
                    Viaje maletaViaje= new Viaje(entradas[2],Integer.parseInt(entradas[3]),Integer.parseInt(entradas[4]),Integer.parseInt(entradas[5]));
                    maletaGeneral.add(maletaViaje);                 
                }else{
                    Trabajo maletaTrabajo = new Trabajo(entradas[2],Integer.parseInt(entradas[3]),Integer.parseInt(entradas[4]),entradas[5]);
                    maletaGeneral.add(maletaTrabajo);              
                }
            }
            case 2 -> { 
                System.out.println("***Inventario de maletas***");
                for (int i = 0; i < maletaGeneral.size(); i++) {
                    System.out.println("\tMaleta " + maletaGeneral.get(i).enviarCosa()[0] + " - Nombre:" + maletaGeneral.get(i).nombre);
                    System.out.println("\tcapacidad:" + maletaGeneral.get(i).capacidad);
                    System.out.println("\tbolsillos:" + maletaGeneral.get(i).bolsillos);
                    System.out.println("\t"+ maletaGeneral.get(i).enviarCosa()[2] + ":" + maletaGeneral.get(i).enviarCosa()[1]);
                }
            }
            default -> System.out.println("Opción no válida");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada;   
        
        do { 
           entrada = sc.nextLine().split("/");
           procesarComandos(entrada);  
        } while (Integer.parseInt(entrada[0]) != 3);
    }
    
}
