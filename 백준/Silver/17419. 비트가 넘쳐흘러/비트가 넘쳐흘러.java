import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        int answer = 0;

        for (char c : arr) {
            if (c == '1') answer++;
        }

        System.out.println(answer);
    }
}

