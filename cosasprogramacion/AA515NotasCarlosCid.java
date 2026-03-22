package cosasprogramacion;
import java.util.Scanner;
public class AA515NotasCarlosCid {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] notas = new int[5][3];
    int numAlumnos = 5;
    int numTrimestres = 3;
    for (int i = 0; i < numAlumnos; i++) {
        for (int j = 0; j < numTrimestres; j++) {
            System.out.print("Ingrese la nota entera del alumno " + (i + 1) + " para el trimestre " + (j + 1) + ": ");
            notas[i][j] = sc.nextInt();
        }
    }
    System.out.println("Medias del Grupo por Trimestre");
    for (int j = 0; j < numTrimestres; j++) {
        double sumaTrimestre = 0;
        for (int i = 0; i < numAlumnos; i++) {
            sumaTrimestre += notas[i][j];
        }
        double mediaTrimestre = sumaTrimestre / numAlumnos;
        System.out.println("La nota media del grupo en el trimestre " + (j + 1) + " es: " + mediaTrimestre);
    }
    System.out.println("Media de un Alumno Específico");
    int posicionAlumno = -1;
        while (posicionAlumno < 0 || posicionAlumno >= numAlumnos) {
        System.out.print("Ingrese la posición del alumno a consultar (0-" + (numAlumnos - 1) + "): ");
        posicionAlumno = sc.nextInt();
    }
    double sumaAlumno = 0;
    for (int j = 0; j < numTrimestres; j++) {
        sumaAlumno += notas[posicionAlumno][j];
    }
    double mediaAlumno = sumaAlumno / numTrimestres;
    System.out.println("La nota media del alumno en la posición " + posicionAlumno + " es: " + mediaAlumno);
    }
}