package cosasprogramacion;
import java.util.Scanner;
public class AR67CarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, palabra;
        int veces = 0, pos;
        System.out.print("Introduzca la frase: ");
        frase = sc.nextLine();
        frase = frase.toLowerCase(); //recogemos la variable frase y la ponemos en minúscula para poder hacer bien el resultado
        System.out.print("Introduzca la palabra: ");
        palabra = sc.next();
        palabra = palabra.toLowerCase(); // recogemos la variable palabra y la ponemos en minúsucla para poder hacer bien el resultado 
        pos = frase.indexOf(palabra);
        while (pos != -1) { //si encuentra la palabra que sume 1 a veces y siga buscando la siguiente palabra
            veces++;
            pos = frase.indexOf(palabra, pos + 1);
        }
        if (veces == 0) {
            System.out.println("La palabra " + palabra + " no se encuentra en la frase.");
        } else {
            System.out.println("La palabra " + palabra + " está " + veces + " veces.");
        }
    }
}