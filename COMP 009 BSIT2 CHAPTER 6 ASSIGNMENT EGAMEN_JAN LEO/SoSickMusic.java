import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

// Derived class representing a specific music type (So Sick)
class SoSickMusic extends Music {
    public SoSickMusic(File musicFile) {
        super(musicFile);
    }

    // Override the play method to specify behavior for So Sick music
    @Override
    public void play() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        System.out.println("Now playing So Sick...");
        super.play(); // Call base class play method to control playback
    }
}
