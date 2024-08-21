import java.util.Scanner;

public class AsteriskFiguresForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int size;

        do {
            System.out.println("Elige una figura para imprimir:");
            System.out.println("1. Triángulo rectángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Pirámide");
            System.out.println("4. Salir");
            System.out.print("Ingresa tu elección (1-4): ");
            choice = scanner.nextInt();

            if (choice == 4) {
                break;
            }

            System.out.print("Ingresa el tamaño (número de asteriscos): ");
            size = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Triángulo rectángulo:");
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Cuadrado:");
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Pirámide:");
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size - i - 1; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 2 * i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Opción no válida, por favor elige nuevamente.");
            }

            System.out.println(); // Espacio entre ejecuciones
        } while (choice != 4);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
