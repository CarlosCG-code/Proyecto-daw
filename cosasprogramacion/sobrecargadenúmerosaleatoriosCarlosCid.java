package cosasprogramacion;
import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class sobrecargadenúmerosaleatoriosCarlosCid {
        public static void mostrarAleatorios(int cantidad, int min, int max) {
        Random r = new Random();
        for (int i = 0; i < cantidad; i++) {
            int numero = r.nextInt((max - min) + 1) + min;
            System.out.println(numero);
        }
    }
        public static void mostrarAleatorios(int cantidad) {
        Random rand = new Random();
        for (int i = 0; i < cantidad; i++) {
            double numero = rand.nextDouble();
            System.out.println(numero);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quieres elegir la cantidad solo o cantidad, maximo y minimo (1, 2): ");
        int cual = sc.nextInt();
        if (cual == 1) {
            System.out.print("¿Cuantos números random quieres? ");
            int cuantos = sc.nextInt();
            mostrarAleatorios(cuantos);
        } else if (cual == 2) {
            System.out.print("¿Cuantos números random quieres? ");
            int cuantos = sc.nextInt();
            System.out.print("¿Cuanto es el numero minimo? ");
            int minimo = sc.nextInt();
            System.out.print("¿Cuanto es el numero maximo? ");
            int maximo = sc.nextInt();
            mostrarAleatorios(cuantos, minimo, maximo);
        } else{
            System.out.println("Has introducido un numero no valido");
        }
    }
}