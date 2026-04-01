import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            boolean flag = false;

            for (String str : set) {
                if (str.length() == s.length() && (str + str).contains(s)) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                set.add(s);
            }
        }

        System.out.println(set.size());
    }
}

