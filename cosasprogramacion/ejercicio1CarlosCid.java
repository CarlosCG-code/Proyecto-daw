/*
Autor: Carlos Cid
Tarea examen
Algoritmo que solicita al usuario que introduzca su edad y calcule su año de nacimiento*/
package cosasprogramacion;
import java.util.Scanner;

public class ejercicio1CarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //uso el Scanner para poder recoger los datos del usuario
        System.out.print("Bienvenid@, introduce tu edad: ");
        int n = sc.nextInt();
        int calculo = 2025 - n;
        System.out.println("Carlos nació en el año " + calculo);
    }
}
