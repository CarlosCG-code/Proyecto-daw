import java.util.Scanner;
public class CuentaCorrientepruebaCarlosCid {
public static void main (String[] args){
    CuentaCorrienteCarlosCid c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca su DNI: ");
    String dni1 = sc.nextLine();
    System.out.print("Introduzca su nombre: ");
    String nom1 = sc.nextLine();
    // Creación del objeto CuentaCorriente con DNI y nombre
    c = new CuentaCorrienteCarlosCid(dni1, nom1);
    int para = 1;
    while (para == 1) {
        System.out.print("Desea ingresar o retirar? 1(ingresar), 2(retirar): ");
        int desea = sc.nextInt();
        if (desea == 1) {
            System.out.print("Cantidad que desea ingresar: ");
            int ingreso = sc.nextInt();
            // Ingreso del dinero
            c.ingreso(ingreso);
        } else {
            System.out.print("Cantidad que desea retirar: ");
            double retirada = sc.nextInt();
            // Intenta retirar y muestra si es posible
            boolean operacionPosible = c.egreso(retirada);
            System.out.println("Puedes sacarlo: " + operacionPosible);
        }
        System.out.print("Desea seguir operando en tu cuenta? 1 (si) 2(no)");
        para = sc.nextInt();
    }
    // Muestra por pantalla los datos actuales de la cuenta
    c.mostrarInformacion();
    sc.close();
}
}