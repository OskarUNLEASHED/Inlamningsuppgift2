package CharCounter2000;

//här så räknas characters och rows
public class CharacterCounter {
    private int totalCharactersBeforeStop = 0;
    private int rowCount = 0;
    //metoden för att behandla strings
    public boolean processInput(String inputString) {
        boolean stopFound = inputString.toLowerCase().contains("stop");
        //Kalkylerar värderna efter stop
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
    //metoden för att få det fylla resultatet
    public void displayResult() {
        System.out.println("Total characters before 'stop': " + totalCharactersBeforeStop);
        System.out.println("Total rows before 'stop': " + rowCount);
    }
    //getter metod för att få karaktärerna för test
    public int getTotalCharactersBeforeStop() {
        return totalCharactersBeforeStop;
    }

    public int getRowCount() {
        return rowCount;
    }
}
