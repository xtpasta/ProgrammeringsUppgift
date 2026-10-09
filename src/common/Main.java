package common;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        TextCounter counter = new TextCounter();

        boolean nextLine = true;

        while (nextLine) {
            String line = scanner.nextLine();
            nextLine = counter.AddLine(line);
        }

        System.out.println("Antal rader: " + counter.getLineCount());
        System.out.println("Antal tecken: " + counter.getCharacterCount());

        scanner.close();
    }
}
