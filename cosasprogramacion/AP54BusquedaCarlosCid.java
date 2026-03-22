public class AP54BusquedaCarlosCid {
    public static int buscar(int t[], int clave) {
        if (t == null) return -1;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(buscar(a, 3));
        System.out.println(buscar(a, 9));
        System.out.println(buscar(a, 7));
        System.out.println(buscar(a, 2));
        System.out.println(buscar(a, 5));
    }
}