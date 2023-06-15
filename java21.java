import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class java21 extends JFrame {
    private JScrollBar redScrollBar;
    private JScrollBar greenScrollBar;
    private JScrollBar blueScrollBar;
    private JPanel colorPanel;

    public java21() {
        setTitle("RGB Color Picker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        redScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 255);
        greenScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 255);
        blueScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 255);

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.BLACK);

        AdjustmentListener adjustmentListener = new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int red = redScrollBar.getValue();
                int green = greenScrollBar.getValue();
                int blue = blueScrollBar.getValue();

                Color selectedColor = new Color(red, green, blue);
                colorPanel.setBackground(selectedColor);
            }
        };

        redScrollBar.addAdjustmentListener(adjustmentListener);
        greenScrollBar.addAdjustmentListener(adjustmentListener);
        blueScrollBar.addAdjustmentListener(adjustmentListener);

        setLayout(new BorderLayout());
        add(redScrollBar, BorderLayout.NORTH);
        add(greenScrollBar, BorderLayout.CENTER);
        add(blueScrollBar, BorderLayout.SOUTH);
        add(colorPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                java21 colorPicker = new java21();
                colorPicker.setVisible(true);
                System.out.println("Aayush Bhattacharjee | 00190302021");
            }
        });
    }
}
