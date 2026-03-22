package cosasprogramacion;
import java.util.Scanner;
import java.util.Random;
public class numerosaleatoriosCarlosCid {
        public static void mostrarAleatorios(int cantidad, int min, int max) {
        Random r = new Random();
        for (int i = 0; i < cantidad; i++) {
            int numero = r.nextInt((max - min) + 1) + min;
            System.out.println(numero);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantos números random quieres? ");
        int cuantos = sc.nextInt();
        System.out.print("¿Cuanto es el numero minimo? ");
        int minimo = sc.nextInt();
        System.out.print("¿Cuanto es el numero maximo? ");
        int maximo = sc.nextInt();
        mostrarAleatorios(cuantos, minimo, maximo);
    }
}