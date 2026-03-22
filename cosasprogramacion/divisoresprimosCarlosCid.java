package cosasprogramacion;
import java.util.Scanner;
public class divisoresprimosCarlosCid {
    static void divisoresPrimos(int n){
        for (int i = 1; i <= n; i++) {
            boolean esPrimo = true;
            if (i <= 1) {
                esPrimo = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo && n % i == 0) {
                System.out.println("Los divisores primos de tu número son: " + i);;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número n: ");
        int num = sc.nextInt();
        divisoresPrimos(num);
    }
}