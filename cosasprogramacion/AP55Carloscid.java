package cosasprogramacion;

public class AP55Carloscid {
     public static int[] insertarOrdenado(int[] tabla, int nuevo) {
        int indiceInsercion = 0;
        while (indiceInsercion < tabla.length && tabla[indiceInsercion] < nuevo) {
            indiceInsercion++;
        }
        int[] copia = new int[tabla.length + 1];
        for (int i = 0; i < copia.length; i++) {
            if (i < indiceInsercion) {
                copia[i] = tabla[i];
            } else if (i == indiceInsercion) {
                copia[i] = nuevo;
            } else {
                copia[i] = tabla[i - 1];
            }
        }
        return copia;
    }
    public static void main(String[] args) {
        int[] tabla = {2, 4, 6, 7, 8};
        int nuevoValor = 5;
        tabla = insertarOrdenado(tabla, nuevoValor);
        for (int n : tabla) {
            System.out.print( n + " ");
        }
    }
}
