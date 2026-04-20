import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        Map<Character, Set<String>> cards = new HashMap<>();
        cards.put('P', new HashSet<>());
        cards.put('K', new HashSet<>());
        cards.put('H', new HashSet<>());
        cards.put('T', new HashSet<>());

        for (int i = 0; i < s.length(); i += 3) {
            char type = s.charAt(i);
            String number = s.substring(i + 1, i + 3);

            if (cards.get(type).contains(number)) {
                System.out.println("GRESKA");
                return;
            }

            cards.get(type).add(number);
        }

        char[] types = {'P', 'K', 'H', 'T'};
        for (char type : types) {
            sb.append(13 - cards.get(type).size()).append(' ');
        }

        System.out.println(sb);
    }
}

