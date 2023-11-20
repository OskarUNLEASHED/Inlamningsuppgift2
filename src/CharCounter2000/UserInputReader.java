package CharCounter2000;

import CharCounter2000.CharacterCounter;

import java.util.Scanner;
//Denna del läser av input och 'interacts' med CharacterCounter
public class UserInputReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //flaggan om stop har hittats
        boolean stopFound = false;

        CharacterCounter characterCounter = new CharacterCounter();
        //fortsätter läsa av tills 'stop' har upptäckts
        while (!stopFound) {
            System.out.print("Välkommen till CharacterCount200 (skriv 'stop' för att mata ut): ");
            String inputString = scanner.nextLine();

            stopFound = characterCounter.processInput(inputString);
            //Här så printas resultatet ut
            if (stopFound) {
                characterCounter.displayResult();
            }
        }

        scanner.close();
    }
}

