import java.util.Scanner;

public class AsteriskFiguresDoWhile {
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
                    int i = 0;
                    while (i < size) {
                        int j = 0;
                        while (j <= i) {
                            System.out.print("*");
                            j++;
                        }
                        System.out.println();
                        i++;
                    }
                    break;

                case 2:
                    System.out.println("Cuadrado:");
                    i = 0;
                    while (i < size) {
                        int j = 0;
                        while (j < size) {
                            System.out.print("*");
                            j++;
                        }
                        System.out.println();
                        i++;
                    }
                    break;

                case 3:
                    System.out.println("Pirámide:");
                    i = 0;
                    while (i < size) {
                        int j = 0;
                        while (j < size - i - 1) {
                            System.out.print(" ");
                            j++;
                        }
                        j = 0;
                        while (j < 2 * i + 1) {
                            System.out.print("*");
                            j++;
                        }
                        System.out.println();
                        i++;
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
