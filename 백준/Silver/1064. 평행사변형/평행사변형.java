import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int xA = Integer.parseInt(st.nextToken());
        int yA = Integer.parseInt(st.nextToken());
        int xB = Integer.parseInt(st.nextToken());
        int yB = Integer.parseInt(st.nextToken());
        int xC = Integer.parseInt(st.nextToken());
        int yC = Integer.parseInt(st.nextToken());

        if ((yB - yA) * (xC - xB) == (yC - yB) * (xB - xA)) {
            System.out.println(-1.0);
            return;
        }

        double lineA = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
        double lineB = Math.sqrt(Math.pow(xC - xA, 2) + Math.pow(yC - yA, 2));
        double lineC = Math.sqrt(Math.pow(xC - xB, 2) + Math.pow(yC - yB, 2));

        double lengthA = 2 * (lineA + lineB);
        double lengthB = 2 * (lineA + lineC);
        double lengthC = 2 * (lineB + lineC);

        double maxLength = Math.max(lengthA, Math.max(lengthB, lengthC));
        double minLength = Math.min(lengthA, Math.min(lengthB, lengthC));

        System.out.println(maxLength - minLength);


    }
}


