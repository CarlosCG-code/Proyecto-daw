package cosasprogramacion;

import java.util.Scanner;


public class cinco_tres_resuelto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int cuantosNumeros = sc.nextInt();

        int t[] = new int[cuantosNumeros]; // tabla con longitud adecuada

        for (int i = 0; i < t.length; i++) {
            System.out.print("Introduzca un número: ");
            t[i] = sc.nextInt();
        }

        System.out.println("Los números en orden inverso son: ");
        for (int e = t.length - 1; e >= 0; e--) {
            System.out.println(t[e]);
        }

        sc.close();
    }
}