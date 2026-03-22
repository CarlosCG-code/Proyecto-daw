package cosasprogramacion;

import java.util.Arrays;

public class AR10CarlosCid {
    static int[] sinMayores(int t[], int valor) {
    int copia[] = Arrays.copyOf(t, t.length);
    int i = 0;
    while (i < copia.length) {
        if (copia[i] > valor) {
            copia[i] = copia[copia.length - 1];
            copia = Arrays.copyOf(copia, copia.length - 1);
        } else {
            i++;
        }
    }
    return copia;
    }
    public static void main(String[] args) {
        int[] miArray = {10, 2, 4, 5, 35};
        int mivalor = 4;
        int[] resultado = sinMayores(miArray, mivalor);
    }
}
