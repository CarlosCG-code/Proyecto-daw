package cosasruben;
import java.util.Scanner;
public class contarpalabras {
    class Debug1 {
        public static int cuentaPalabras(String s){
        int conteoPalabras = 0;
        boolean palabra = false;
        int finDeLinea = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
        if (Character.isLetter(s.charAt(i)) && i != finDeLinea) {
        palabra = true;
        } else if (!Character.isLetter(s.charAt(i)) && palabra) {
        conteoPalabras++;
        palabra = false;
        } else if (Character.isLetter(s.charAt(i)) && i == finDeLinea) {
        conteoPalabras++;
        }
        }
        return conteoPalabras;
        }
        public static void main(String[] args) {
        System.out.println("Palabras : " + cuentaPalabras("Hola a todos  a a pedo..."));
        }
    }
}
