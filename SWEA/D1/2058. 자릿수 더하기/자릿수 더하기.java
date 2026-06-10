import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

//        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        for (char c : br.readLine().toCharArray()) {
            sum += c - '0';
        }

        System.out.println(sum);
    }
}