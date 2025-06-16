package FileEnhancement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Shruti_Sugandhi\\Shruti-WS\\Preparation-Material\\Study-Material\\PraticeFileJava.txt");

        Path returnedPath = Files.writeString(path, "Started writing in practice file\n" +
                                                    "Java 11 introduced several useful enhancements \nto the String class.\nThis can be particularly useful for processing \n multi-line input or logs"
        );

        String fileData = Files.readString(path);

        System.out.println(fileData);
        System.out.println(returnedPath);


    }
}
