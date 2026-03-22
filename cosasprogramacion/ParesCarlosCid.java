import java.util.Scanner;

public class ParesCarlosCid {

    public static void muestraPares(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(i * 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Cuantos numero pares quieres: ");
        int num = sc.nextInt();
        muestraPares(num);
    }
}