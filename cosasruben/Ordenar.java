package cosasruben;
import java.util.Scanner;
import java.lang.String;
public class Ordenar {
	public static void main(String[] args) {
		String[] strAr1=new String[10];
		Scanner sc = new Scanner(System.in);
	     String frase;
	     System.out.print("Introduce una frase: ");
	     frase = sc.nextLine();
	     strAr1=CargarPalabras(frase);
	     //Mostrar array
		System.out.println("El Array de palabras SIN ordenar es : ");

	     ShowArray(strAr1);
	     //Ordenar - usamos compareTo()
	     OrdenaArray(strAr1);
	     //Volver a mostrar
		System.out.println("El Array de palabras ORDENADO es : ");

	     ShowArray(strAr1);
	  }
		//Método que recibe un String y devuelve un array de palabras
		public static String[] CargarPalabras(String s) {
		int i = 0, n=0;
		String palabra;
		String[] str=new String[10];
                        
		if (!s.isEmpty()) { //si la cadena está vacía
		    
			//Pasar a minúsculas la frase
			s.toLowerCase();
		    while (n < s.length()) {   
		             if  (Character.isLetter(s.charAt(n))) { 
		            	 	palabra = s.charAt(n);  
		            	 } else if ((s.charAt(n) ==' ') || ((s.charAt(n) ==',')) || (s.charAt(n) =='.') || (s.charAt(n) ==';') || (s.charAt(n) ==':') || (s.charAt(n) ==')' || (s.charAt(n) =='('))) {
		            	if (palabra.length()< 0) {
		            		//Guardar la palabra
		            		str[i-1]=palabra;
		            		i++;
		            		palabra="";
		            		 }
		            	 }  
		             n++;
		             }
		            
		}
		if (palabra.length()>0) //Guardar palabra 		            		
			str[i-1]=palabra;

		
		return str;
	}

		//Metodo que recorre el array de strings
		public static void ShowArray(String [] a ) {
			for (int x=0; x<a.length; x++){
				
					System.out.println(a[x]);
				
		}
}
		
		
		//Metodo que ordena el array de strings
				public static void OrdenaArray(String [] a ) {
				String aux; 
					for (int x = 1; x < a.length-1; x++) {
					        // Aquí "y" se detiene antes de llegar
					        // a length - 1 porque dentro del for, accedemos
					        // al siguiente elemento con el índice actual + 1
					        for (int y = 0; y < a.length - 2; y++) {
					           if (a[y]!=null) {
					            if ((a[y+1].compareTo(a[y]))>0) {
					                // Intercambiar
					                aux=a[y];
							a[y]=a[y+1];
							a[y+1]=aux;
					            }
					        }
					        }
					    }
		}
}
