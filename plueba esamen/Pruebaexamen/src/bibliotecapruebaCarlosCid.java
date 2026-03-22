
import java.util.Scanner;
import java.util.ArrayList;

public class bibliotecapruebaCarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bibliotecaCarlosCid b = new bibliotecaCarlosCid("El lazarillo", "Asier"); //llamamos al objeto con sus parámetros
        ArrayList<bibliotecaCarlosCid> biblioteca = new ArrayList<>();
        System.out.println("1.Agregar libro \n 2.Mostrar todos los libros: \n 3.Prestar libro \n 4.Devolver libro \n 5.Mostrar libros disponibles \n 6.Salir");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Escribe el titulo del libro");
                String ti = sc.nextLine();
                sc.nextLine();
                System.out.println("Escribe el autor del libro");
                String au = sc.nextLine();
                biblioteca.add(new bibliotecaCarlosCid(ti, au));
                break;
        
            default:
                break;
        }
    }
}
