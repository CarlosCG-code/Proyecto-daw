/*
Autor: Carlos Cid
Tarea examen
Algoritmo que pide por teclado la hora, minutos y segundos, así como cuántos segundos se desea incrementar la hora introducida.
El algoritmo mostrará la nueva hora.*/
package cosasprogramacion;
import java.util.Scanner;

public class ejercicio5CarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //uso el Scanner para poder recoger los datos del usuario
        System.out.print("Hora: ");
        int hora = sc.nextInt();
        System.out.print("Minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Segundos: ");
        int segundos = sc.nextInt();
        System.out.print("Cuantos segundos desea adelantar el reloj: ");
        int masseg = sc.nextInt();
        int calculo = segundos + masseg;
        if (calculo >= 60) { //if que hace que si los segundos pasan a ser 60 se cambie a 0 y se añada un minuto más
            calculo = calculo - 60;
            minutos++;
        }
        if (minutos >= 60) { //if que hace que si los minutos pasan a ser 60 se cambie a 0 y se añada una hora más
            minutos = minutos - 60;
            hora++;
        }
        if (hora >= 24) { //if que hace que si las horas pasan a ser 24 se cambie a 0 y se cambien los minutos y segundos a cero más los que querías sumar
            hora = hora - 24;
            minutos = minutos - 59;
            masseg = masseg - 59;
        }
        System.out.println("Carlos, la nueva hora será: " + hora + ":" + minutos + ":" + calculo + ".");
    }
}