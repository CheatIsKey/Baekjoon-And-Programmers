import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String maxWord = "";
        int maxLength = -1;

        outer:
        while (true) {
            String line = br.readLine();
            if (line == null) break;

            StringTokenizer st = new StringTokenizer(line, " ~!@#$%^&*()_+`={}|[]\\:\";'<>?,./");

            while (st.hasMoreTokens()) {
                String word = st.nextToken();

                if (word.equals("E-N-D")) {
                    break outer;
                }

                if (word.length() > maxLength) {
                    maxLength = word.length();
                    maxWord = word;
                }
            }
        }

        System.out.println(maxWord.toLowerCase());
    }
}