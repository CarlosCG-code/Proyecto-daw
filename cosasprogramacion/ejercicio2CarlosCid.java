/*
Autor: Carlos Cid
Tarea examen
Algoritmo que comprueba si un número, que se solicita al usuario, es par o impar.
En el caso de ser impar el algoritmo lo convierte a número par.
Al final el algoritmo indica por pantalla si el número introducido era par o impar y en el caso de ser impar muestra el número par inferior.*/
package cosasprogramacion;
import java.util.Scanner;

public class ejercicio2CarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //uso el Scanner para poder recoger los datos del usuario
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        if (n % 2 == 0) { //operacion para saber si el resto del numero entre dos es cero para saber si es par o no
            System.out.println("Tu numero es par.");
        } else{
            int c = n - 1; // si es impar le resto uno al numero inicial para tener el numero par inferior
            System.out.println("Carlos el numero " + n + " es impar. Numero par inferior " + c);
        }
    }
}
