package CharCounter2000;

public class CharacterCounter {
    private int totalCharactersBeforeStop = 0;
    private int rowCount = 0;

    public boolean processInput(String inputString) {
        boolean stopFound = inputString.toLowerCase().contains("stop");

        if (stopFound) {
            int stopIndex = inputString.toLowerCase().indexOf("stop");
            int charactersBeforeStop = stopIndex != -1 ? stopIndex : inputString.length();

            totalCharactersBeforeStop += charactersBeforeStop;
            rowCount++;
            System.out.println("Characters before 'stop' in this line: " + charactersBeforeStop);
        } else {
            totalCharactersBeforeStop += inputString.length();
            rowCount++;
        }

        return stopFound;
    }

    public void displayResult() {
        System.out.println("Total characters before 'stop': " + totalCharactersBeforeStop);
        System.out.println("Total rows before 'stop': " + rowCount);
    }

    public int getTotalCharactersBeforeStop() {
        return totalCharactersBeforeStop;
    }

    public int getRowCount() {
        return rowCount;
    }
}
