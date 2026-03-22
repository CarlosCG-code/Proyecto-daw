/*
Autor: Carlos Cid
Tarea examen
Algoritmo que pide un número al usuario y muestra por pantalla un texto repetido tantas veces como indica el número introducido*/
package cosasprogramacion;
import java.util.Scanner;

public class ejercicio4CarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //uso el Scanner para poder recoger los datos del usuario
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { //bucle que se repite el número de veces que le hemos solicitado
            System.out.println("Soy Carlos");
        }
    }
}
