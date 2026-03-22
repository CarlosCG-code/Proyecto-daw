package cosasprogramacion;
import java.util.Scanner;
import java.util.Arrays;
public class AA514SueldosCarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sueldos = new double[10];
        for (int i = 0; i < 10; i++){
            System.out.print("Escriba su sueldo: ");
            sueldos[i] = sc.nextDouble();
        }
        Arrays.sort(sueldos);
        double suma = 0;
        for (int i = 9; i >= 0; i--){
            System.out.println(sueldos[i]);
            suma = suma + sueldos[i];
        }
        double min = sueldos[0];
        double max = sueldos[9];
        double media = suma / 10;
        System.out.println("Sueldo minimo: " + min);
        System.out.println("Sueldo máximo: " + max);
        System.out.println("Media de sueldos: " + media);
    }
}