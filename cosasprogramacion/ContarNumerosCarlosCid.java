import java.util.Scanner;

public class ContarNumerosCarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números (n): ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Media positivos: " + calcularMediaPositivos(numeros));
        System.out.println("Media negativos: " + calcularMediaNegativos(numeros));
        System.out.println("Cantidad de ceros: " + contarCeros(numeros));
        sc.close();
    }
    public static double calcularMediaPositivos(int[] arr) {
        int suma = 0;
        int contador = 0;
        for (int num : arr) {
            if (num > 0) {
                suma += num;
                contador++;
            }
        }
        return contador > 0 ? (double) suma / contador : 0;
    }
    public static double calcularMediaNegativos(int[] arr) {
        int suma = 0;
        int contador = 0;

        for (int num : arr) {
            if (num < 0) {
                suma += num;
                contador++;
            }
        }
        return contador > 0 ? (double) suma / contador : 0;
    }
    public static int contarCeros(int[] arr) {
        int contador = 0;
        for (int num : arr) {
            if (num == 0) {
                contador++;
            }
        }
        return contador;
    }
}

