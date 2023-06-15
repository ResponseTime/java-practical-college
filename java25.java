import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class java25 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(600, 600);
        jf.setLayout(null);
        Statement st;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3309/college", "root", "root");
            System.out.println("connected");
            st = con.createStatement();
            ResultSet r = st.executeQuery("SELECT * FROM STUDENT");
            int i = 0;
            int j = 0;
            while (r.next()) {
                JTextArea jl = new JTextArea(r.getInt(1) + " " + r.getString(2) + " " + r.getString(3) + "\n");
                jl.setBounds(j, i, 100, 100);
                jl.setLineWrap(true);
                jf.add(jl);
                jf.setVisible(true);
                i += 100;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Aayush Bhattacharjee | 00190302021");
            jf.setVisible(true);
        }

    }
}
