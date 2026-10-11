package common;

public class TextCounter {
    private int lineCount = 0;
    private int characterCount = 0;
    private int wordCount = 0;
    private String longestWord = "";

    public boolean addLine(String line) {
        if (line.equals("stop")) {
            return false;
        }

        lineCount++;
        characterCount += line.length();

        //Tar bort mellanslag i början och slutet av Stringen
        String trimmedLine = line.trim();

        String[] words = trimmedLine.split("\\s+");

        //Räknar ord
        if(!line.isEmpty()){
            wordCount += words.length;
        }

        //Tar fram det längsta ordet
        for(String word:words){
            if (word.length() > longestWord.length()){
                longestWord = word;
            }
        }

        return true;
    }

    public int getLineCount(){
        return lineCount;
    }

    public int getCharacterCount(){
        return characterCount;
    }

    public int getWordCount(){
        return wordCount;
    }

    public String getLongestWord(){
        return longestWord;
    }
}
