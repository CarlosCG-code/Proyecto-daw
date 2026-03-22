package cosasprogramacion;
import java.util.Scanner;
public class minutosCarlosCid {
    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        int totalh1 = hora1 * 60 + minuto1;
        int totalh2 = hora2 * 60 + minuto2;
        if (totalh2 < totalh1) {
            totalh2 += 24 * 60;
        }
        return totalh2 - totalh1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera hora:");
        System.out.print("Hora: ");
        int h1 = sc.nextInt();
        System.out.print("Minutos: ");
        int m1 = sc.nextInt();
        System.out.println("Introduce la segunda hora:");
        System.out.print("Hora: ");
        int h2 = sc.nextInt();
        System.out.print("Minutos: ");
        int m2 = sc.nextInt();
        int diferencia = diferenciaMin(h1, m1, h2, m2);
        System.out.println("La diferencia en minutos es: " + diferencia);
    }
}