import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {
    private MoodAnalyser analyser;
    @Test
    public void message_WhenSad_MustReturn_Sad() {
        analyser = new MoodAnalyser("I am in SAD Mood");
        assertEquals("SAD", analyser.analyzeMessage());
    }

    @Test
    public void message_WhenNotSad_MustReturn_Happy() {
        analyser = new MoodAnalyser("I am a Any Mood");
        assertEquals("HAPPY", analyser.analyzeMessage());
    }
    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyzeMessage();
        assertEquals("HAPPY", mood);
    }
}
