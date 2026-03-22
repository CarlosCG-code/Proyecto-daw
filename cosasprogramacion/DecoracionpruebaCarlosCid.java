package cosasprogramacion;

public class DecoracionpruebaCarlosCid {
        public static void main(String[] args) {
        DecoracionCarlosCid c = new DecoracionCarlosCid();

        // Añadimos colores extra
        c.añadirColor("Coral");
        c.añadirColor("Menta");
        c.añadirColor("Azul");

        c.mostrarColoresDisponibles();

        // Elegimos 5 colores al azar
        System.out.println("Paleta elegida al azar:");
        String[] seleccion = c.elegirColoresAlAzar(5);
        for (int i = 0; i < seleccion.length; i++) {
            System.out.println("  Color " + (i + 1) + ": " + seleccion[i]);
        }
    }
}
