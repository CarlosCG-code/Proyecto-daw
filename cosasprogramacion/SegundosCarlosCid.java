package cosasprogramacion;
import java.util.Scanner;
public class SegundosCarlosCid {
    static void fsegundos(int dia, int hora, int minuto){
        dia = dia * 86400;
        hora = hora * 3600;
        minuto = minuto * 60;
        int t = dia + hora + minuto;
        System.out.println("Lo que has solicitado en segundos son: " + t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa para calcular dias/horas/minutos en segundos");
        System.out.print("Dame tus días: ");
        int dias = sc.nextInt();
        System.out.print("Dame tus horas: ");
        int horas = sc.nextInt();
        System.out.print("Dame tus minutos: ");
        int minutos = sc.nextInt();
        fsegundos(dias, horas, minutos);
    }
}
