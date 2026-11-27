import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s1 = br.readLine();
        String s2 = br.readLine();

        if (s1.length() < s2.length()) {
            System.out.println("no");
            return;
        }

        if (s1.contains(s2)) {
            System.out.println("go");
            return;
        }

        System.out.println("no");
    }
}
