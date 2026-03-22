public class CuentaCorrienteCarlosCid {
    String dni;
    public String nombre;
    private double saldo;
    CuentaCorrienteCarlosCid(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
    }
    CuentaCorrienteCarlosCid(String dni, double saldo){
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = "Sin asignar";
    }
    CuentaCorrienteCarlosCid(String dni, String nombre, double saldo){
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    boolean egreso(double cant){
        boolean operacionPosible;
        if (saldo >= cant) {
            saldo -= cant;
            operacionPosible= true;
        } else {
            System.out.println("No hay dinero suficiente.");
            operacionPosible = false;
        }
        return operacionPosible;
    }
    public void ingreso(double cant){
        saldo += cant;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Dni: " + dni);
        System.out.println("Saldo: " + saldo + " euros");
    }
}
