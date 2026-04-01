import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        BigInteger N = new BigInteger(br.readLine());

        BigInteger low = BigInteger.ONE;
        BigInteger high = N;

        while (low.compareTo(high) <= 0) {
            BigInteger mid = low.add(high).divide(BigInteger.valueOf(2));
            int compared = mid.multiply(mid).compareTo(N);

            if (compared == 0) {
                System.out.println(mid);
                return;
            } else if (compared < 0) {
                low = mid.add(BigInteger.ONE);
            } else if (compared > 0) {
                high = mid.subtract(BigInteger.ONE);
            }
        }
    }
}

