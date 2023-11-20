package CharCounter2000;

import CharCounter2000.CharacterCounter;

import java.util.Scanner;

public class UserInputReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stopFound = false;

        CharacterCounter characterCounter = new CharacterCounter();

        while (!stopFound) {
            System.out.print("Enter a string (type 'stop' to exit): ");
            String inputString = scanner.nextLine();

            stopFound = characterCounter.processInput(inputString);

            if (stopFound) {
                characterCounter.displayResult();
            }
        }

        scanner.close();
    }
}

