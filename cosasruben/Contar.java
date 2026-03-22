package cosasruben;
import java.util.Scanner;
public class Contar {
	 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String frase;
     System.out.print("Introduce una frase: ");
     frase = sc.nextLine();
     System.out.println("Número de palabras: " + contarPalabras(frase));                                             
  }
	//Método que recibe un String y devuelve el número de palabras que contiene
	public static int contarPalabras(String s) {
	int contador = 0, n = 0;
	String palabra="";
                     
	if (s.isEmpty()) { //si la cadena está vacía
	    contador = 0;
	} else {
	        while (n < s.length()) {   
	             if  (Character.isLetter(s.charAt(n)) || Character.isDigit(s.charAt(n))) { 
	            	 	palabra += s.charAt(n);  
	            	 } else if ((s.charAt(n) ==' ') || ((s.charAt(n) ==',')) || (s.charAt(n) =='.') || (s.charAt(n) ==';') || (s.charAt(n) ==':') || (s.charAt(n) ==')' || (s.charAt(n) =='('))) {
	            		 if (palabra.length()>0) {
	            			 contador ++;
	            			 palabra="";
	            		 }
	            	 }
	             n++;
	             }
	}
	if (palabra.length()>0) contador++; 
	return contador;
	}
}