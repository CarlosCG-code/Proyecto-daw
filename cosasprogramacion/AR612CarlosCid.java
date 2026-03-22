package cosasprogramacion;
import java.util.*;
public class AR612CarlosCid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;
        System.out.println("Escriba una palabra: ");
        palabra1 = sc.next();
        palabra1 = palabra1.toLowerCase();
        System.out.println("Escriba otra: ");
        palabra2 = sc.nextLine();
        palabra2 = palabra2.toLowerCase();
        if (palabra1.length() != palabra2.length()) {
            System.out.println("No son anagramas");
        } else {
            char p1[] = palabra1.toCharArray();
            char p2[] = palabra2.toCharArray();
            Arrays.sort(p1);
            Arrays.sort(p2);
            if (Arrays.equals(p1, p2)) {
                System.out.println("Son anagramas");
            } else {
                System.out.println("No son anagramas");
            }
        }
    }
}
