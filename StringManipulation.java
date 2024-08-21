import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        String continueInput;

        do {
            System.out.print("Ingresa una palabra: ");
            word = scanner.next();

            // Convertir la palabra a mayúsculas
            String upperCaseWord = word.toUpperCase();
            System.out.println("La palabra en mayúsculas es: " + upperCaseWord);

            System.out.print("¿Deseas ingresar otra palabra? (sí/no): ");
            continueInput = scanner.next();

        } while (continueInput.equalsIgnoreCase("sí") || continueInput.equalsIgnoreCase("si"));

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
