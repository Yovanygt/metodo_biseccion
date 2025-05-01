import java.util.Scanner;

public class biseccion {


    public static double f(double x) {
        // Cambiar esta función para resolver la deseada
        return Math.pow(x, 3) - x - 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MÉTODO DE BISECCIÓN DINÁMICO\n");
        
        // Entrada de datos
        System.out.print("Ingrese el valor inicial a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor inicial b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese la tolerancia (por ejemplo 0.001): ");
        double tolerancia = scanner.nextDouble();

        double c = 0;
        int iteracion = 1;

        // Verificar que f(a) y f(b) tengan signos opuestos
        if (f(a) * f(b) >= 0) {
            System.out.println("\nNo se puede aplicar el método. f(a) y f(b) deben tener signos opuestos.");
            scanner.close();
            return;
        }

        // Encabezado de la tabla
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-12s | %-12s | %-12s | %-12s |\n", "Iteración", "a", "b", "c", "f(c)");
        System.out.println("--------------------------------------------------------------------------------");

        // Proceso iterativo
        do {
            c = (a + b) / 2;
            double fc = f(c);

            System.out.printf("| %-10d | %-12.6f | %-12.6f | %-12.6f | %-12.6f |\n", iteracion, a, b, c, fc);

            if (f(a) * fc < 0) {
                b = c;
            } else {
                a = c;
            }

            iteracion++;
        } while ((b - a) / 2 > tolerancia);

        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("\nLa raíz aproximada es: %.6f\n", c);

        scanner.close();
    }
}
