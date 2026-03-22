import java.util.Scanner;

public class CajamainCarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la unidad de la caja: (CM/M)");
        String unidad = sc.nextLine();
        System.out.println("Introduce el ancho de la caja: ");
        int ancho = sc.nextInt();
        System.out.println("Introduce el alto de la caja: ");
        int alto = sc.nextInt();
        System.out.println("Introduce el fondo de la caja: ");
        int fondo = sc.nextInt();
        CajasCarlosCid c = new CajasCarlosCid(ancho, alto, fondo, unidad);
        System.out.println(c.getvolumen());
        System.out.println(c);
        sc.close();
    }
}
