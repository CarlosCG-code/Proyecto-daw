package cosasprogramacion;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class AP1Arraylist3 {
    public static void programa(){
    ArrayList<Integer> lista = new ArrayList<>();
    Random r = new Random();
    for(int i = 0; i < 10; i++){
        lista.add(r.nextInt(100));
    }
    System.out.println("Lista con numeros random: " + lista);
    int maximo = Collections.max(lista);
    System.out.println("Máximo de la lista: " + maximo);
    int minimo = Collections.min(lista);
    System.out.println("Minimo de la lista: " + minimo);
    int suma = 0;
    for( int numero : lista){
        suma += numero;
    }
    double promedio = suma / lista.size();
    System.out.println("Suma total: " + suma);
    System.out.println("Promedio: " + promedio);
    }
    public static void main(String[] args) {
        programa();
    }
}
