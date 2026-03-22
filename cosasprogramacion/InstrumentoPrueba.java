package cosasprogramacion;

public class InstrumentoPrueba {
    public static void main(String[] args) {
        Nota cancion[] = {Nota.DO, Nota.RE, Nota.MI, Nota.FA, Nota.SOL, Nota.LA, Nota.SI};
        Piano p = new Piano();
        for (Nota nota:cancion){
            p.add(nota);
        }
        p.interpretar();
    }
}
