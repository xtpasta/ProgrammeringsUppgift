package common;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
