import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();

        char[] bulbs = new char[N.length() + 1];

        for (int i = 1; i < bulbs.length; i++) {
            bulbs[i] = N.charAt(i - 1);
        }

        int count = 0;

        for (int i = 1; i < bulbs.length; i++) {
            if (bulbs[i] == 'Y') {
                count++;

                for (int j = i; j < bulbs.length; j += i) {
                    bulbs[j] = (bulbs[j] == 'N') ? 'Y' : 'N';
                }
            }
        }

        for (int i = 1; i < bulbs.length; i++) {
            if (bulbs[i] == 'Y') {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(count);
    }
}


