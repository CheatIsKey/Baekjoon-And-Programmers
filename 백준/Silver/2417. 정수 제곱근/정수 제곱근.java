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

        long start = 0;
        long end = 3037000500L;
        long result = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            BigInteger midBI = BigInteger.valueOf(mid);

            if (midBI.multiply(midBI).compareTo(N) >= 0) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(result);
    }
}


