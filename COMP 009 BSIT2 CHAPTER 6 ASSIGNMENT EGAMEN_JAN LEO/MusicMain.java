import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class MusicMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        // Define file paths for different music tracks
        File untiunti = new File("C:\\Users\\Jan Leo Egamen\\eclipse-workspace\\EXERCISES\\src\\unti_unti.wav");
        File happiness = new File("C:\\Users\\Jan Leo Egamen\\eclipse-workspace\\EXERCISES\\src\\happ.wav");
        File sosick = new File("C:\\Users\\Jan Leo Egamen\\eclipse-workspace\\EXERCISES\\src\\so_sick.wav");

        int musicChoice;
        do {
            // Display menu for music selection
            System.out.println("Music Player");
            System.out.println("1 - Unti-unti");
            System.out.println("2 - So Sick");
            System.out.println("3 - Happiness");
            System.out.println("4 - Exit");
            System.out.println("Enter choice: ");
            musicChoice = scanner.nextInt();

            Music selectedMusic = null;
            switch (musicChoice) {
                case 1:
                    selectedMusic = new UntiUntiMusic(untiunti);
                    break;
                case 2:
                    selectedMusic = new SoSickMusic(sosick);
                    break;
                case 3:
                    selectedMusic = new HappinessMusic(happiness);
                    break;
                case 4:
                    System.exit(0); // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            // If a music selection was made, play the selected music
            if (selectedMusic != null) {
                try {
                    selectedMusic.play(); // Invoke polymorphic play method
                } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
                    System.out.println("Error playing music: " + e.getMessage());
                }
            }
        } while (musicChoice != 4); // Repeat until user chooses to exit
    }
}
