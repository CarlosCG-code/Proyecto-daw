public class CajasCarlosCid {
    int ancho;
    int alto;
    int fondo;
    String unidad;
    String etiqueta;
    public CajasCarlosCid(int ancho, int alto, int fondo, String unidad){
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
        this.etiqueta = "";
    }
    double getvolumen(){
        double anchod = ancho;
        double altod = alto;
        double fondod = fondo;
        if (unidad.equals("CM")) {
            anchod /= 100;
            altod /= 100;
            fondod /= 100;
        }
        return anchod * altod * fondod;
    }
    void setEtiqueta(String etiqueta){
        System.out.println("");
    }
    public String toString(){
        return "Caja de " + ancho + "x" + alto + "x" + fondo + " " + unidad + " con etiqueta: " + etiqueta;
    };
}
