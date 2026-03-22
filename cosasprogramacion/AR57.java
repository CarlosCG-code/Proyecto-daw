package cosasprogramacion;
import java.util.Arrays;
public class AR57 {
    static boolean buscar(int[] array, int elemento) {
    for (int i : array) {
        if (i == elemento) {
            return true;
        }
    }
    return false; 
}
    static int[] sinRepetidos(int [] t) {
int temporal[] = new int [0]; 

        for (int elemento : t){
            if (!buscar(temporal, elemento)) {
                temporal = Arrays.copyOf(temporal, temporal.length + 1);
                temporal [temporal.length - 1] = elemento; 
            }
        }
        return temporal;
    }
}