package Exception;

import java.io.FileNotFoundException;

public class Exception6 {
        static String [] names = {"Williamson.pdf", "Finch.pdf", "Kohli.pdf", "Morgan.pdf"};
        public static void main(String[] args) {
            try {
                if (search("virat.pdf"))
                    System.out.println("FOUND");

            } catch(FileNotFoundException ex) {
                System.out.println("NOT FOUND");
            }
        }

        private static boolean search(String name) throws FileNotFoundException {
            for(int i = 0; i <= 4; i++) {
                if (names[i].equalsIgnoreCase(name)) {
                    return true;
                }
            }
            throw new FileNotFoundException();
        }
}
