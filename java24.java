import java.sql.*;
import java.util.*;

public class java24 {
    public static void main(String[] args) {
        Statement st;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3309/college", "root", "root");
            System.out.println("connected");
            Scanner s = new Scanner(System.in);
            String coursename = s.nextLine();
            String section = s.nextLine();
            int coursecode = s.nextInt();
            st = con.createStatement();
            st.executeUpdate("INSERT INTO STUDENT VALUES('" + coursecode + "','" + coursename + "','" + section + "')");
            ResultSet r = st.executeQuery("SELECT * FROM STUDENT");
            while (r.next()) {
                System.out.print(r.getInt(1) + " " + r.getString(2) + " " + r.getString(3) + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Aayush Bhattacharjee | 00190302021");
        }
    }
}
