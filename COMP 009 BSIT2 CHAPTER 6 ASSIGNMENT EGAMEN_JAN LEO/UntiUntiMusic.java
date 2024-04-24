import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

//Derived class representing a specific music type (Unti-unti)
class UntiUntiMusic extends Music {
 public UntiUntiMusic(File musicFile) {
     super(musicFile);
 }

 // Override the play method to specify behavior for Unti-unti music
 @Override
 public void play() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
     System.out.println("Now playing Unti-unti...");
     super.play(); // Call base class play method to control playback
 }
}
