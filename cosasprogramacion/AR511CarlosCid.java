package cosasprogramacion;

import java.util.Arrays;
import java.util.Scanner;

public class AR511CarlosCid {
    /*// El juego consiste en acertar la combinación secreta, que se genera de forma aleatoria. */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //longitud introducida desde teclado de la combinación secreta:
    int longitud = sc.nextInt();
    int combSecreta[] = new int [longitud]; //combinación secreta
    int combJugador[] = new int [longitud]; //combinación del jugador
    //generamos aleatoriamente la combinación secreta:
    generaCombinacion(combSecreta);
    //esto es trampa, mostramos la combinación secreta para facilitar
    System.out.println(Arrays.toString(combSecreta));
    System.out.println("Escribe una combinación");
    leeTabla(combJugador);
    while (!Arrays.equals(combSecreta, combJugador)) {//mientras no sean iguales
        mostraPistas(combSecreta, combJugador); //mostramos las pistas
        System.out.println("Escribe una combinación:");
        leeTabla(combJugador); //volvemos a pedir otra combinación
    } //Salir del while significa que hemos acertado la combinación secreta
    System.out.println("¡la cámara está abierta!");
}
/*//Esta función inicializa los valores de la tabla con valores aleatorios.
//La constante MAX determina el valor máximo que se asigna a un elemento,
//estando comprendido en el rango 1...MAX*/
static void generaCombinacion(int[] t) {
    final int MAX = 5; //rango 1..MAX
    for (int i=0; i < t.length; i++) {
        t[i] = (int) (Math.random()*MAX + 1); //número aleatorio de 1 a MAX
    } //t referencia a la tabla combSecreta del programa principal. Por este
    //motivo, asignar un valor a t[i] es lo mismo que hacerlo a
    //combSecreta[i]
}
//Recorre t y asigna a cada elemento un valor leído desde el teclado
static void leeTabla(int[] t) {
    Scanner sc = new Scanner(System.in);
    for (int i=0; i < t.length; i++) { //recorremos para leer
        t[i] = sc.nextInt();
    }
}
/*//Recorre las dos tablas, secret y jug, e indica para cada elemento de la
//combinación introducida por el usuario si es mayor, menor o igual que el
//equivalente en la combinación secreta*/
static void mostraPistas(int secret[], int jug[]) {
    System.out.println("Pistas:");
    for (int i=0; i < jug.length; i++) {//recorremos ambas tablas
        System.out.print(jug[i]);
        if (secret[i] > jug[i]) {//comparamos el i-ésimo elemento de ambas
            System.out.println(" mayor");
        } else if (secret[i] < jug[i]) {
            System.out.println(" menor");
        } else {
            System.out.println(" igual");
        }
    }
}
}