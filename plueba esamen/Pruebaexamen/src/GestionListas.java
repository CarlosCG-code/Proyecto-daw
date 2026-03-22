import java.util.ArrayList;
import java.util.Collections;
public class GestionListas {
public static void main(String[] args) {
// 1. Inicialización con números aleatorios
ArrayList<Integer> original = new ArrayList<>();
for (int i = 0; i < 5; i++) {
original.add((int) (Math.random() * 100) + 1);
}
for (int i = 0; i < original.size(); i++) {
System.out.println("Posición " + i + ": " + original.get(i));
}
// también podríamos utilizar: System.out.println("1. Original: " + original);
// 2. Inserción en la segunda posición (índice 1)
original.add(1, 99);
System.out.println("2. Tras insertar 99: " + original);
// 3. Ordenación
Collections.sort(original);
System.out.println("3. Ordenada: " + original);
// 4. Copia y eliminación del último
ArrayList<Integer> copia = new ArrayList<>(original);
copia.remove(copia.size() - 1);
System.out.println("4. Copia (sin el último): " + copia);
System.out.println("Original sigue igual: " + original);
// 5. Comparación
System.out.println("5. ¿Son iguales?: " + original.equals(copia));
}
}