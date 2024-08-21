import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una oración: ");
        String sentence = scanner.nextLine();

        // Limpiar la oración: quitar espacios, puntuación y pasar a minúsculas
        String cleanedSentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Verificar si la oración es un palíndromo
        boolean isPalindrome = isPalindrome(cleanedSentence);

        if (isPalindrome) {
            System.out.println("La oración es un palíndromo.");
        } else {
            System.out.println("La oración no es un palíndromo.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
