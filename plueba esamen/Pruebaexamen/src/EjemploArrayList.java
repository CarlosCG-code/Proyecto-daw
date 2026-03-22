import java.util.ArrayList;
public class EjemploArrayList {
public static void main(String[] args) {
ArrayList<Integer> notas = new ArrayList<>();
String[] culo = new String[3];
// Añadir elementos
notas.add(85);
notas.add(92);
notas.add(78);
// Recorrer la lista con un for
System.out.println("Notas registradas:");
for (int nota : notas) {
System.out.println("- " + nota);
}
// Acceso rápido
System.out.println("La primera nota es: " + notas.get(0));
}
}
