package common;

public class TextCounter {
    private int lineCount = 0;
    private int characterCount = 0;

    public boolean AddLine(String line) {
        if (line.equals("stop")) {
            return false;
        }
        lineCount++;
        characterCount += line.length();
        return true;
    }

    public int getLineCount(){
        return lineCount;
    }

    public int getCharacterCount(){
        return characterCount;
    }
}
