import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entre 0 y 9999: ");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 9999) {
            System.out.println("El número se ha pasado del rango permitido.");
        } else {
            String cadena = Integer.toString(numero);
            String cadenaInvertida = new StringBuilder(cadena).reverse().toString();

            if (cadena.equals(cadenaInvertida)) {
                System.out.println("El número es capicua.");
            } else {
                System.out.println("El número no es capicua.");
            }
        }
        sc.close();
    }
}