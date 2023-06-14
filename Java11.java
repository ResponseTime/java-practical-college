import java.io.BufferedReader;
import java.io.FileReader;

public class Java11 {
    public static void main(String[] args) {
        FileReader r = new FileReader("Does_not_exist.txt");
        BufferedReader fileInput = new BufferedReader(r);

        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        fileInput.close();
    }
}
