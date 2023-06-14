import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class java15 extends JFrame implements ActionListener {
    private JLabel label;

    public java15() {

        setTitle("Event Handling Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        label = new JLabel("Click the button!");
        add(label);

        JButton button = new JButton("Click me!");
        button.addActionListener(this);
        add(button);

        setLayout(new java.awt.FlowLayout());
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button clicked! \n Aayush Bhattacharjee | 00190302021");
    }

    public static void main(String[] args) {
        java15 demo = new java15();
        demo.setVisible(true);
    }
}
