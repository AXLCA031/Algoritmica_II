import java.util.Scanner;

class Alumno {
    private String codigo;
    private String nombre;
    private double promedioFinal;

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el código del alumno: ");
        codigo = sc.nextLine();
        System.out.print("Ingrese el nombre del alumno: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el promedio final del alumno: ");
        promedioFinal = sc.nextDouble();
        sc.nextLine(); // Consumir el salto de línea pendiente
    }

    public void presentarDatos() {
        System.out.println("Código del alumno: " + codigo);
        System.out.println("Nombre del alumno: " + nombre);
        System.out.println("Promedio final del alumno: " + promedioFinal);
    }
}

public class ProgramaAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de alumnos: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente

        Alumno[] alumnos = new Alumno[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nIngresando datos del alumno " + (i + 1) + ":");
            alumnos[i] = new Alumno();
            alumnos[i].ingresarDatos();
        }

        System.out.println("\nPresentando datos de los alumnos:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nAlumno " + (i + 1) + ":");
            alumnos[i].presentarDatos();
        }
    }
}
