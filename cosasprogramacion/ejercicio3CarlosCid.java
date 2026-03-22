/*
Autor: Carlos Cid
Tarea examen
Algoritmo que pide la edad y el nombre de usuario y muestra "Acceso concedido" o "Acceso denegado". Teniendo en cuenta que el usuario sólo puede acceder si es mayor de 18 años y su nombre de usuario es "admin" o "Carlos"*/
package cosasprogramacion;
import java.util.Scanner;

public class ejercicio3CarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //uso el Scanner para poder recoger los datos del usuario
        System.out.print("Introduce tu nombre de usuario: ");
        String nombre = sc.nextLine(); // declaro nombre como cadena de texto
        if (nombre.equals("Carlos") || nombre.equals("admin")) { //utilizo equals para decir que si la variable nombre es igual a Carlos o admin haga lo de dentro del if
            System.out.println("Acceso concedido " + nombre);
        } else{
            System.out.print("Introduce tu edad en años: ");
            int años = sc.nextInt();
            if (años < 18) {
                System.out.println("Acceso denegado " + nombre);
            } else{
                System.out.println("Acceso concedido " + nombre);
            }
        }
    }
}
