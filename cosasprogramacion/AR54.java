package cosasprogramacion;

public class AR54 {
    static int maximo(int t[]){
        int max = t[0];
        for (int e : t) {
            if (e > max) {
                max = e;
            }
        }
        return(max);
    }
}