import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int lastNumber = 0;
        int countLeaf = 0;

        for (int i = 1; i < n; i++) {
            System.out.println(lastNumber + " " + i);

            countLeaf++;

            if (countLeaf < m) {
                if (m == 2) lastNumber = i;
            } else {
                lastNumber = i;
            }
        }
    }
}


