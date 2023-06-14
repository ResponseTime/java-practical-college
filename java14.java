import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class java14 {
    public static void main(String[] args) throws Exception {
        File f = new File("demo.txt");
        BufferedReader reader = new BufferedReader(new FileReader(f));
        try {
            String k = reader.readLine();
            while (k != null) {
                System.out.println(k);
                k = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            reader.close();
            System.out.println("Aayush Bhattacharjee | 00190302021");
        }
    }
}
