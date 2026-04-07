import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static final char[][] KEYBOARD = {{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'},
            {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'},
            {'z', 'x', 'c', 'v', 'b', 'n', 'm'}};
    static final char[] CONSONANT = {'q', 'w', 'e', 'r', 't', 'a', 's', 'd', 'f', 'g', 'z', 'x', 'c', 'v'};
    static final char[] VOWEL = {'y', 'u', 'i', 'o', 'p', 'h', 'j', 'k', 'l', 'b', 'n', 'm'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        char left = st.nextToken().charAt(0);
        char right = st.nextToken().charAt(0);

        int[] curLeft = extractPos(left);
        int[] curRight = extractPos(right);

        int answer = 0;

        String word = br.readLine();
        for (char c : word.toCharArray()) {
            int[] targetPos = extractPos(c);
            boolean isLeft = false;

            for (char isConsonant : CONSONANT) {
                if (c == isConsonant) {
                    isLeft = true;
                    break;
                }
            }

            if (isLeft) {
                int dist = Math.abs(targetPos[0] - curLeft[0]) + Math.abs(targetPos[1] - curLeft[1]);
                answer += dist + 1;
                curLeft = targetPos;
            } else {
                int dist = Math.abs(targetPos[0] - curRight[0]) + Math.abs(targetPos[1] - curRight[1]);
                answer += dist + 1;
                curRight = targetPos;
            }
        }

        System.out.println(answer);
    }

    private static int[] extractPos(char key) {
        for (int r = 0; r < KEYBOARD.length; r++) {
            for (int c = 0; c < KEYBOARD[r].length; c++) {
                if (KEYBOARD[r][c] == key) {
                    return new int[]{r, c};
                }
            }
        }
        return null;
    }
}

