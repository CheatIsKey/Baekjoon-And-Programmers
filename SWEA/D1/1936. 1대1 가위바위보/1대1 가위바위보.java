import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        switch (A) {
            case 1:
                switch (B) {
                    case 2:
                        System.out.println("B");
                        break;
                    case 3:
                        System.out.println("A");
                        break;
                    default:
                        System.out.println("무승부는 존재하지 않습니다.");
                }
            break;
            case 2:
                switch (B) {
                    case 1:
                        System.out.println("A");
                        break;
                    case 3:
                        System.out.println("B");
                        break;
                    default:
                        System.out.println("무승부는 존재하지 않습니다.");
                }
            break;
            case 3:
                switch (B) {
                    case 1:
                        System.out.println("B");
                        break;
                    case 2:
                        System.out.println("A");
                        break;
                    default:
                        System.out.println("무승부는 존재하지 않습니다.");
                }
             break;
            default:
                System.out.println("유효하지 않는 입력입니다.");
        }
    }
}