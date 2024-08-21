public class AsteriskFigures {
    public static void main(String[] args) {
        int i = 0;
        int j;

        // Triángulo rectángulo
        System.out.println("Triángulo rectángulo:");
        while (i < 5) {
            j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println(); // Espacio entre figuras

        // Cuadrado
        System.out.println("Cuadrado:");
        i = 0; // Reiniciamos i
        while (i < 5) {
            j = 0;
            while (j < 5) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println(); // Espacio entre figuras

        // Pirámide
        System.out.println("Pirámide:");
        i = 0; // Reiniciamos i
        while (i < 5) {
            j = 0;
            while (j < 5 - i - 1) {
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
    }
}
