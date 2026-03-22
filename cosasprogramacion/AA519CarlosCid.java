package cosasprogramacion;

import java.util.ArrayList;
import java.util.Scanner;

public class AA519CarlosCid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ranking = new ArrayList<>();
        System.out.println("Introduce los dorsales según llegan a meta (-1 para terminar):");
        int dorsal = sc.nextInt();
        while (dorsal != -1) {
            ranking.add(dorsal);
            dorsal = sc.nextInt();
        }
        System.out.println("\nIntroduce dorsales de menores de edad (-1 para terminar):");
        dorsal = sc.nextInt();
        while (dorsal != -1) {
            int posicion = ranking.indexOf(dorsal);
            if (posicion > 0) {
                int temp = ranking.get(posicion - 1);
                ranking.set(posicion - 1, dorsal);
                ranking.set(posicion, temp);
            }
            dorsal = sc.nextInt();
        }
        System.out.println("\nIntroduce dorsales positivos en dopaje (-1 para terminar):");
        dorsal = sc.nextInt();
        while (dorsal != -1) {
            ranking.remove((Integer) dorsal);
            dorsal = sc.nextInt();
        }
        System.out.println("\nIntroduce dorsales por falta de pago (-1 para terminar):");
        dorsal = sc.nextInt();
        while (dorsal != -1) {
            if (ranking.contains(dorsal)) {
                ranking.remove((Integer) dorsal);
                ranking.add(dorsal);
            }
            dorsal = sc.nextInt();
        }
        System.out.println("\nRanking final:");
        for (int i = 0; i < ranking.size(); i++) {
            System.out.println((i + 1) + "º puesto: dorsal " + ranking.get(i));
        }
        System.out.println("\nMEDALLISTAS:");
        if (ranking.size() >= 1)
            System.out.println("Oro: dorsal " + ranking.get(0));
        if (ranking.size() >= 2)
            System.out.println("Plata: dorsal " + ranking.get(1));
        if (ranking.size() >= 3)
            System.out.println("Bronce: dorsal " + ranking.get(2)); 
    }
}