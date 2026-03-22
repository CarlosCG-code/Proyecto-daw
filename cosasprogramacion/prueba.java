import java.util.Scanner;
public class prueba {
    static void areaVolumenCilindro(double radio, int opcion){
    double volumen, area;
    switch (opcion) {
        case 1 -> {
            volumen = (4 * Math.PI) / 3 * Math.pow(radio, 3);
            System.out.println("El volumen es de: " + volumen);
        }
        case 2 -> {
            area = 4 * Math.PI * Math.pow(radio, 2);
            System.out.println("El área es de: " + area);
        }
        default -> System.out.println("Indicador del cálculo erróneo");
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Introduzca radio: ");
        double radio = sc.nextDouble();
        System.out.print("Qué desea calcular (1 (volumen)/ 2 (area): ");
        int tipoCalculo = sc.nextInt();
        System.out.println();
        areaVolumenCilindro(radio, tipoCalculo);
    }
}
          

