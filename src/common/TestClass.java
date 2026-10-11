package common;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void lineCountTest(){
        TextCounter counter = new TextCounter();

        counter.addLine("Hej");
        counter.addLine("Hallå där");
        counter.addLine("Rad tre");

        assertEquals(3, counter.getLineCount());
    }

    @Test
    public void stopTest(){
        TextCounter counter = new TextCounter();

        counter.addLine("En simpel rad");
        counter.addLine("stop");

        assertEquals(1, counter.getLineCount());
        assertEquals(13, counter.getCharacterCount());
    }

    @Test
    public void longestWordTest(){
        TextCounter counter = new TextCounter();

        counter.addLine("katt hund krokodil mullvad");

        assertEquals("krokodil", counter.getLongestWord());
    }

    @Test
    public void wordCountTest(){
        TextCounter counter = new TextCounter();

        counter.addLine("ett två tre fyra fem");
        counter.addLine("sex sju åtta nio");

        assertEquals(9, counter.getWordCount());
    }
}
