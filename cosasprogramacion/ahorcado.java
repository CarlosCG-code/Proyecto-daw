package cosasprogramacion;
import java.util.ArrayList;
import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentosMaximos = 7;
        int intentosFallidos = 0;
        ArrayList letrasAdivinadas = new ArrayList<>();
        System.out.println("--- Juego del Ahorcado ---");
        // Jugador A introduce la palabra
        System.out.print("Jugador A. Escriba una palabra: ");
        String palabraSecreta = scanner.nextLine().toLowerCase();
        // Configurar la palabra oculta inicial (guiones)
        StringBuilder palabraOculta = new StringBuilder();
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraOculta.append("-");
        }
        // Bucle principal del juego (Jugador B)
        while (intentosFallidos < intentosMaximos && palabraOculta.toString().contains("-")) {
            System.out.println("Intentos restantes: " + (intentosMaximos - intentosFallidos));
            System.out.println("Palabra: " + palabraOculta);
            System.out.print("Jugador B. Letra: ");
            char letra = scanner.next().toLowerCase().charAt(0);
            // Verificar si la letra ya se intentó
            if (letrasAdivinadas.contains(letra)) {
                System.out.println("Ya has probado esa letra.");
                continue;
            }
            letrasAdivinadas.add(letra);
            // Comprobar si la letra está en la palabra secreta
            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraOculta.setCharAt(i, letra);
                    acierto = true;
                }
            }
            if (!acierto) {
                intentosFallidos++;
                System.out.println("Letra incorrecta.");
            } else {
                System.out.println("¡Acierto!");
            }
        }
        // Lógica de fin del juego
        if (!palabraOculta.toString().contains("-")) {
            System.out.println("¡Felicidades, Jugador B! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("Jugador B agotó los intentos. Gana el Jugador A.");
            System.out.println("La palabra secreta era: " + palabraSecreta);
        }
    }
}
