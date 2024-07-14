package OtherProgrammes;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class DemoFilePath {

    public static final String DOWNLOAD_DIR = "com/pcda/bvmcLogs";
    public static final Pattern FILENAME_PATTERN = Pattern.compile("^[a-zA-Z0-9._-]+$");


    public static void main(String[] args) {

        String filePath = "com/pcda/bvmcLogs/amitLogs.pdf/etc/passwd";
        String fileName = Paths.get(filePath).getFileName().toString();
        System.out.println("File Path >>>>>>>>>> "+fileName);


        // Validate the filename to prevent path traversal attacks
        if (!FILENAME_PATTERN.matcher(fileName).matches()) {
            System.out.println("Invalid File Name ");
        }

        // Construct the file path and ensure it's within the allowed directory
        Path filePath1 = Paths.get(DOWNLOAD_DIR).resolve(fileName).normalize();
        if (!filePath1.startsWith(Paths.get(DOWNLOAD_DIR).normalize())) {
            System.out.println("Invalid File Path  ");
        }

        File file = filePath1.toFile();
        if (!file.exists() || file.isDirectory()) {
            System.out.println("..................");
        }









    }

}
