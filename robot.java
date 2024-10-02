import java.util.Scanner;

public class robot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți direcția inițială (N, S, E, V): ");
        char initial = scanner.next().charAt(0);
        System.out.print("Introduceți instrucțiunea (0 - continuă, 1 - la stânga, 2 - la dreapta): ");
        int instruction = scanner.nextInt();

        // Determinarea direcției finale
        char fDir= initial;

        switch (instruction) {
            case 0:
                // Continuă deplasarea în aceeași direcție
                break;
            case 1:
                // La stânga
                if (initial == 'N') {
                    fDir = 'V';
                } else if (initial == 'S') {
                    fDir = 'E';
                } else if (initial == 'E') {
                    fDir = 'N';
                } else if (initial == 'V') {
                    fDir= 'S';
                }
                break;
            case 2:
                // La dreapta
                if (initial == 'N') {
                    fDir = 'E';
                } else if (initial == 'S') {
                    fDir = 'V';
                } else if (initial == 'E') {
                    fDir = 'S';
                } else if (initial == 'V') {
                    fDir = 'N';
                }
                break;
            default:
                System.out.println("Instrucțiune invalidă!");
                break;
        }

        // Afișarea direcției finale
        System.out.println("Direcția finală a robotului este: " + fDir);
    }
}