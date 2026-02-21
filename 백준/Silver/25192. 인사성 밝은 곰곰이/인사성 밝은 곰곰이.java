import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        int totalCnt = 0;

        for (int i = 0; i < N; i++) {
            String chat = br.readLine();

            if (chat.equals("ENTER")) {
                totalCnt += set.size();
                set.clear();
                continue;
            }

            set.add(chat);
        }

        totalCnt += set.size();

        System.out.println(totalCnt);
    }
}


