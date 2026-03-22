package cosasprogramacion;

import java.util.Arrays;

public class AP56CarlosCid {
    public static void main(String[] args) {
        int[] tabla = {10, 20, 30, 40, 50};
        int n = tabla.length;
        int aBorrar = 30;
        int indiceBorrado = Arrays.binarySearch(tabla, 0, n, aBorrar);
        if (indiceBorrado >= 0) {
            for (int i = indiceBorrado; i < n - 1; i++) {
                tabla[i] = tabla[i + 1];
            }
            tabla[n - 1] = 0; 
            n--;
            System.out.println("Elemento borrado. Nueva tabla: " + Arrays.toString(tabla));
        } else {
            System.out.println("El elemento no se encuentra en la tabla.");
        }
    }
}
