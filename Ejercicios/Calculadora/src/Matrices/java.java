
package Matrices;
import java.util.Scanner;

public class java {
    
    static int[][] matriz1 = null;
    static public Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        matriz1 = DefinirTamano(matriz1);
        System.out.println();
        IngresoValores(matriz1);
        System.out.println();
        Imprimir(matriz1);
        System.out.println();
        SumaDiagonales(matriz1);
    }
    
    public static int[][] DefinirTamano(int[][] x){
        System.out.println("Ingrese el numero de las filas: ");
        int filas = Integer.parseInt(sc.next());
        System.out.println("Ingrese el numero de las columnas: ");
        int columnas = Integer.parseInt(sc.next());
        x = new int[filas][columnas];
        return x;
    }
    
    public static void IngresoValores(int[][] x){
        System.out.println("Ingrese los valores de la matriz: ");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("Fila [" + i + "]" + ", Columna [" + j + "] : ");
                x[i][j] = Integer.parseInt(sc.next());
            }
        }
    }
    
    public static void Imprimir(int[][] x){
        System.out.println("Matriz: ");
        for (int[] x1 : x) {
            for (int j = 0; j < x1.length; j++) {
                System.out.print(x1[j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void SumaDiagonales(int[][] x){
        int[] devol = new int[2];
        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++) {
                if(i==j){
                    devol[0] += x[i][j];
                }
                if(i+j == (x.length - 1)){
                    devol[1] += x[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: " + Comparacion(devol[0]));
        System.out.println("La suma de la diagonal secundaria es: " + Comparacion(devol[1]));
    }
    
    public static String Comparacion(int x){
        return (x % 2 == 0) ? (x + " - Fizz") : (x + " - Buzz");
    }
    
}
