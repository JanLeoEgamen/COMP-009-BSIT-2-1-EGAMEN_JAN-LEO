import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

// Derived class representing a specific music type (Happiness)
class HappinessMusic extends Music {
    public HappinessMusic(File musicFile) {
        super(musicFile);
    }

    // Override the play method to specify behavior for Happiness music
    @Override
    public void play() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        System.out.println("Now playing Happiness...");
        super.play(); // Call base class play method to control playback
    }
}