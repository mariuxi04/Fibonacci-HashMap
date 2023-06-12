import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Calcular Fibonacci");;
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el número para calcular Fibonacci: ");
                    int numFibonacci = scanner.nextInt();
                    System.out.println("Fibonacci(" + numFibonacci + "): " + Fibonacci.calcularFibonacci(numFibonacci));
                    Fibonacci.mostrarSerieFibonacci();
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
                    break;
            }
        }
    }
}


