package cosasprogramacion;
import java.util.Scanner;
import java.util.ArrayList;

public class AP1Arraylist1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int numero;
        System.out.println("Introduce un numero positivo (negativo para terminar)");
        do {
            numero = sc.nextInt();
            if (numero > 0) {
                lista.add(numero);
            }
        } while(numero > 0);{
            System.out.println("Lista completa: " + lista);
            System.out.println("Tamaño de la lista: " + lista.size());
        }
    }
}