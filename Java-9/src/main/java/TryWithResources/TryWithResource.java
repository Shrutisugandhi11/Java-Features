package TryWithResources;

import java.io.*;

public class TryWithResource {
    public static void main(String[] args) {
        File fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new File("C:\\Users\\Shruti_Sugandhi\\Shruti-WS\\Preparation-Material\\Study-Material\\Multithreading");
            bufferedReader = new BufferedReader(new FileReader(fileReader));
        } catch (FileNotFoundException _) {
            System.out.println("Error reading file...");
            return;
        }
        try (bufferedReader) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException _) {
            System.out.println("Error encountered while reading.....");
        }
    }
}
