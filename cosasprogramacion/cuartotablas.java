package cosasprogramacion;
import java.util.Arrays;
import java.util.Scanner;
public class cuartotablas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t[] = new double [5];
        for (int i = 0; i < 5; i++) { //recorremos para leer lo valores
            System.out.print ("Introduzca un número: ");
            t[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(t));
        
    }
}
