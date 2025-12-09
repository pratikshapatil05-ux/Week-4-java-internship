import java.io.*;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        try {
            // Writing to a file
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Hello World\nWelcome to Java File Handling");
            writer.close();

            // Reading from a file
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
