package cosasprogramacion;

import java.util.Scanner;

public class analisisnumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce cuántos números vas a teclear: ");
        int n = sc.nextInt();

        int[] numeros = leerNumeros(n, sc);

        System.out.println("\n----- RESULTADOS -----");
        System.out.println("Media de positivos: " + mediaPositivos(numeros));
        System.out.println("Media de negativos: " + mediaNegativos(numeros));
        System.out.println("Cantidad de ceros: " + contarCeros(numeros));

        sc.close();
    }

    // ------------------------ FUNCIONES ------------------------

    // Lee n números y los almacena en un array
    public static int[] leerNumeros(int n, Scanner sc) {
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce un número: ");
            t[i] = sc.nextInt();
        }
        return t;
    }

    // Calcula la media de los números positivos
    public static double mediaPositivos(int[] t) {
        int contador = 0;
        double suma = 0;

        for (int num : t) {
            if (num > 0) {
                suma += num;
                contador++;
            }
        }

        if (contador == 0)
            return 0;  // No hay positivos

        return suma / contador;
    }

    // Calcula la media de los números negativos
    public static double mediaNegativos(int[] t) {
        int contador = 0;
        double suma = 0;

        for (int num : t) {
            if (num < 0) {
                suma += num;
                contador++;
            }
        }

        if (contador == 0)
            return 0; // No hay negativos

        return suma / contador;
    }

    // Cuenta los ceros del array
    public static int contarCeros(int[] t) {
        int ceros = 0;
        for (int num : t) {
            if (num == 0) {
                ceros++;
            }
        }
        return ceros;
    }
}
