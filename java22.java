import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class java22 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Create and configure the main window
        JFrame frame = new JFrame("Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2));

        // Create Swing components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTextField = new JTextField();
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);
        JLabel notificationLabel = new JLabel("Receive Notifications:");
        JCheckBox notificationCheckBox = new JCheckBox();
        JButton submitButton = new JButton("Submit");

        // Add components to the main window
        frame.add(nameLabel);
        frame.add(nameTextField);
        frame.add(genderLabel);
        frame.add(maleRadioButton);
        frame.add(new JLabel()); // Empty label to create space
        frame.add(femaleRadioButton);
        frame.add(notificationLabel);
        frame.add(notificationCheckBox);
        frame.add(new JLabel()); // Empty label to create space
        frame.add(submitButton);

        // Register an ActionListener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the entered information
                String name = nameTextField.getText();
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";
                boolean receiveNotifications = notificationCheckBox.isSelected();

                // Display a message box with the entered information
                String message = "Name: " + name + "\nGender: " + gender + "\nNotifications: " + receiveNotifications;
                JOptionPane.showMessageDialog(frame, message, "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Display the main window
        frame.setVisible(true);
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}
