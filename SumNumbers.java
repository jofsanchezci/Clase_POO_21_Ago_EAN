import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        String continueInput;

        do {
            System.out.print("Ingresa un número: ");
            number = scanner.nextInt();
            sum += number;

            System.out.print("¿Deseas ingresar otro número? (sí/no): ");
            continueInput = scanner.next();

        } while (continueInput.equalsIgnoreCase("sí") || continueInput.equalsIgnoreCase("si"));

        System.out.println("La suma total de los números ingresados es: " + sum);
        scanner.close();
    }
}
