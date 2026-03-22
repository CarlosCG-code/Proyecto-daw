import java.util.Scanner;
import java.util.Arrays;

public class AR58CarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de elementos (n): ");
        int n = sc.nextInt();
        int[] original = new int[n];
        System.out.println("Introduce " + n + " números enteros:");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }
        int countPares = 0;
        int countImpares = 0;
        for (int num : original) {
            if (num % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }
        int[] pares = new int[countPares];
        int[] impares = new int[countImpares];
        int indexPares = 0;
        int indexImpares = 0;
        for (int num : original) {
            if (num % 2 == 0) {
                pares[indexPares++] = num;
            } else {
                impares[indexImpares++] = num;
            }
        }
        Arrays.sort(pares);
        Arrays.sort(impares);
        System.out.println("Números pares ordenados:");
        for (int num : pares) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Números impares ordenados:");
        for (int num : impares) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
