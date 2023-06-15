import javax.swing.*;
import java.awt.*;

public class java23 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(java23::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        // Create and configure the main window
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create Swing components
        JLabel northLabel = new JLabel("North");
        JLabel southLabel = new JLabel("South");
        JLabel eastLabel = new JLabel("East");
        JLabel westLabel = new JLabel("West");
        JLabel centerLabel = new JLabel("Center");

        // Set the layout manager to BorderLayout
        frame.setLayout(new BorderLayout());

        // Add components to the main window with specified positions
        frame.add(northLabel, BorderLayout.NORTH);
        frame.add(southLabel, BorderLayout.SOUTH);
        frame.add(eastLabel, BorderLayout.EAST);
        frame.add(westLabel, BorderLayout.WEST);
        frame.add(centerLabel, BorderLayout.CENTER);

        // Display the main window
        frame.setVisible(true);
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}
