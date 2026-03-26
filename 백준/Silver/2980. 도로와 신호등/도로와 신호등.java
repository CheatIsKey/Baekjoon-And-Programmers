import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int totalTime = 0;
        int pos = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int traffic = Integer.parseInt(st.nextToken());
            int red = Integer.parseInt(st.nextToken());
            int green = Integer.parseInt(st.nextToken());

            totalTime += (traffic - pos);
            pos = traffic;

            int cycle = red + green;
            int color = totalTime % cycle;

            if (color < red) {
                totalTime += (red - color);
            }
        }

        totalTime += (L - pos);

        System.out.println(totalTime);
    }
}

