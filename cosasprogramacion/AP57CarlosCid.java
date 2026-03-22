import java.util.Arrays;
import java.util.Scanner;
public class AP57CarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[100];
        int cantidad = 0;
        System.out.println("Introduce tus números favoritos (escribe 'fin' para terminar):");
        while (sc.hasNextDouble()) {
            numeros[cantidad] = sc.nextDouble();
            cantidad++;
        }
        if (cantidad < 2) {
            System.out.println("Necesitas al menos dos números para calcular tu suerte.");
            return;
        }
        while (cantidad > 1) {
            Arrays.sort(numeros, 0, cantidad);
            System.out.print("Lista actual: [");
            for (int i = 0; i < cantidad; i++) {
                System.out.print(numeros[i]);
                if (i < cantidad - 1) System.out.print(", ");
            }
            System.out.println("]");
            double n1 = numeros[0];
            double n2 = numeros[1];
            double media = (n1 + n2) / 2.0;
            for (int i = 0; i < cantidad - 2; i++) {
                numeros[i] = numeros[i + 2];
            }
            numeros[cantidad - 2] = media;
            cantidad--;
            System.out.println("Eliminados: " + n1 + " y " + n2 + " -> Nueva media: " + media);
        }
        System.out.println("\n Tu número de la suerte es: " + numeros[0]);
    }
}