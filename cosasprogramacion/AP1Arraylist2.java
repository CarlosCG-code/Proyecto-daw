package cosasprogramacion;
import java.util.ArrayList;
import java.util.Scanner;
public class AP1Arraylist2 {
    public static ArrayList<Integer> metodo(ArrayList<Integer> lista){
        for(int i = lista.size() -1 ; i >= 0; i-- ){
            int numero = lista.get(i);
            if (numero % 2 != 0) {
                lista.remove(i);
            }
        }
        return lista;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int cantidad;
        System.out.println("Cuantos numeros quieres añadir: ");
        cantidad = sc.nextInt();
        for(int i = 0; i < cantidad; i++){
            System.out.println("Escribe el numero " + (i + 1) + " : ");
            int num = sc.nextInt();
            numeros.add(num);
        }
        metodo(numeros);
        System.out.println(numeros);
    }
}

