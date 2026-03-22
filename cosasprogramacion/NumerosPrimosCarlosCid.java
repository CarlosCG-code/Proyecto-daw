import java.util.Scanner;
public class NumerosPrimosCarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        int contadorPrimos = 0;
        for (int i = 1; i <= n; i++) {
            boolean esPrimo = true;
            if (i <= 1) {
                esPrimo = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                contadorPrimos++;
                System.out.println(i + " es un número primo.");
            } else {
                System.out.println(i + " no es un número primo.");
            }
        }

        System.out.println("Hay " + contadorPrimos + " números primos entre 1 y " + n);
    }
}