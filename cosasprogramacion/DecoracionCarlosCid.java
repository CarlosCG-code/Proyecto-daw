package cosasprogramacion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoracionCarlosCid {
    public List<String> colores;
    public DecoracionCarlosCid() {
        colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");
        colores.add("Naranja");
    }
    public void añadirColor(String color) {
        if (!colores.contains(color)) {
            colores.add(color);
        } else {
            System.out.println("El color '" + color + "' ya existe en la lista.");
        }
    }
    public String[] elegirColoresAlAzar(int n) {
        if (n > colores.size()) {
            System.out.println("No se pueden elegir " + n + " colores, solo hay " + colores.size() + " disponibles.");
        }
        if (n <= 0) {
            System.out.println("El número de colores debe ser mayor que 0.");
        }
        List<String> copia = new ArrayList<>(colores);
        Collections.shuffle(copia);

        String[] seleccion = new String[n];
        for (int i = 0; i < n; i++) {
            seleccion[i] = copia.get(i);
        }
        return seleccion;
    }
    public void mostrarColoresDisponibles() {
        System.out.println("Colores disponibles: " + colores);
    }
}
