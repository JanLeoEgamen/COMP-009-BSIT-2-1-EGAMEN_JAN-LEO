import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;


//Base class for handling music playback
class Music {
 protected File musicFile;

 public Music(File musicFile) {
     this.musicFile = musicFile;
 }

 // Method to play the music
 public void play() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
     // Open the audio stream from the specified music file
     AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
     // Obtain a Clip to play the audio
     Clip clip = AudioSystem.getClip();
     clip.open(audioStream);

     Scanner scanner = new Scanner(System.in);
     int response = 0;
     // Music playback control loop
     while (response != 4) {
         System.out.println("1 - Play");
         System.out.println("2 - Restart");
         System.out.println("3 - Stop");
         System.out.println("4 - Exit");
         System.out.println("Enter Choice: ");
         response = scanner.nextInt();

         switch (response) {
             case 1:
                 clip.start(); // Start playing the clip
                 break;
             case 2:
                 clip.setFramePosition(0); // Restart the clip from the beginning
                 break;
             case 3:
                 clip.stop(); // Stop the clip
                 break;
             case 4:
                 // Do not close the clip here; exit loop to return to main menu
                 break;
             default:
                 System.out.println("You've entered an invalid number");
                 break;
         }
     }
 }
}
