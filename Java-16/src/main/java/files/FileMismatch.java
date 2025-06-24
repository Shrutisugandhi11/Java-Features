package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMismatch {
    public static void main(String[] args) {
        Path file1Path = Path.of("Java-16/src/main/java/files/File1.txt");
        Path file2Path = Path.of("Java-16/src/main/java/files/File2.txt");
        try {
            long mismatch = Files.mismatch(file1Path, file2Path);
            if (mismatch == -1) {
                System.out.println("✅ Files are identical.");
            } else {
                System.out.println("❌ Files differ. First mismatch at byte position: " + mismatch);
            }
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
    }

}
