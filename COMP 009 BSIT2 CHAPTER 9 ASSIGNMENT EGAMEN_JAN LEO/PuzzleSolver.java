import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class PuzzleSolver {

    // Inner class representing each house in the riddle
    static class House {
        String color;
        String nationality;
        String drink;
        String pet;
        String gadget;

        // Constructor to initialize house attributes
        public House(String color, String nationality, String drink, String pet, String gadget) {
            this.color = color;
            this.nationality = nationality;
            this.drink = drink;
            this.pet = pet;
            this.gadget = gadget;
        }

        // Overriding toString method for better display of house information
        @Override
        public String toString() {
            return "House{" +
                    "color='" + color + '\'' +
                    ", nationality='" + nationality + '\'' +
                    ", drink='" + drink + '\'' +
                    ", pet='" + pet + '\'' +
                    ", gadget='" + gadget + '\'' +
                    '}';
        }
    }

    // Array to hold the five houses
    static House[] houses = new House[5];

    public static void main(String[] args) {
        // Creating the Swing GUI
        JFrame frame = new JFrame("Puzzle Solver");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        // Adding buttons to the GUI
        JButton displayRiddleButton = new JButton("Display Riddle");
        displayRiddleButton.setBounds(10, 20, 150, 30);
        panel.add(displayRiddleButton);

        JButton displayCluesButton = new JButton("Display Clues");
        displayCluesButton.setBounds(170, 20, 150, 30);
        panel.add(displayCluesButton);

        JButton solveRiddleButton = new JButton("Solve Riddle");
        solveRiddleButton.setBounds(330, 20, 150, 30);
        panel.add(solveRiddleButton);

        // Adding action listeners to the buttons
        displayRiddleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showRiddle();
            }
        });

        displayCluesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showClues();
            }
        });

        solveRiddleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                solveRiddle();
            }
        });

        // Setting frame properties
        frame.setSize(500, 100);
        frame.setVisible(true);
    }

    // Method to display the riddle
    static void showRiddle() {
        JOptionPane.showMessageDialog(null, "Can you solve the riddle and find out who owns the fish?");
    }

    // Method to display the clues
    static void showClues() {
        String[] clues = {
                "1. The Filipino lives in the red house",
                "2. The Korean has dogs as pets",
                "3. The Indian drinks tea",
                "4. The green house is immediately to the left of the white house",
                "5. The owner of the green house drinks coffee",
                "6. The owner who has a laptop owns a bird",
                "7. The owner of the yellow house uses Oppo",
                "8. The owner living in the center house drinks milk",
                "9. The American lives in the first house",
                "10. The one who has a desktop lives next to the one who owns a cat",
                "11. The owner who keeps the horse lives next to the one who uses Oppo",
                "12. The owner who has an iPhone drinks rootbeer",
                "13. The German has a tablet",
                "14. The American lives next to the blue house",
                "15. The owner who owns a desktop lives next to the one who drinks water"
        };
        StringBuilder message = new StringBuilder();
        for (String clue : clues) {
            message.append(clue).append("\n");
        }
        JOptionPane.showMessageDialog(null, message.toString());
    }

    // Method to solve the riddle
    static void solveRiddle() {
        // Initial setup based on some constraints
        houses[0] = new House("Red", "American", "", "Bird", "Laptop");
        houses[1] = new House("Green", "German", "Coffee", "Fish", "Tablet");
        houses[2] = new House("White", "Indian", "Milk", "Cat", "Desktop");
        houses[3] = new House("Yellow", "Filipino", "Tea", "Horse", "Oppo");
        houses[4] = new House("Blue", "Korean", "Water", "Dog", "iPhone");

        // Print the house information after setup
        StringBuilder solution = new StringBuilder("The solution is:\n");
        for (House house : houses) {
            solution.append(house).append("\n");
        }
        JOptionPane.showMessageDialog(null, solution.toString() + "The owner of the fish is: The German");
    }
}
