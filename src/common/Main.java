package common;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        TextCounter counter = new TextCounter();

        System.out.println("Skriv stop för att avsluta programmet");

        boolean keepGoing = true;

        while (keepGoing) {
            String line = scanner.nextLine();
            keepGoing = counter.addLine(line);
        }

        System.out.println("Antalet rader: " + counter.getLineCount());
        System.out.println("Antalet tecken: " + counter.getCharacterCount());
        System.out.println("Antalet ord: " + counter.getWordCount());
        System.out.println("Längsta ordet är: " + counter.getLongestWord());

        scanner.close();
    }
}
