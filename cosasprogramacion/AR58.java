package cosasprogramacion;
import java.util.Scanner;
import java.util.Arrays;

public class AR58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datos[];
        int par[] = new int[0];
        int impar[] = new int[0];
        System.out.print("Escriba n: ");
        int n = sc.nextInt();
        datos = new int[n];
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Introduzca un número: ");
            datos[i] = sc.nextInt();
        }
        for (int numero : datos) {
            if (numero % 2 == 0) {
                par = Arrays.copyOf(par, par.length + 1);
                par[par.length - 1] = numero;
            } else {
                impar = Arrays.copyOf(impar, impar.length + 1);
                impar[impar.length - 1] = numero;
            }
        }
        System.out.println("Pares: " + Arrays.toString(par));
        System.out.println("Impares: " + Arrays.toString(impar));
    }
}