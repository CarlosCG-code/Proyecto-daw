package cosasprogramacion;
import java.util.ArrayList;
public class ejemplo6 {

public static void main(String[] args) {
ArrayList<Integer> notas = new ArrayList<>();
// Añadir elementos
notas.add(85);
notas.add(92);
notas.add(78);
// Recorrer la lista con un for
System.out.println("Notas registradas:");
for (Integer nota : notas) {
System.out.println("- " + nota);
}
// Acceso rápido
System.out.println("La primera nota es: " + notas.get(0));
}
}

