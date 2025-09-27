import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            System.out.println("=== Calculadora de Calificaciones ===");
            System.out.println("Ingrese el nombre del estudiante: ");

            String nombre = teclado.nextLine();

            // Tipos de datos numéricos
            double nota1, nota2, nota3;

            System.out.println("Ingrese la primera nota: ");
            nota1 = teclado.nextDouble();

            System.out.println("Ingrese la segunda nota: ");
            nota2 = teclado.nextDouble();

            System.out.println("Ingrese la tercer nota: ");
            nota3 = teclado.nextDouble();

            double promedio = (nota1 + nota2 + nota3) / 3;

            System.out.println("\nEstudiante: " + nombre);
            System.out.println("Promedio: " + promedio);

            // Condicional
            if (promedio >= 7) {
                System.out.println("Resultado: Aprobado ✅");
            }else {
                System.out.println("Resultado: Desaprobado ❌");
            }

            teclado.nextLine(); // limpiar buffer

            System.out.println("\n¿Desea ingresar otro estudiante? (s/n): ");
            String opcion = teclado.nextLine();

            if (!opcion.equalsIgnoreCase("s")) {
                continuar = false;
            }

        }

        // acá ya no se usa más el scanner (fuera del while)
        System.out.println("Programa finalizado.");
        teclado.close();


    }
}
